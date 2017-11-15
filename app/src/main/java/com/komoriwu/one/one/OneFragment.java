package com.komoriwu.one.one;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.komoriwu.one.R;
import com.komoriwu.one.base.MvpBaseFragment;
import com.komoriwu.one.main.MainActivity;
import com.komoriwu.one.model.bean.ContentListBean;
import com.komoriwu.one.model.bean.OneListBean;
import com.komoriwu.one.one.detail.ReadDetailActivity;
import com.komoriwu.one.one.mvp.OneContract;
import com.komoriwu.one.one.mvp.OnePresenter;
import com.komoriwu.one.utils.Constants;
import com.komoriwu.one.utils.Utils;
import com.komoriwu.one.widget.listener.HidingScrollBottomListener;
import com.komoriwu.one.widget.refresh.RefreshLayout;
import com.komoriwu.one.widget.refresh.SwipeRefreshLayoutDirection;

import org.reactivestreams.Publisher;

import butterknife.BindView;
import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Created by KomoriWu
 * on 2017/9/15.
 */

public class OneFragment extends MvpBaseFragment<OnePresenter> implements RefreshLayout.
        OnRefreshListener, OneContract.View, OneAdapter.OnItemClickListener {
    public static final String TAG = OneFragment.class.getSimpleName();
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh_layout)
    RefreshLayout refreshLayout;
    private LinearLayoutManager mLayoutManager;
    private OneAdapter mOneAdapter;
    private int mPage;
    private OneListBean mOneListBean;

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, null);
    }

    @Override
    public void init() {
        refreshLayout.setDirection(SwipeRefreshLayoutDirection.BOTH);
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setColorScheme(R.color.main_text_color, R.color.tv_hint,
                R.color.line_color);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        mOneAdapter = new OneAdapter(getActivity(), this);
        recyclerView.setAdapter(mOneAdapter);
        onRefresh(SwipeRefreshLayoutDirection.TOP);

        initListener();
    }

    private void initListener() {
        recyclerView.addOnScrollListener(new HidingScrollBottomListener() {
            @Override
            public void onHide() {
                ((MainActivity) getActivity()).changeRadioGState(false);
                ((MainActivity) getActivity()).setToolBarWeatherState(false);
            }

            @Override
            public void onShow() {
                ((MainActivity) getActivity()).changeRadioGState(true);
                ((MainActivity) getActivity()).setToolBarWeatherState(true);
            }

            @Override
            public void onUpdateDate() {
                Flowable.just(Utils.getCurrentViewIndex(mLayoutManager))
                        .flatMap(new Function<Integer, Publisher<String>>() {
                            @Override
                            public Publisher<String> apply(Integer integer) throws Exception {
                                Log.d(TAG, "pos:" + integer);
                                return Flowable.just(mOneAdapter.getDate(integer));
                            }
                        }).subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        ((MainActivity) getActivity()).setToolBarTitle(s);
                    }
                });

            }

        });
    }

    @Override
    public void showErrorMsg(String msg) {
        Log.d(TAG, msg);
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRefresh(SwipeRefreshLayoutDirection direction) {
        if (direction == SwipeRefreshLayoutDirection.TOP) {
            mPage = 0;
            refreshLayout.setDirection(SwipeRefreshLayoutDirection.BOTH);
        } else {
            mPage++;
        }
        presenter.loadOneList(mPage);
    }

    @Override
    public void refreshData(OneListBean oneListBean) {
        mOneListBean = oneListBean;
        mOneAdapter.addOneListData(oneListBean, mPage == 0);
        OneListBean.WeatherBean weatherBean = oneListBean.getWeather();

        if (mPage == 0) {
            ((MainActivity) getActivity()).setToolBarTitle(Utils.formatDate(oneListBean.getDate()));
            ((MainActivity) getActivity()).setToolBarWeather(weatherBean.getCityName() +
                    "  " + weatherBean.getClimate() + "  " + weatherBean.getTemperature() + "℃");
        }
    }

    @Override
    public void showRefresh() {
        refreshLayout.post(new Runnable() {
            @Override
            public void run() {
                refreshLayout.setRefreshing(true);
            }
        });
    }

    @Override
    public void hideRefresh() {
        refreshLayout.post(new Runnable() {
            @Override
            public void run() {
                refreshLayout.setRefreshing(false);
            }
        });
    }

    public void scrollToTop() {
        mLayoutManager.scrollToPositionWithOffset(0, 0);
        mLayoutManager.setStackFromEnd(true);
    }

    @Override
    public void onItemClick(int position) {
        ContentListBean contentListBean = mOneAdapter.getContentList().get(position);
        switch (Integer.parseInt(contentListBean.getCategory())) {
            case Constants.CATEGORY_REPORTER:
                ((MainActivity) getActivity()).showPopup(contentListBean);
                break;
            default:
                Intent intent = new Intent();
                intent.setClass(getActivity(), ReadDetailActivity.class);
                intent.putExtra(Constants.ONE_LIST_BEAN, contentListBean);
                startActivity(intent);
                break;
        }
    }

}

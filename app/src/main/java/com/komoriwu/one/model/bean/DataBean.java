package com.komoriwu.one.model.bean;

import java.io.Serializable;
import java.util.List;

public class DataBean implements Serializable {
    private String icon;
    private String actionUrl;
    private String text;
    private HeaderBean header;
    private ContentBean content;
    private String dataType;
    private int id;
    private String title;
    private String slogan;
    private String description;
    private ProviderBean provider;
    private String category;
    private AuthorBean author;
    private CoverBean cover;
    private String playUrl;
    private Object thumbPlayUrl;
    private int duration;
    private WebUrlBean webUrl;
    private long releaseTime;
    private String library;
    private ConsumptionBean consumption;
    private Object campaign;
    private Object waterMarks;
    private Object adTrack;
    private String type;
    private String titlePgc;
    private String descriptionPgc;
    private Object remark;
    private int idx;
    private Object shareAdTrack;
    private Object favoriteAdTrack;
    private Object webAdTrack;
    private long date;
    private Object promotion;
    private Object label;
    private String descriptionEditor;
    private boolean collected;
    private boolean played;
    private Object lastViewTime;
    private Object playlists;
    private Object src;
    private List<PlayInfoBean> playInfo;
    private List<TagsBean> tags;
    private List<?> labelList;
    private List<?> subtitles;
    private int count;
    private List<ItemListBean> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProviderBean getProvider() {
        return provider;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public CoverBean getCover() {
        return cover;
    }

    public void setCover(CoverBean cover) {
        this.cover = cover;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public Object getThumbPlayUrl() {
        return thumbPlayUrl;
    }

    public void setThumbPlayUrl(Object thumbPlayUrl) {
        this.thumbPlayUrl = thumbPlayUrl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public WebUrlBean getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(WebUrlBean webUrl) {
        this.webUrl = webUrl;
    }

    public long getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(long releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public ConsumptionBean getConsumption() {
        return consumption;
    }

    public void setConsumption(ConsumptionBean consumption) {
        this.consumption = consumption;
    }

    public Object getCampaign() {
        return campaign;
    }

    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public Object getWaterMarks() {
        return waterMarks;
    }

    public void setWaterMarks(Object waterMarks) {
        this.waterMarks = waterMarks;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitlePgc() {
        return titlePgc;
    }

    public void setTitlePgc(String titlePgc) {
        this.titlePgc = titlePgc;
    }

    public String getDescriptionPgc() {
        return descriptionPgc;
    }

    public void setDescriptionPgc(String descriptionPgc) {
        this.descriptionPgc = descriptionPgc;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Object getShareAdTrack() {
        return shareAdTrack;
    }

    public void setShareAdTrack(Object shareAdTrack) {
        this.shareAdTrack = shareAdTrack;
    }

    public Object getFavoriteAdTrack() {
        return favoriteAdTrack;
    }

    public void setFavoriteAdTrack(Object favoriteAdTrack) {
        this.favoriteAdTrack = favoriteAdTrack;
    }

    public Object getWebAdTrack() {
        return webAdTrack;
    }

    public void setWebAdTrack(Object webAdTrack) {
        this.webAdTrack = webAdTrack;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public String getDescriptionEditor() {
        return descriptionEditor;
    }

    public void setDescriptionEditor(String descriptionEditor) {
        this.descriptionEditor = descriptionEditor;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public Object getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Object lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    public Object getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Object playlists) {
        this.playlists = playlists;
    }

    public Object getSrc() {
        return src;
    }

    public void setSrc(Object src) {
        this.src = src;
    }

    public List<PlayInfoBean> getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(List<PlayInfoBean> playInfo) {
        this.playInfo = playInfo;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<?> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<?> labelList) {
        this.labelList = labelList;
    }

    public List<?> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<?> subtitles) {
        this.subtitles = subtitles;
    }

    public static class ProviderBean implements Serializable {
        /**
         * name : Vimeo
         * alias : vimeo
         * icon : http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png
         */

        private String name;
        private String alias;
        private String icon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class AuthorBean implements Serializable {
        /**
         * id : 2172
         * icon : http://img.kaiyanapp.com/8581b06aa17c7dbe8970e4c27bbdbd98.png?imageMogr2/quality/60/format/jpg
         * name : 开眼剧情精选
         * description : 用一个好故事，描绘生活的不可思议
         * link :
         * latestReleaseTime : 1512694803000
         * videoNum : 387
         * adTrack : null
         * follow : {"itemType":"author","itemId":2172,"followed":false}
         * shield : {"itemType":"author","itemId":2172,"shielded":false}
         * approvedNotReadyVideoCount : 0
         * ifPgc : true
         */

        private int id;
        private String icon;
        private String name;
        private String description;
        private String link;
        private long latestReleaseTime;
        private int videoNum;
        private Object adTrack;
        private FollowBean follow;
        private ShieldBean shield;
        private int approvedNotReadyVideoCount;
        private boolean ifPgc;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public long getLatestReleaseTime() {
            return latestReleaseTime;
        }

        public void setLatestReleaseTime(long latestReleaseTime) {
            this.latestReleaseTime = latestReleaseTime;
        }

        public int getVideoNum() {
            return videoNum;
        }

        public void setVideoNum(int videoNum) {
            this.videoNum = videoNum;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }

        public FollowBean getFollow() {
            return follow;
        }

        public void setFollow(FollowBean follow) {
            this.follow = follow;
        }

        public ShieldBean getShield() {
            return shield;
        }

        public void setShield(ShieldBean shield) {
            this.shield = shield;
        }

        public int getApprovedNotReadyVideoCount() {
            return approvedNotReadyVideoCount;
        }

        public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
            this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
        }

        public boolean isIfPgc() {
            return ifPgc;
        }

        public void setIfPgc(boolean ifPgc) {
            this.ifPgc = ifPgc;
        }

        public static class FollowBean implements Serializable {
            /**
             * itemType : author
             * itemId : 2172
             * followed : false
             */

            private String itemType;
            private int itemId;
            private boolean followed;

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }
        }

        public static class ShieldBean implements Serializable {
            /**
             * itemType : author
             * itemId : 2172
             * shielded : false
             */

            private String itemType;
            private int itemId;
            private boolean shielded;

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public boolean isShielded() {
                return shielded;
            }

            public void setShielded(boolean shielded) {
                this.shielded = shielded;
            }
        }
    }

    public static class CoverBean implements Serializable {
        /**
         * feed : http://img.kaiyanapp.com/73a0140612ff540685060d16f60e057c.jpeg?imageMogr2/quality/60/format/jpg
         * detail : http://img.kaiyanapp.com/73a0140612ff540685060d16f60e057c.jpeg?imageMogr2/quality/60/format/jpg
         * blurred : http://img.kaiyanapp.com/df009ad5f5cc4463c9f131d7630e083c.jpeg?imageMogr2/quality/60/format/jpg
         * sharing : null
         * homepage : http://img.kaiyanapp.com/73a0140612ff540685060d16f60e057c.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
         */

        private String feed;
        private String detail;
        private String blurred;
        private Object sharing;
        private String homepage;

        public String getFeed() {
            return feed;
        }

        public void setFeed(String feed) {
            this.feed = feed;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getBlurred() {
            return blurred;
        }

        public void setBlurred(String blurred) {
            this.blurred = blurred;
        }

        public Object getSharing() {
            return sharing;
        }

        public void setSharing(Object sharing) {
            this.sharing = sharing;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }
    }

    public static class WebUrlBean implements Serializable {
        /**
         * raw : http://www.eyepetizer.net/detail.html?vid=24072
         * forWeibo : http://www.eyepetizer.net/detail.html?vid=24072
         */

        private String raw;
        private String forWeibo;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public String getForWeibo() {
            return forWeibo;
        }

        public void setForWeibo(String forWeibo) {
            this.forWeibo = forWeibo;
        }
    }

    public static class ConsumptionBean implements Serializable {
        /**
         * collectionCount : 1644
         * shareCount : 1542
         * replyCount : 53
         */

        private int collectionCount;
        private int shareCount;
        private int replyCount;

        public int getCollectionCount() {
            return collectionCount;
        }

        public void setCollectionCount(int collectionCount) {
            this.collectionCount = collectionCount;
        }

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }
    }

    public static class PlayInfoBean implements Serializable {
        /**
         * height : 270
         * width : 480
         * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=24072&editionType=low&source=aliyun","size":14147095},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=24072&editionType=low&source=qcloud","size":14147095},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=24072&editionType=low&source=ucloud","size":14147095}]
         * name : 流畅
         * type : low
         * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=24072&editionType=low&source=aliyun
         */

        private int height;
        private int width;
        private String name;
        private String type;
        private String url;
        private List<UrlListBean> urlList;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<UrlListBean> getUrlList() {
            return urlList;
        }

        public void setUrlList(List<UrlListBean> urlList) {
            this.urlList = urlList;
        }

        public static class UrlListBean implements Serializable {
            /**
             * name : aliyun
             * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=24072&editionType=low&source=aliyun
             * size : 14147095
             */

            private String name;
            private String url;
            private int size;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }
        }
    }

    public static class TagsBean implements Serializable {
        /**
         * id : 168
         * name : 讽刺
         * actionUrl : eyepetizer://tag/168/?title=%E8%AE%BD%E5%88%BA
         * adTrack : null
         * desc : null
         * bgPicture : http://img.kaiyanapp.com/a3de18fb448aa41a140f1901130c380a.png?imageMogr2/quality/60/format/jpg
         * headerImage : http://img.kaiyanapp.com/d536b9c09b2681630afcc92222599f0e.jpeg?imageMogr2/quality/100
         * tagRecType : NORMAL
         */

        private int id;
        private String name;
        private String actionUrl;
        private Object adTrack;
        private Object desc;
        private String bgPicture;
        private String headerImage;
        private String tagRecType;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getActionUrl() {
            return actionUrl;
        }

        public void setActionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }

        public Object getDesc() {
            return desc;
        }

        public void setDesc(Object desc) {
            this.desc = desc;
        }

        public String getBgPicture() {
            return bgPicture;
        }

        public void setBgPicture(String bgPicture) {
            this.bgPicture = bgPicture;
        }

        public String getHeaderImage() {
            return headerImage;
        }

        public void setHeaderImage(String headerImage) {
            this.headerImage = headerImage;
        }

        public String getTagRecType() {
            return tagRecType;
        }

        public void setTagRecType(String tagRecType) {
            this.tagRecType = tagRecType;
        }

    }
}
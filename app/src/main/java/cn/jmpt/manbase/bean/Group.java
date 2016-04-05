package cn.jmpt.manbase.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016-03-26.
 */
public class Group implements Serializable {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    private DataEntity data;

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public UserEntity getUser() {
        return user;
    }

    public DataEntity getData() {
        return data;
    }

    public static class UserEntity implements Serializable {
        private String member_type;
        private String login_status;
        private String login_status_msg;

        public void setMember_type(String member_type) {
            this.member_type = member_type;
        }

        public void setLogin_status(String login_status) {
            this.login_status = login_status;
        }

        public void setLogin_status_msg(String login_status_msg) {
            this.login_status_msg = login_status_msg;
        }

        public String getMember_type() {
            return member_type;
        }

        public String getLogin_status() {
            return login_status;
        }

        public String getLogin_status_msg() {
            return login_status_msg;
        }
    }

    public static class DataEntity implements Serializable {
        /**
         * collocation_id : 3046
         * big_image : http://im01.nanyibang.com/match/2016/03/26/1458991196_17176.jpg
         * width : 700
         * height : 1050
         * info : 牛仔夹克+休闲运动裤
         * tags : [{"tagId":8,"tagName":"韩版"},{"tagId":2,"tagName":"休闲"},{"tagId":3,"tagName":"潮流"}]
         * singleItems : [{"item_id":329250,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1LRZWLVXXXXb5XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"},{"item_id":338574,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1nRQeLpXXXXbwXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"},{"item_id":345782,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1L1IYLVXXXXbMXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"}]
         */

        private List<MatchEntity> match;
        /**
         * dress_school_id : 212
         * title : 春季发骚：我要把布洛克穿出花
         * info : 春季发骚：我要把布洛克穿出花
         * image : http://im01.nanyibang.com/school/2016/03/25/SCHOOL80834597.jpg
         * clickCount : 923
         * link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=school&school_id=212
         */

        private List<SchoolEntity> school;

        public void setMatch(List<MatchEntity> match) {
            this.match = match;
        }

        public void setSchool(List<SchoolEntity> school) {
            this.school = school;
        }

        public List<MatchEntity> getMatch() {
            return match;
        }

        public List<SchoolEntity> getSchool() {
            return school;
        }

        public static class MatchEntity implements Serializable {
            private int collocation_id;
            private String big_image;
            private int width;
            private int height;
            private String info;
            /**
             * tagId : 8
             * tagName : 韩版
             */

            private List<TagsEntity> tags;
            /**
             * item_id : 329250
             * pic_url : http://img03.taobaocdn.com/bao/uploaded/i3/TB1LRZWLVXXXXb5XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
             */

            private List<SingleItemsEntity> singleItems;

            public void setCollocation_id(int collocation_id) {
                this.collocation_id = collocation_id;
            }

            public void setBig_image(String big_image) {
                this.big_image = big_image;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public void setTags(List<TagsEntity> tags) {
                this.tags = tags;
            }

            public void setSingleItems(List<SingleItemsEntity> singleItems) {
                this.singleItems = singleItems;
            }

            public int getCollocation_id() {
                return collocation_id;
            }

            public String getBig_image() {
                return big_image;
            }

            public int getWidth() {
                return width;
            }

            public int getHeight() {
                return height;
            }

            public String getInfo() {
                return info;
            }

            public List<TagsEntity> getTags() {
                return tags;
            }

            public List<SingleItemsEntity> getSingleItems() {
                return singleItems;
            }

            public static class TagsEntity implements Serializable{
                private int tagId;
                private String tagName;

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public void setTagName(String tagName) {
                    this.tagName = tagName;
                }

                public int getTagId() {
                    return tagId;
                }

                public String getTagName() {
                    return tagName;
                }
            }

            public static class SingleItemsEntity implements Serializable{
                private int item_id;
                private String pic_url;

                public void setItem_id(int item_id) {
                    this.item_id = item_id;
                }

                public void setPic_url(String pic_url) {
                    this.pic_url = pic_url;
                }

                public int getItem_id() {
                    return item_id;
                }

                public String getPic_url() {
                    return pic_url;
                }
            }
        }

        public static class SchoolEntity implements Serializable{
            private int dress_school_id;
            private String title;
            private String info;
            private String image;
            private int clickCount;
            private String link;

            public void setDress_school_id(int dress_school_id) {
                this.dress_school_id = dress_school_id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setClickCount(int clickCount) {
                this.clickCount = clickCount;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public int getDress_school_id() {
                return dress_school_id;
            }

            public String getTitle() {
                return title;
            }

            public String getInfo() {
                return info;
            }

            public String getImage() {
                return image;
            }

            public int getClickCount() {
                return clickCount;
            }

            public String getLink() {
                return link;
            }
        }
    }
}

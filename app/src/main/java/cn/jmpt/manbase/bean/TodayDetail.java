package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-28.
 */
public class TodayDetail {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * collocation_id : 2521
     * big_image : http://im01.nanyibang.com/match/2016/01/11/1452507189_21497.jpg
     * long_info : 毛衣开上上面的立体图案，让毛衣开衫有了特色和个性，深蓝色的休闲裤搭配经典乐福鞋，显得自由舒适，同时也很时尚~
     * info : 【欧美时尚】时尚毛衣开衫搭配
     * width : 378
     * height : 700
     * saveCount : 220
     * tags : [{"tagId":7,"tagName":"欧美"},{"tagId":19,"tagName":"百搭"},{"tagId":2,"tagName":"休闲"}]
     * singleItems : [{"item_id":332837,"title":"viishow针织外套男 2015春秋线衫 抗起球翻领针织开衫图案毛衫","coupon_price":"99.00","price":"420.00","pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1R5tXMXXXXXboXVXXXXXXXXXX_!!0-item_pic.jpg_90x90.jpg","description":"上衣","isv_code":"0_2_match_19","pic_img":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1R5tXMXXXXXboXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"},{"item_id":288848,"title":"viishow欧美男装春夏休闲裤男 直筒裤修身长裤百搭男士休闲裤黑色","coupon_price":"119.00","price":"339.99","pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB19OM7LVXXXXXbapXXXXXXXXXX_!!0-item_pic.jpg_90x90.jpg","description":"裤子","isv_code":"0_2_match_19","pic_img":"http://img02.taobaocdn.com/bao/uploaded/i2/TB19OM7LVXXXXXbapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"},{"item_id":273525,"title":"秋季潮鞋2016新款真皮乐福鞋男士休闲鞋男鞋子英伦懒人鞋潮流板鞋","coupon_price":"288.00","price":"568.00","pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1IWVtHVXXXXbNXpXXXXXXXXXX_!!0-item_pic.jpg_90x90.jpg","description":"鞋子","isv_code":"0_2_match_19","pic_img":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1IWVtHVXXXXbNXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg"}]
     * addition : {"theme_name":"新功能推荐","theme_image":"","theme_desc":"你知道吗？【今天穿什么】功能可以根据所在地天气情况推荐穿衣哦。","theme_link":"nanyibang://page/WeatherMatchs"}
     */

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

    public static class UserEntity {
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

    public static class DataEntity {
        private int collocation_id;
        private String big_image;
        private String long_info;
        private String info;
        private int width;
        private int height;
        private int saveCount;
        /**
         * theme_name : 新功能推荐
         * theme_image :
         * theme_desc : 你知道吗？【今天穿什么】功能可以根据所在地天气情况推荐穿衣哦。
         * theme_link : nanyibang://page/WeatherMatchs
         */

        private AdditionEntity addition;
        /**
         * tagId : 7
         * tagName : 欧美
         */

        private List<TagsEntity> tags;
        /**
         * item_id : 332837
         * title : viishow针织外套男 2015春秋线衫 抗起球翻领针织开衫图案毛衫
         * coupon_price : 99.00
         * price : 420.00
         * pic_url : http://img04.taobaocdn.com/bao/uploaded/i4/TB1R5tXMXXXXXboXVXXXXXXXXXX_!!0-item_pic.jpg_90x90.jpg
         * description : 上衣
         * isv_code : 0_2_match_19
         * pic_img : http://img04.taobaocdn.com/bao/uploaded/i4/TB1R5tXMXXXXXboXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
         */

        private List<SingleItemsEntity> singleItems;

        public void setCollocation_id(int collocation_id) {
            this.collocation_id = collocation_id;
        }

        public void setBig_image(String big_image) {
            this.big_image = big_image;
        }

        public void setLong_info(String long_info) {
            this.long_info = long_info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setSaveCount(int saveCount) {
            this.saveCount = saveCount;
        }

        public void setAddition(AdditionEntity addition) {
            this.addition = addition;
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

        public String getLong_info() {
            return long_info;
        }

        public String getInfo() {
            return info;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getSaveCount() {
            return saveCount;
        }

        public AdditionEntity getAddition() {
            return addition;
        }

        public List<TagsEntity> getTags() {
            return tags;
        }

        public List<SingleItemsEntity> getSingleItems() {
            return singleItems;
        }

        public static class AdditionEntity {
            private String theme_name;
            private String theme_image;
            private String theme_desc;
            private String theme_link;

            public void setTheme_name(String theme_name) {
                this.theme_name = theme_name;
            }

            public void setTheme_image(String theme_image) {
                this.theme_image = theme_image;
            }

            public void setTheme_desc(String theme_desc) {
                this.theme_desc = theme_desc;
            }

            public void setTheme_link(String theme_link) {
                this.theme_link = theme_link;
            }

            public String getTheme_name() {
                return theme_name;
            }

            public String getTheme_image() {
                return theme_image;
            }

            public String getTheme_desc() {
                return theme_desc;
            }

            public String getTheme_link() {
                return theme_link;
            }
        }

        public static class TagsEntity {
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

        public static class SingleItemsEntity {
            private int item_id;
            private String title;
            private String coupon_price;
            private String price;
            private String pic_url;
            private String description;
            private String isv_code;
            private String pic_img;

            public void setItem_id(int item_id) {
                this.item_id = item_id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setCoupon_price(String coupon_price) {
                this.coupon_price = coupon_price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setIsv_code(String isv_code) {
                this.isv_code = isv_code;
            }

            public void setPic_img(String pic_img) {
                this.pic_img = pic_img;
            }

            public int getItem_id() {
                return item_id;
            }

            public String getTitle() {
                return title;
            }

            public String getCoupon_price() {
                return coupon_price;
            }

            public String getPrice() {
                return price;
            }

            public String getPic_url() {
                return pic_url;
            }

            public String getDescription() {
                return description;
            }

            public String getIsv_code() {
                return isv_code;
            }

            public String getPic_img() {
                return pic_img;
            }
        }
    }
}

package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleListProduct {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * _id : 340846
     * coupon_price : 29.90
     * title : 小清新2016夏季男士短袖T恤条纹圆领港风体恤半袖海魂衫潮流男装
     * pic_url : http://img03.taobaocdn.com/bao/uploaded/i3/TB10pI6LVXXXXacXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
     * isv_code : 0_2_danpin_19
     */

    private List<DataEntity> data;

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public UserEntity getUser() {
        return user;
    }

    public List<DataEntity> getData() {
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
        private int _id;
        private String coupon_price;
        private String title;
        private String pic_url;
        private String isv_code;

        public void set_id(int _id) {
            this._id = _id;
        }

        public void setCoupon_price(String coupon_price) {
            this.coupon_price = coupon_price;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public void setIsv_code(String isv_code) {
            this.isv_code = isv_code;
        }

        public int get_id() {
            return _id;
        }

        public String getCoupon_price() {
            return coupon_price;
        }

        public String getTitle() {
            return title;
        }

        public String getPic_url() {
            return pic_url;
        }

        public String getIsv_code() {
            return isv_code;
        }
    }
}

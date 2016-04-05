package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleProduct {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * item_id : 346463
     * _id : 346463
     * pic_url : http://img01.taobaocdn.com/bao/uploaded/i1/TB1YCwhHXXXXXcIXXXXXXXXXXXX_!!0-item_pic.jpg
     * title : NOT HOMME2015夏条纹男士7分袖圆领T恤 小清新海魂衫日系复古学院
     * coupon_price : 58.00
     * num_iid : 43829632052
     * open_iid : AAH5_kWCABuH20zjAKuyl_8R
     * productType : 2
     * isv_code : 0_2_tuiBig_19
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
        private int item_id;
        private int _id;
        private String pic_url;
        private String title;
        private String coupon_price;
        private String num_iid;
        private String open_iid;
        private int productType;
        private String isv_code;

        public void setItem_id(int item_id) {
            this.item_id = item_id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCoupon_price(String coupon_price) {
            this.coupon_price = coupon_price;
        }

        public void setNum_iid(String num_iid) {
            this.num_iid = num_iid;
        }

        public void setOpen_iid(String open_iid) {
            this.open_iid = open_iid;
        }

        public void setProductType(int productType) {
            this.productType = productType;
        }

        public void setIsv_code(String isv_code) {
            this.isv_code = isv_code;
        }

        public int getItem_id() {
            return item_id;
        }

        public int get_id() {
            return _id;
        }

        public String getPic_url() {
            return pic_url;
        }

        public String getTitle() {
            return title;
        }

        public String getCoupon_price() {
            return coupon_price;
        }

        public String getNum_iid() {
            return num_iid;
        }

        public String getOpen_iid() {
            return open_iid;
        }

        public int getProductType() {
            return productType;
        }

        public String getIsv_code() {
            return isv_code;
        }
    }
}

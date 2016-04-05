package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-29.
 */
public class Dayly {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * kind_id : 1
     * kind_icon : http://im01.nanyibang.com/icons/daily_ToothpasteToothbrush.png
     * kind_name : 牙膏&牙刷
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
        private int kind_id;
        private String kind_icon;
        private String kind_name;

        public void setKind_id(int kind_id) {
            this.kind_id = kind_id;
        }

        public void setKind_icon(String kind_icon) {
            this.kind_icon = kind_icon;
        }

        public void setKind_name(String kind_name) {
            this.kind_name = kind_name;
        }

        public int getKind_id() {
            return kind_id;
        }

        public String getKind_icon() {
            return kind_icon;
        }

        public String getKind_name() {
            return kind_name;
        }
    }
}

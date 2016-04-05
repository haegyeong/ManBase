package cn.jmpt.manbase.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016-03-26.
 */
public class Category implements Serializable{

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * theme_id : 239
     * type : 2
     * theme_name : 九分裤时髦穿搭术! 做春日里的长腿型男
     * theme_image : http://im01.nanyibang.com/school/2016/03/24/SCHOOL5557720.jpg
     * theme_desc :
     * theme_link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=theme&theme_id=239
     * allow_share : 0
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



    public static class UserEntity implements Serializable{
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

    public static class DataEntity implements Serializable{
        private int theme_id;
        private String type;
        private String theme_name;
        private String theme_image;
        private String theme_desc;
        private String theme_link;
        private int allow_share;

        public void setTheme_id(int theme_id) {
            this.theme_id = theme_id;
        }

        public void setType(String type) {
            this.type = type;
        }

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

        public void setAllow_share(int allow_share) {
            this.allow_share = allow_share;
        }

        public int getTheme_id() {
            return theme_id;
        }

        public String getType() {
            return type;
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

        public int getAllow_share() {
            return allow_share;
        }
    }
}

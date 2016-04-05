package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-04-01.
 */
public class SchoolComent {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * dress_school_id : 250
     * title : 型男应该必备的背心穿搭技巧
     * info : 夏日背心怎么穿？型男应该必备的背心穿搭技巧
     * image : http://im01.nanyibang.com/school/2016/04/01/SCHOOL251006395.jpg
     * clickCount : 2
     * link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=school&school_id=250
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

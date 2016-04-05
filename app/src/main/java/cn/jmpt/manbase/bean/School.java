package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-27.
 */
public class School {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * dress_school_id : 62
     * title : 男衣邦编辑部@你
     * info : 大家看一看 | 我们是认真地想付稿费
     * image : http://im01.nanyibang.com/school/2016/03/03/SCHOOL61693471.jpg
     * clickCount : 8842
     * link : http://www.nanyibang.com/utils/webpage_jump.php?module_type=school&school_id=62
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

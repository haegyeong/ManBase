package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-04-01.
 */
public class GroupJinXuan {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * collocation_id : 3813
     * big_image : http://im01.nanyibang.com/match/2016/03/31/1459415515_31147.jpg
     * info : 【春装上新】短款夹克+牛仔裤
     * collocation_type : 长袖衬衫+九/七分裤+腰带+靴子+手表
     * width : 476
     * height : 714
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
        private int collocation_id;
        private String big_image;
        private String info;
        private String collocation_type;
        private int width;
        private int height;

        public void setCollocation_id(int collocation_id) {
            this.collocation_id = collocation_id;
        }

        public void setBig_image(String big_image) {
            this.big_image = big_image;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void setCollocation_type(String collocation_type) {
            this.collocation_type = collocation_type;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getCollocation_id() {
            return collocation_id;
        }

        public String getBig_image() {
            return big_image;
        }

        public String getInfo() {
            return info;
        }

        public String getCollocation_type() {
            return collocation_type;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
}

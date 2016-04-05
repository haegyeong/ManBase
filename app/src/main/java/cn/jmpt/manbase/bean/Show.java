package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-27.
 */
public class Show {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * haokanme_id : 2688
     * image : http://im01.nanyibang.com/haokanme/2016/3/27/158707-35769-1459061810.jpg?hkbgcolor=303233
     * like_count : 0
     * member_id : 158707
     * create_time : 2016-03-27 14:56:56
     * comment :
     * comment_count : 0
     * head_pic : http://im01.nanyibang.com/head_picture/2016/3/27/79464-158707-0.jpg
     * nick_name : 忠孝两全！
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
        private int haokanme_id;
        private String image;
        private int like_count;
        private int member_id;
        private String create_time;
        private String comment;
        private int comment_count;
        private String head_pic;
        private String nick_name;

        public void setHaokanme_id(int haokanme_id) {
            this.haokanme_id = haokanme_id;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public void setMember_id(int member_id) {
            this.member_id = member_id;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public void setHead_pic(String head_pic) {
            this.head_pic = head_pic;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public int getHaokanme_id() {
            return haokanme_id;
        }

        public String getImage() {
            return image;
        }

        public int getLike_count() {
            return like_count;
        }

        public int getMember_id() {
            return member_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public String getComment() {
            return comment;
        }

        public int getComment_count() {
            return comment_count;
        }

        public String getHead_pic() {
            return head_pic;
        }

        public String getNick_name() {
            return nick_name;
        }
    }
}

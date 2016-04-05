package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-28.
 */
public class Comment {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * shop_name : viishow旗舰店
     * shop_score : {"service_score":"4.8","desc_score":"4.8","dispat_score":"4.8"}
     * comments : [{"name":"抽**雨","content":"质量差"},{"name":"欢**8","content":"V8服务很棒哦，衣服很好，很喜欢，下次还来"},{"name":"晓**廖","content":"衣服和想象的看起来有点差距"},{"name":"带**星","content":"的确是米黄色吧。材质的话能接受，洗了以后才知道好不好。衣角平的。??，不喜欢平的衣角来着。V6妹子，我又来夸你了。"},{"name":"情**5","content":"衣服不修身，底角是平的，其他的还可以"},{"name":"够**呛","content":"?衣服?真的?挺不错的"}]
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
        private String shop_name;
        /**
         * service_score : 4.8
         * desc_score : 4.8
         * dispat_score : 4.8
         */

        private ShopScoreEntity shop_score;
        /**
         * name : 抽**雨
         * content : 质量差
         */

        private List<CommentsEntity> comments;

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }

        public void setShop_score(ShopScoreEntity shop_score) {
            this.shop_score = shop_score;
        }

        public void setComments(List<CommentsEntity> comments) {
            this.comments = comments;
        }

        public String getShop_name() {
            return shop_name;
        }

        public ShopScoreEntity getShop_score() {
            return shop_score;
        }

        public List<CommentsEntity> getComments() {
            return comments;
        }

        public static class ShopScoreEntity {
            private String service_score;
            private String desc_score;
            private String dispat_score;

            public void setService_score(String service_score) {
                this.service_score = service_score;
            }

            public void setDesc_score(String desc_score) {
                this.desc_score = desc_score;
            }

            public void setDispat_score(String dispat_score) {
                this.dispat_score = dispat_score;
            }

            public String getService_score() {
                return service_score;
            }

            public String getDesc_score() {
                return desc_score;
            }

            public String getDispat_score() {
                return dispat_score;
            }
        }

        public static class CommentsEntity {
            private String name;
            private String content;

            public void setName(String name) {
                this.name = name;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getName() {
                return name;
            }

            public String getContent() {
                return content;
            }
        }
    }
}

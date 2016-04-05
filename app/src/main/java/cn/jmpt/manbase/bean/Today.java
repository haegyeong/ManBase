package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-27.
 */
public class Today {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * city_name : 深圳
     * weather_type : 晴
     * lowtemp : 12℃
     * hightemp : 20℃
     * match : {"collocation_id":3621,"big_image":"http://im01.nanyibang.com/match/2016/03/24/1458804397_94218.jpg","long_info":"针织衫内搭衬衫十分百搭，外面穿一件3D修身呢风衣温暖有型，英伦大翻领和隐藏式门襟简约韩范又成熟，下搭休闲小脚裤和皮鞋，日常、约会、职场都可以穿。","width":494,"height":854}
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
        private String city_name;
        private String weather_type;
        private String lowtemp;
        private String hightemp;
        /**
         * collocation_id : 3621
         * big_image : http://im01.nanyibang.com/match/2016/03/24/1458804397_94218.jpg
         * long_info : 针织衫内搭衬衫十分百搭，外面穿一件3D修身呢风衣温暖有型，英伦大翻领和隐藏式门襟简约韩范又成熟，下搭休闲小脚裤和皮鞋，日常、约会、职场都可以穿。
         * width : 494
         * height : 854
         */

        private MatchEntity match;

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public void setWeather_type(String weather_type) {
            this.weather_type = weather_type;
        }

        public void setLowtemp(String lowtemp) {
            this.lowtemp = lowtemp;
        }

        public void setHightemp(String hightemp) {
            this.hightemp = hightemp;
        }

        public void setMatch(MatchEntity match) {
            this.match = match;
        }

        public String getCity_name() {
            return city_name;
        }

        public String getWeather_type() {
            return weather_type;
        }

        public String getLowtemp() {
            return lowtemp;
        }

        public String getHightemp() {
            return hightemp;
        }

        public MatchEntity getMatch() {
            return match;
        }

        public static class MatchEntity {
            private int collocation_id;
            private String big_image;
            private String long_info;
            private int width;
            private int height;

            public void setCollocation_id(int collocation_id) {
                this.collocation_id = collocation_id;
            }

            public void setBig_image(String big_image) {
                this.big_image = big_image;
            }

            public void setLong_info(String long_info) {
                this.long_info = long_info;
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

            public String getLong_info() {
                return long_info;
            }

            public int getWidth() {
                return width;
            }

            public int getHeight() {
                return height;
            }
        }
    }
}

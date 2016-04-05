package cn.jmpt.manbase.bean;

import java.util.List;

/**
 * Created by Administrator on 2016-03-29.
 */
public class ChaoPin {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * campaignKind : {"campain_name":"潮品","campain_icon":"","campain_icon2":"","campain_color":"","show_price":false}
     * itemDetail : [{"_id":345823,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1xOwJJVXXXXajXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"欧美风街头个性玩味男彩色涂层印花外套潮牛仔夹克春秋","coupon_price":"269.00","price":"269.00","saveCount":128,"isv_code":"0_2_chaopin_19","icon_type":2,"description":"个性玩味彩色涂层印花外套"},{"_id":345822,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/142950234/TB2dNnEkVXXXXcHXXXXXXXXXXXX_!!142950234.jpg_450x10000q75.jpg","title":"猿人头卡通印花 男士短袖t恤tee 打底衫男装夏季青少年","coupon_price":"49.00","price":"80.00","saveCount":124,"isv_code":"0_2_chaopin_19","icon_type":2,"description":"猿人头卡通印花"},{"_id":345821,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/2627056185/TB2sIwOkpXXXXb.XpXXXXXXXXXX_!!2627056185.jpg_450x10000q75.jpg","title":"新款MLGB李晨潮牌烫金锁休闲印花学生圆领纯棉短袖T恤 ","coupon_price":"88.60","price":"128.00","saveCount":155,"isv_code":"0_2_chaopin_19","icon_type":2,"description":"MLGB潮牌烫金锁纯棉T"},{"_id":345553,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1BpuJLVXXXXbHXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"hardlyevers&高桥石尚原创潮牌加大码拼接潮男短袖T恤","coupon_price":"119.00","price":"398.00","saveCount":69,"isv_code":"0_2_chaopin_19","description":"拼接潮男短袖T恤"},{"_id":345552,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1SRLEKpXXXXX1XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男女款个性豹纹潮人偏光 时尚太阳眼镜户外开车墨镜","coupon_price":"119.00","price":"119.00","saveCount":183,"isv_code":"0_2_chaopin_19","description":"个性豹纹潮人太阳眼镜"},{"_id":345551,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1LSXELFXXXXabXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"STRETAG思锐泰格 刺绣迷彩套头卫衣绒衣黑色运动帽衫","coupon_price":"329.00","price":"329.00","saveCount":175,"isv_code":"0_2_chaopin_19","description":"刺绣迷彩套头卫衣"},{"_id":345550,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1SwL0JFXXXXc7XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"独立设计个性青少年男式外搭镂空中长款翻领风衣潮春装","coupon_price":"199.00","price":"199.00","saveCount":65,"isv_code":"0_2_chaopin_19","description":"镂空中长款翻领风衣"},{"_id":345549,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1ABoiJVXXXXboXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"欧美风色块低腰几何拼接男士铅笔小脚裤潮弹力紧身乞丐补丁牛仔裤","coupon_price":"129.00","price":"129.00","saveCount":164,"isv_code":"0_2_chaopin_19","description":"欧美风几何色块小脚裤"},{"_id":345548,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/2627056185/TB2reKHkpXXXXXuXpXXXXXXXXXX_!!2627056185.jpg_450x10000q75.jpg","title":"MLGB李晨潮牌印花大骷髅头图案 男女情侣时尚休闲运动短袖T恤夏","coupon_price":"69.90","price":"128.00","saveCount":66,"isv_code":"0_2_chaopin_19","description":"时尚休闲运动短袖"},{"_id":345547,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB16OjqKVXXXXcSXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"connive秋冬欧洲站男鞋潮高帮亮面PU休闲鞋子朋克骑士靴子水鞋款","coupon_price":"339.00","price":"339.00","saveCount":63,"isv_code":"0_2_chaopin_19","description":"朋克骑士靴"},{"_id":345544,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/2627056185/TB2p3h8lVXXXXX3XpXXXXXXXXXX_!!2627056185.jpg_450x10000q75.jpg","title":"春秋季李晨MLGB潮牌LONG 辛普森联名款印花开衫连帽男女情侣外套","coupon_price":"238.00","price":"399.00","saveCount":104,"isv_code":"0_2_chaopin_19","description":"辛普森联名款印花开衫"},{"_id":344869,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1XC1yLXXXXXceXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":" 翅膀天堂之翼双肩包美国街头潮牌背包中学生个性书包","coupon_price":"468.00","price":"899.00","saveCount":154,"isv_code":"0_2_chaopin_19","description":"翅膀双肩包"},{"_id":344868,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1nVY7LFXXXXXMXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮牌范班家春夏新款男女情侣大叔图案T恤青年休闲圆领短袖","coupon_price":"271.00","price":"339.00","saveCount":197,"isv_code":"0_2_chaopin_19","description":"潮牌大叔图案T恤"},{"_id":344867,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1UQrsLpXXXXX5apXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"德国潮牌PP春夏新款时尚卫裤男士宽松冰丝印花宽松抽绳长裤大码","coupon_price":"516.00","price":"516.00","saveCount":150,"isv_code":"0_2_chaopin_19","description":"潮牌PP新款时尚卫裤"},{"_id":344866,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1UZMdLFXXXXcnXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士春夏季潮牌DG卡通三只卡通猴T恤男女情侣同款红灰圆领短","coupon_price":"303.00","price":"349.00","saveCount":119,"isv_code":"0_2_chaopin_19","description":"卡通猴T恤"},{"_id":344865,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB12uZxLFXXXXccaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士潮牌春夏秋冬四季甩墨喷漆补丁刺绣装饰中国风脸谱牛仔裤","coupon_price":"519.00","price":"519.00","saveCount":126,"isv_code":"0_2_chaopin_19","description":"中国风脸谱牛仔裤"},{"_id":344864,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/1761229157/TB2RwbCkVXXXXcOXpXXXXXXXXXX_!!1761229157.jpg_450x10000q75.jpg","title":"奢侈品大牌男鞋外贸欧美乐福鞋男真皮一脚蹬青年休闲潮牌英伦板鞋","coupon_price":"318.00","price":"799.00","saveCount":69,"isv_code":"0_2_chaopin_19","description":"潮牌英伦板鞋"},{"_id":342228,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB17lwGHFXXXXbMXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"欧美男士手拿包潮流街头铆钉手抓包骷髅贴布单肩斜挎包手包信封包","coupon_price":"89.00","price":"89.00","saveCount":158,"isv_code":"0_2_chaopin_19","description":"铆钉手抓包"},{"_id":342225,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1cOJvIFXXXXX3XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"新款欧美复古蒸汽朋克太阳镜圆框八角菱形不规则反光金属男士墨镜","coupon_price":"39.00","price":"39.00","saveCount":111,"isv_code":"0_2_chaopin_19","description":"朋克太阳镜"},{"_id":342224,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1lyAgKpXXXXXOXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"新款 猿 拼接迷彩 鲨鱼开衫连帽卫衣 男女款帽衫 外套 潮","coupon_price":"138.00","price":"138.00","saveCount":165,"isv_code":"0_2_chaopin_19","description":"鲨鱼开衫连帽卫衣"}]
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
        /**
         * campain_name : 潮品
         * campain_icon :
         * campain_icon2 :
         * campain_color :
         * show_price : false
         */

        private CampaignKindEntity campaignKind;
        /**
         * _id : 345823
         * pic_url : http://img02.taobaocdn.com/bao/uploaded/i2/TB1xOwJJVXXXXajXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
         * title : 欧美风街头个性玩味男彩色涂层印花外套潮牛仔夹克春秋
         * coupon_price : 269.00
         * price : 269.00
         * saveCount : 128
         * isv_code : 0_2_chaopin_19
         * icon_type : 2
         * description : 个性玩味彩色涂层印花外套
         */

        private List<ItemDetailEntity> itemDetail;

        public void setCampaignKind(CampaignKindEntity campaignKind) {
            this.campaignKind = campaignKind;
        }

        public void setItemDetail(List<ItemDetailEntity> itemDetail) {
            this.itemDetail = itemDetail;
        }

        public CampaignKindEntity getCampaignKind() {
            return campaignKind;
        }

        public List<ItemDetailEntity> getItemDetail() {
            return itemDetail;
        }

        public static class CampaignKindEntity {
            private String campain_name;
            private String campain_icon;
            private String campain_icon2;
            private String campain_color;
            private boolean show_price;

            public void setCampain_name(String campain_name) {
                this.campain_name = campain_name;
            }

            public void setCampain_icon(String campain_icon) {
                this.campain_icon = campain_icon;
            }

            public void setCampain_icon2(String campain_icon2) {
                this.campain_icon2 = campain_icon2;
            }

            public void setCampain_color(String campain_color) {
                this.campain_color = campain_color;
            }

            public void setShow_price(boolean show_price) {
                this.show_price = show_price;
            }

            public String getCampain_name() {
                return campain_name;
            }

            public String getCampain_icon() {
                return campain_icon;
            }

            public String getCampain_icon2() {
                return campain_icon2;
            }

            public String getCampain_color() {
                return campain_color;
            }

            public boolean isShow_price() {
                return show_price;
            }
        }

        public static class ItemDetailEntity {
            private int _id;
            private String pic_url;
            private String title;
            private String coupon_price;
            private String price;
            private int saveCount;
            private String isv_code;
            private int icon_type;
            private String description;

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

            public void setPrice(String price) {
                this.price = price;
            }

            public void setSaveCount(int saveCount) {
                this.saveCount = saveCount;
            }

            public void setIsv_code(String isv_code) {
                this.isv_code = isv_code;
            }

            public void setIcon_type(int icon_type) {
                this.icon_type = icon_type;
            }

            public void setDescription(String description) {
                this.description = description;
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

            public String getPrice() {
                return price;
            }

            public int getSaveCount() {
                return saveCount;
            }

            public String getIsv_code() {
                return isv_code;
            }

            public int getIcon_type() {
                return icon_type;
            }

            public String getDescription() {
                return description;
            }
        }
    }
}

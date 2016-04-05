package cn.jmpt.manbase.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleCategory implements Serializable {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * classID : 2
     * name : 上衣
     * categories : [{"name":"短袖T恤","cate_id":70,"cateimg":"http://im01.nanyibang.com/cateimg/2016/03/11/shortt.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"短袖衬衫","cate_id":75,"cateimg":"http://im01.nanyibang.com/cateimg/2016/03/10/duanchen.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"长袖T恤","cate_id":66,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/changt_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"长袖衬衫","cate_id":22,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/changchen_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"卫衣","cate_id":24,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/weiyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":14,"attributeName":"太空棉"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"夹克","cate_id":28,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/jiake_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"风衣","cate_id":27,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/fengyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"毛衣","cate_id":52,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/maoyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"针织衫","cate_id":25,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/zhenzhi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"皮衣","cate_id":105,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/piyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":6,"attributeName":"牛皮"},{"attributeID":8,"attributeName":"PU"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"牛仔外套","cate_id":132,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/niuzai_cateB.png","filter":[{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"棒球服","cate_id":135,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/bangqiu_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"POLO","cate_id":101,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/polo_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"马甲","cate_id":80,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/beixin_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"西服","cate_id":23,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/xizhuang_cateB.png","filter":[{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]},{"name":"保暖内衣","cate_id":53,"cateimg":"http://im01.nanyibang.com/cateimg/2016/01/29/neiyi_cateB.png","filter":[{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]}]
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

    public static class UserEntity implements Serializable {
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

    public static class DataEntity implements Serializable {
        private int classID;
        private String name;
        /**
         * name : 短袖T恤
         * cate_id : 70
         * cateimg : http://im01.nanyibang.com/cateimg/2016/03/11/shortt.png
         * filter : [{"name":"材质","type":"material","items":[{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}],"code":1},{"name":"版型","type":"shape","items":[{"attributeID":5,"attributeName":"直筒"},{"attributeID":3,"attributeName":"宽松"},{"attributeID":2,"attributeName":"修身"}],"code":1}]
         */

        private List<CategoriesEntity> categories;

        public void setClassID(int classID) {
            this.classID = classID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCategories(List<CategoriesEntity> categories) {
            this.categories = categories;
        }

        public int getClassID() {
            return classID;
        }

        public String getName() {
            return name;
        }

        public List<CategoriesEntity> getCategories() {
            return categories;
        }

        public static class CategoriesEntity implements Serializable {
            private String name;
            private int cate_id;
            private String cateimg;
            /**
             * name : 材质
             * type : material
             * items : [{"attributeID":2,"attributeName":"棉"},{"attributeID":11,"attributeName":"混纺"},{"attributeID":12,"attributeName":"人造纤维"},{"attributeID":16,"attributeName":"麻"},{"attributeID":17,"attributeName":"毛"}]
             * code : 1
             */

            private List<FilterEntity> filter;

            public void setName(String name) {
                this.name = name;
            }

            public void setCate_id(int cate_id) {
                this.cate_id = cate_id;
            }

            public void setCateimg(String cateimg) {
                this.cateimg = cateimg;
            }

            public void setFilter(List<FilterEntity> filter) {
                this.filter = filter;
            }

            public String getName() {
                return name;
            }

            public int getCate_id() {
                return cate_id;
            }

            public String getCateimg() {
                return cateimg;
            }

            public List<FilterEntity> getFilter() {
                return filter;
            }

            public static class FilterEntity implements Serializable {
                private String name;
                private String type;
                private int code;
                /**
                 * attributeID : 2
                 * attributeName : 棉
                 */

                private List<ItemsEntity> items;

                public void setName(String name) {
                    this.name = name;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public void setCode(int code) {
                    this.code = code;
                }

                public void setItems(List<ItemsEntity> items) {
                    this.items = items;
                }

                public String getName() {
                    return name;
                }

                public String getType() {
                    return type;
                }

                public int getCode() {
                    return code;
                }

                public List<ItemsEntity> getItems() {
                    return items;
                }

                public static class ItemsEntity implements Serializable {
                    private int attributeID;
                    private String attributeName;

                    public void setAttributeID(int attributeID) {
                        this.attributeID = attributeID;
                    }

                    public void setAttributeName(String attributeName) {
                        this.attributeName = attributeName;
                    }

                    public int getAttributeID() {
                        return attributeID;
                    }

                    public String getAttributeName() {
                        return attributeName;
                    }
                }
            }
        }
    }
}

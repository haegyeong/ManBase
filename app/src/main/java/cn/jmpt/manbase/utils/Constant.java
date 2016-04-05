package cn.jmpt.manbase.utils;

import android.os.Handler;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.bean.BuyDetail;
import cn.jmpt.manbase.bean.Category;
import cn.jmpt.manbase.bean.ChaoPin;
import cn.jmpt.manbase.bean.Choiceness;
import cn.jmpt.manbase.bean.Comment;
import cn.jmpt.manbase.bean.Dayly;
import cn.jmpt.manbase.bean.DaylyDetail;
import cn.jmpt.manbase.bean.Group;
import cn.jmpt.manbase.bean.GroupCategory;
import cn.jmpt.manbase.bean.GroupJinXuan;
import cn.jmpt.manbase.bean.JinPin;
import cn.jmpt.manbase.bean.School;
import cn.jmpt.manbase.bean.SchoolComent;
import cn.jmpt.manbase.bean.SchoolTitle;
import cn.jmpt.manbase.bean.Show;
import cn.jmpt.manbase.bean.SingleCategory;
import cn.jmpt.manbase.bean.SingleListProduct;
import cn.jmpt.manbase.bean.SingleProduct;
import cn.jmpt.manbase.bean.Today;
import cn.jmpt.manbase.bean.TodayDetail;
import cn.jmpt.manbase.fragment.JinPinFragment;

/**
 * Created by Administrator on 2016-03-26.
 */
public class Constant {

    private static Handler handler = new Handler();
    private static Gson gson = new Gson();


    /**
     * 首页获取分类回调接口
     */
    public interface OnCategoryListener {
        void getCategory(Category category);
    }

    /**
     * 首页获取搭配精选回调接口
     */
    public interface OnGroupListener {
        void getGroup(Group group);
    }

    /**
     * 首页获取邦邦精选回调接口
     */
    public interface OnChoicenessListener {
        void getChoiceness(Choiceness choiceness);
    }

    /**
     * 首页获取型男show回调接口
     */
    public interface OnShowListener {
        void getShow(Show show);
    }

    /**
     * 首页获取穿衣学堂回调接口
     */
    public interface OnSchoolListener {
        void getSchool(School school);
    }

    /**
     * 首页获取今天穿什么回调接口
     */
    public interface OnTodayListener {
        void getToday(Today today);
    }

    /**
     * 首页获取今天穿什么查看更多详情回调接口
     */
    public interface OnTodayDetailListener {
        void getTodayDetail(TodayDetail todayDetail);
    }

    /**
     * 获取购买页回调接口
     */
    public interface OnButDetailListener {
        void getBuyDetail(BuyDetail buyDetail);
    }

    /**
     * 获取特色潮品页回调接口
     */
    public interface OnChaoPinListener {
        void getChaoPin(ChaoPin chaoPin);
    }

    /**
     * 获取评论评分回调接口
     */
    public interface OnCommentListener {
        void getComment(Comment comment);
    }

    /**
     * 获取日常洗护回调接口
     */
    public interface OnDaylyListener {
        void getDayly(Dayly dayly);
    }

    /**
     * 获取日常洗护分类回调接口
     */
    public interface OnDaylyDetailListener {
        void getDaylyDetail(DaylyDetail daylyDetail);
    }

    /**
     * 获取精品回调接口
     */
    public interface OnJinPinlListener {
        void getJinPin(List<JinPin> jinPins);
    }

    /**
     * 获取单品页分类回调接口
     */
    public interface OnSigleCategoryListener {
        void getSingleCategory(SingleCategory singleCategory);
    }

    /**
     * 获取单品页产品回调接口
     */
    public interface OnSingleProductListener {
        void getSingleProduct(SingleProduct singleProduct);
    }

    /**
     * 获取单品分类产品列表回调接口
     */
    public interface OnSingleListProductListener {
        void getSingleListProduct(SingleListProduct singleListProduct);
    }

    /**
     * 获取学堂标题回调接口
     */
    public interface OnSchoolTitleListener {
        void getSchoolTitle(SchoolTitle schoolTitle);
    }

    /**
     * 获取学堂标题下内容回调接口
     */
    public interface OnSchoolComtentListener {
        void getSchoolComent(SchoolComent schoolComent);
    }

    /**
     * 获取搭配下的分类回调接口
     */
    public interface OnGroupCategoryListener {
        void getGroupCategory(GroupCategory groupCategory);
    }

    /**
     * 获取搭配下的分类回调接口
     */
    public interface OnGroupJinXuanListener {
        void getGroupJinXuan(GroupJinXuan groupJinXuan);
    }

    /***
     * 获取首页分类数据
     *
     * @param url
     * @param listener
     */
    public static void getCategory(final String url, final OnCategoryListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                if (json != null) {
                    final Category category = gson.fromJson(json, Category.class);
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            listener.getCategory(category);
                        }
                    });
                }
            }
        });
    }

    /***
     * 获取首页搭配精选数据
     *
     * @param url
     * @param listener
     */
    public static void getGroup(final String url, final OnGroupListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Group group = gson.fromJson(json, Group.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getGroup(group);
                    }
                });
            }
        });
    }

    /***
     * 获取邦邦精选数据
     *
     * @param url
     * @param listener
     */
    public static void getChoiceness(final String url, final OnChoicenessListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Choiceness choiceness = gson.fromJson(json, Choiceness.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getChoiceness(choiceness);
                    }
                });
            }
        });
    }

    /**
     * 获取型男show的数据
     */
    public static void getShow(final String url, final OnShowListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Show show = gson.fromJson(json, Show.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getShow(show);
                    }
                });
            }
        });
    }

    /***
     * 获取搭配学堂数据
     *
     * @param url
     * @param listener
     */
    public static void getSchool(final String url, final OnSchoolListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final School school = gson.fromJson(json, School.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSchool(school);
                    }
                });
            }
        });
    }

    /***
     * 获取今天穿什么数据
     *
     * @param url
     * @param listener
     */
    public static void getToday(final String url, final OnTodayListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Today today = gson.fromJson(json, Today.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getToday(today);
                    }
                });
            }
        });
    }

    /***
     * 获取今天穿什么查看更多搭配数据
     *
     * @param url
     * @param listener
     */
    public static void getTodayDetail(final String url, final OnTodayDetailListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final TodayDetail todayDetail = gson.fromJson(json, TodayDetail.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getTodayDetail(todayDetail);
                    }
                });
            }
        });
    }

    /***
     * 获取购买页数据
     *
     * @param url
     * @param listener
     */
    public static void getBuyDetail(final String url, final OnButDetailListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final BuyDetail buyDetail = gson.fromJson(json, BuyDetail.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getBuyDetail(buyDetail);
                    }
                });
            }
        });
    }

    /***
     * 评论与评分数据
     *
     * @param url
     * @param listener
     */
    public static void getComment(final String url, final OnCommentListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Comment comment = gson.fromJson(json, Comment.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getComment(comment);
                    }
                });
            }
        });
    }

    /***
     * 获取潮品页数据
     *
     * @param url
     * @param listener
     */
    public static void getChaoPin(final String url, final OnChaoPinListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final ChaoPin chaoPin = gson.fromJson(json, ChaoPin.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getChaoPin(chaoPin);
                    }
                });
            }
        });
    }

    /***
     * 获取日常洗护用品页数据
     *
     * @param url
     * @param listener
     */
    public static void getDayly(final String url, final OnDaylyListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final Dayly dayly = gson.fromJson(json, Dayly.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getDayly(dayly);
                    }
                });
            }
        });
    }

    /***
     * 获取日常洗护用品页数据
     *
     * @param url
     * @param listener
     */
    public static void getDaylyDetail(final String url, final OnDaylyDetailListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final DaylyDetail daylyDetail = gson.fromJson(json, DaylyDetail.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (daylyDetail.getData().size() == 0) {
                            listener.getDaylyDetail(null);
                        } else {
                            listener.getDaylyDetail(daylyDetail);

                        }
                    }
                });
            }
        });
    }

    /***
     * 获取精品页数据
     *
     * @param url
     * @param listener
     */
    public static void getJinPinDetail(final String url, final OnJinPinlListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final List<JinPin> jinPins = new ArrayList<JinPin>();
                try {
                    JSONObject jsonObject = new JSONObject(json);
                    JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("itemDetail");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                        String id = jsonObject1.getString("_id");
                        String pic_url = jsonObject1.getString("pic_url");
                        String title = jsonObject1.getString("title");
                        String price = jsonObject1.getString("coupon_price");
                        JinPin jinPin = new JinPin(id, pic_url, title, price);
                        jinPins.add(jinPin);
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            listener.getJinPin(jinPins);
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /***
     * 获取单品页分类数据
     *
     * @param url
     * @param listener
     */
    public static void getSingleCategory(final String url, final OnSigleCategoryListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final SingleCategory singleCategory = gson.fromJson(json, SingleCategory.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSingleCategory(singleCategory);
                    }
                });
            }
        });
    }

    /***
     * 获取单品页产品列表数据
     *
     * @param url
     * @param listener
     */
    public static void getSingleProduct(final String url, final OnSingleProductListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final SingleProduct singleProduct = gson.fromJson(json, SingleProduct.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSingleProduct(singleProduct);
                    }
                });
            }
        });
    }

    /***
     * 获取单品分类下产品列表数据
     *
     * @param url
     * @param listener
     */
    public static void getSingleListProduct(final String url, final OnSingleListProductListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final SingleListProduct singleProduct = gson.fromJson(json, SingleListProduct.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSingleListProduct(singleProduct);
                    }
                });
            }
        });
    }

    /***
     * 获取学堂标题的数据
     *
     * @param url
     * @param listener
     */
    public static void getSchoolTitle(final String url, final OnSchoolTitleListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final SchoolTitle schoolTitle = gson.fromJson(json, SchoolTitle.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSchoolTitle(schoolTitle);
                    }
                });
            }
        });
    }

    /***
     * 获取学堂标题下的内容数据
     *
     * @param url
     * @param listener
     */
    public static void getSchoolComent(final String url, final OnSchoolComtentListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final SchoolComent schoolComent = gson.fromJson(json, SchoolComent.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getSchoolComent(schoolComent);
                    }
                });
            }
        });
    }

    /***
     * 获取搭配分类内容数据
     *
     * @param url
     * @param listener
     */
    public static void getGroupCategory(final String url, final OnGroupCategoryListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final GroupCategory groupCategory = gson.fromJson(json, GroupCategory.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getGroupCategory(groupCategory);
                    }
                });
            }
        });
    }


    /***
     * 获取搭配分类内容数据
     *
     * @param url
     * @param listener
     */
    public static void getGroupJinXuan(final String url, final OnGroupJinXuanListener listener) {
        ThreadManger.getService().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkhttpUtils.loadStringFromURL(url);
                final GroupJinXuan groupJinXuan = gson.fromJson(json, GroupJinXuan.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.getGroupJinXuan(groupJinXuan);
                    }
                });
            }
        });
    }

}

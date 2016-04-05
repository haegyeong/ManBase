package cn.jmpt.manbase.utils;

/**
 * Created by Administrator on 2016-03-26.
 */
public class UrlSet {
    /*首页分类*/
    public static String CATEGORY = "http://api.nanyibang.com/theme?age=19&system_name=android&type=2%2C3%2C4%2C5%2C6&versionCode=202";

    /*首页搭配精选*/
    public static String JINGXUAN = "http://api.nanyibang.com/index-jingxuan?age=19&system_name=android&versionCode=202";

    /*首页邦邦精选*/
    public static String BANGBAGNJINGXUAN = "http://api.nanyibang.com/campaign?age=19&campaignId=5&campaignType=jingxuan&page=1&system_name=android&versionCode=202";

    /*型男show*/
    public static String SHOW = "http://api.nanyibang.com/haokanme?age=19&page=1&public=true&system_name=android&versionCode=202";
    /*穿衣学堂*/
    public static String SCHOOL = "http://api.nanyibang.com/dress-school?age=19&campaignType=chaopin&page=1&system_name=android&versionCode=202";

    /*今天穿什么*/
    public static String TODAY = "http://api.nanyibang.com/match-today?administrativeArea=%E5%B9%BF%E4%B8%9C%E7%9C%81&age=19&country=%E4%B8%AD%E5%9B%BD&locality=%E6%B7%B1%E5%9C%B3%E5%B8%82&system_name=android&versionCode=202";

    /*衣服详情 collocation_id*/
    public static String TODAY_DETAIL = "http://api.nanyibang.com/match-detail?age=24&collocation_id=@&system_name=android&versionCode=202";

    /*购买页详情  item_id*/
    public static String DETAIL = "http://api.nanyibang.com/items?age=24&item_id=@item_id&system_name=android&versionCode=202";

    /*评论与评分*/
    public static String COMMENT = "http://api.nanyibang.com/score-comment?age=24&item_id=@item_id&system_name=android&versionCode=202";

    /*超品专区 page=1*/
    public static String CHAOPIN = "http://api.nanyibang.com/campaign?age=19&campaignId=6&campaignType=chaopin&page=@page&system_name=android&versionCode=202";
    /*日常洗护*/
    public static String DAYLIY = "http://api.nanyibang.com/daily-classify?age=19&system_name=android&versionCode=202";

    /*日常洗护详情  kind_id=1&page=1&selectType=low*/
    public static String DAYLYDETAIL = "http://api.nanyibang.com/daily-items?age=19&kind_id=@kind_id&page=@page&selectType=@selectType&system_name=android&versionCode=202";

    /*精品小街  campaignId=2,3,4  campaignType=9.9,19.9,29.9 page=1*/
    public static String JINGPING = "http://api.nanyibang.com/campaign?age=19&campaignId=@campaignId&campaignType=@campaignType&page=@page&system_name=android&versionCode=202";

    /*情侣专区  campaignId  page=1*/
    public static String QINGLV = "http://api.nanyibang.com/campaign?age=19&campaignId=@campaignId&campaignType=@campaignType&page=@page&system_name=android&versionCode=202";

    /*单品分类*/
    public static String SINGLE_CATEGORY = "http://api.nanyibang.com/select-condition?administrativeArea=%E5%B9%BF%E4%B8%9C%E7%9C%81&age=19&country=%E4%B8%AD%E5%9B%BD&locality=%E6%B7%B1%E5%9C%B3%E5%B8%82&system_name=android&versionCode=202";
    /*单品产品  cateId=@cateId&page=@page*/
    public static String SINGLE_PRODUCT = "http://api.nanyibang.com/tuijian-product?age=19&cateId=@cateId&page=@page&system_name=android&versionCode=202";

    /*单品分类中的列表  cate_id=70&page=1&selectType=default*/
    public static String SINGLE_PRODUCT_LIST = "http://api.nanyibang.com/single-product?age=19&cate_id=@cate_id&page=@page&selectType=@selectType&system_name=android&versionCode=202";

    /*搭配的分类*/
    public static String GROUP_CATEGORY = "http://api.nanyibang.com/match-classify?age=19&system_name=android&versionCode=202";

    /*搭配的分类详情列表 */
    public static String GROUP_CATEGORY_DETAIL = "http://api.nanyibang.com/match-list?age=19&classify_id=@classify_id&kind=@kind&page=@page&system_name=android&versionCode=202";

    /*搭配的精选*/
    public static String GROUP_JINGXUAN = "http://api.nanyibang.com/match-list?age=19&page=@page&system_name=android&versionCode=202";

    /*学堂的标题*/
    public static String SCHOOL_TITLE = "http://api.nanyibang.com/school-kinds?age=19&system_name=android&versionCode=202";

    /*学堂标题下的内容 kind=@kind&page=@page*/
    public static String SCHOOL_TITLE_COMTENT = "http://api.nanyibang.com/dress-school?age=19&kind=@kind&page=@page&system_name=android&versionCode=202";

}

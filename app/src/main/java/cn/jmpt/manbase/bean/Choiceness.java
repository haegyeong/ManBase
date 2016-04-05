package cn.jmpt.manbase.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016-03-27.
 * 首页精选bean
 */
public class Choiceness implements Serializable {

    /**
     * member_type : guest
     * login_status : error
     * login_status_msg : not login in
     */

    private UserEntity user;
    /**
     * campaignKind : {"campain_name":"精选","campain_icon":"","campain_icon2":"","campain_color":"","show_price":true}
     * itemDetail : [{"_id":345459,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1qdo4LVXXXXaAaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款纯棉长袖衬衫男修身条纹拼接休闲衬衣立领","coupon_price":"139.00","price":"399.00","saveCount":108,"isv_code":"0_2_jingxuan_19"},{"_id":345160,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1ISNHMXXXXXXmXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Belinsky仿牛仔布西装男小西装韩版修身西装春秋新款西服外套男潮","coupon_price":"218.00","price":"398.00","saveCount":109,"isv_code":"0_2_jingxuan_19"},{"_id":339585,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1K9BjMXXXXXcmXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Impromptu针织衫男春季修身长袖男士纯色苎麻毛衣开衫外套I50002M","coupon_price":"159.00","price":"449.00","saveCount":73,"isv_code":"0_2_jingxuan_19"},{"_id":345126,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB18rNrMXXXXXcAXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"no1dara 春秋季韩版短款薄夹克男青年春装刺绣修身棒球服潮男外套","coupon_price":"199.00","price":"284.00","saveCount":151,"isv_code":"0_2_jingxuan_19"},{"_id":313205,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1bvthMXXXXXa2XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"AMH男装韩版2016春装新款男士时尚棒球领修身男士夹克OT5081淼","coupon_price":"178.00","price":"558.00","saveCount":190,"isv_code":"0_2_jingxuan_19"},{"_id":332176,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1XcRnMXXXXXajXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款 男士春装外套 韩版男装时尚棒球领夹克","coupon_price":"328.00","price":"328.00","saveCount":122,"isv_code":"0_2_jingxuan_19"},{"_id":338720,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1hWtqMXXXXXcwXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新品 欧美男士连帽休闲外套潮男春秋季修身夹克男","coupon_price":"238.00","price":"258.00","saveCount":90,"isv_code":"0_2_jingxuan_19"},{"_id":283431,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1BqhtMXXXXXc0XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"WOOG2005春装男士外套 2016韩版修身蓝色薄款棒球领夹克男青年","coupon_price":"159.00","price":"395.00","saveCount":109,"isv_code":"0_2_jingxuan_19"},{"_id":299604,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1AfpiMXXXXXaVXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"新款时尚男装圆领T恤拼接羽毛印花长袖潮男太空棉卫衣","coupon_price":"70.00","price":"168.00","saveCount":165,"isv_code":"0_2_jingxuan_19"},{"_id":309055,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB18JlaMXXXXXXfXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"抹茶故事2016春季新款男装 韩版男士修身印花卫衣 休闲男外套 潮","coupon_price":"139.00","price":"140.00","saveCount":61,"isv_code":"0_2_jingxuan_19"},{"_id":297137,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1jE0EMXXXXXX.XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男生秋季男士卫衣男加绒加厚休闲外套圆领套头印花T恤韩版修身潮","coupon_price":"69.00","price":"199.00","saveCount":59,"isv_code":"0_2_jingxuan_19"},{"_id":345121,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1fqs7LVXXXXc3XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新款 日系简约百搭款横白条纹休闲套头卫衣男","coupon_price":"128.00","price":"288.00","saveCount":166,"isv_code":"0_2_jingxuan_19"},{"_id":345118,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1d6RDMXXXXXXAaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季男士卫衣春秋韩版修身学生套头纯色印花圆领潮男","coupon_price":"88.00","price":"156.00","saveCount":95,"isv_code":"0_2_jingxuan_19"},{"_id":345117,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1XQs.LVXXXXbbXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男装韩版2016春季新款时尚休闲男士青年卫衣","coupon_price":"99.00","price":"177.00","saveCount":168,"isv_code":"0_2_jingxuan_19"},{"_id":345116,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1nDJRMXXXXXcOXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Belinsky春季新款男士套头卫衣青年大码圆领针织袖上衣男大号上衣","coupon_price":"89.00","price":"113.00","saveCount":137,"isv_code":"0_2_jingxuan_19"},{"_id":343979,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1..dAMXXXXXbGXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款休闲男士套头圆领卫衣重水洗复古修身卫衣服","coupon_price":"148.00","price":"148.00","saveCount":201,"isv_code":"0_2_jingxuan_19"},{"_id":345115,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1DmgcLVXXXXbQaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Lilbetter男士卫衣 字母贴布灰色运动外套宽松休闲帽衫连帽外衣男","coupon_price":"158.00","price":"198.00","saveCount":132,"isv_code":"0_2_jingxuan_19"},{"_id":345114,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1.CdBMXXXXXX.XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士卫衣 韩版刺绣印花套头卫衣运动休闲欧美风潮流上衣","coupon_price":"128.00","price":"254.00","saveCount":195,"isv_code":"0_2_jingxuan_19"},{"_id":345113,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1zBRbMXXXXXa6XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"黑择明春季新款字母印花圆领运动卫衣男韩版套头潮学生卫衣外套","coupon_price":"128.00","price":"200.00","saveCount":158,"isv_code":"0_2_jingxuan_19"},{"_id":305909,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1g.71LVXXXXbEXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"JOKESTER原创时尚潮流渐变色情侣装套头卫衣 男港风青少年潮外套","coupon_price":"259.00","price":"259.00","saveCount":125,"isv_code":"0_2_jingxuan_19"},{"_id":344646,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1wtFmMXXXXXa0XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016早春季新品卫衣条纹圆领套头纯色休闲潮卫衣","coupon_price":"198.00","price":"658.00","saveCount":190,"isv_code":"0_2_jingxuan_19"},{"_id":345103,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1y_FkMXXXXXXBXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"UOOHE2016春季新品太空棉大卫印花卫衣男圆领套头韩版修身外套潮","coupon_price":"198.00","price":"399.00","saveCount":175,"isv_code":"0_2_jingxuan_19"},{"_id":345100,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1C4QrLVXXXXbTaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春夏新品映山红花卫衣","coupon_price":"109.00","price":"119.00","saveCount":108,"isv_code":"0_2_jingxuan_19"},{"_id":345098,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1hrRiMXXXXXb_XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春秋新款圆领套头卫衣 男士潮流修身欧美风外套上衣","coupon_price":"128.00","price":"238.00","saveCount":199,"isv_code":"0_2_jingxuan_19"},{"_id":345095,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1LTdXMXXXXXb0XpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新款 简约拼色细节拼接卫衣男 潮男套头卫衣","coupon_price":"128.00","price":"328.00","saveCount":172,"isv_code":"0_2_jingxuan_19"},{"_id":344791,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1XrppLVXXXXbWXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Deere Jane牛仔外套男青年春季新品日系夹克 男士条纹棒球服 潮牌","coupon_price":"178.00","price":"368.00","saveCount":178,"isv_code":"0_2_jingxuan_19"},{"_id":338646,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1wW_ZLXXXXXbHXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春秋新款韩版潮牌宽松牛仔外套休闲外衣男士牛仔衣夹克","coupon_price":"158.00","price":"228.00","saveCount":141,"isv_code":"0_2_jingxuan_19"},{"_id":345101,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1gXI1LVXXXXXlapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016新款春装字母印花男士卫衣 欧美宽松潮流圆领套头卫衣男","coupon_price":"218.00","price":"476.00","saveCount":86,"isv_code":"0_2_jingxuan_19"},{"_id":345099,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1PBhjMXXXXXadXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春秋新款圆领套头卫衣 男士潮流修身欧美风外套上衣","coupon_price":"128.00","price":"228.00","saveCount":121,"isv_code":"0_2_jingxuan_19"},{"_id":341909,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1KILHLFXXXXawXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"棒球服男夹克韩版宽松2016春季新款男士空军一号潮流外套短款男潮","coupon_price":"138.00","price":"266.00","saveCount":103,"isv_code":"0_2_jingxuan_19"},{"_id":339230,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1KtNrMXXXXXX3XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春季男装新款棒球领夹克 韩版修身显瘦竖条纹夹克衫男休闲外套潮","coupon_price":"118.00","price":"219.00","saveCount":115,"isv_code":"0_2_jingxuan_19"},{"_id":54421,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB17YBIMXXXXXXeXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装羊毛衫青年外套 灰色拼接针织男","coupon_price":"117.00","price":"436.00","saveCount":118,"isv_code":"0_2_jingxuan_19"},{"_id":344789,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1MKpKKXXXXXbrXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春秋牛仔夹克外套男韩版修身潮男休闲牛仔上衣大码时尚","coupon_price":"89.00","price":"398.00","saveCount":149,"isv_code":"0_2_jingxuan_19"},{"_id":344812,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1Fp7oLXXXXXbEXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春季男装夹克外套日系中长款夹克外套男潮韩版棒球衣嘻哈潮男外套","coupon_price":"138.00","price":"238.00","saveCount":90,"isv_code":"0_2_jingxuan_19"},{"_id":344814,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1r8aPLpXXXXcaXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"外套韩版春秋修身男女三条杠学生班服夏季上衣男士夹克薄款运动潮","coupon_price":"89.00","price":"209.00","saveCount":86,"isv_code":"0_2_jingxuan_19"},{"_id":344788,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1vsGULpXXXXXrXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士外套春季潮流韩版修身棒球服男学生休闲上衣薄款夹克男装青年","coupon_price":"109.00","price":"179.00","saveCount":95,"isv_code":"0_2_jingxuan_19"},{"_id":342863,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1m6fyHFXXXXacXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮男春夏时尚水洗破洞牛仔裤男装日韩潮流乞丐男裤子修身小脚","coupon_price":"69.00","price":"168.00","saveCount":161,"isv_code":"0_2_jingxuan_19"},{"_id":341900,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1BgBLLVXXXXbhXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Deere Jane夹克男青年日系休闲外套男士立领外衣春季修身原创男装","coupon_price":"158.00","price":"328.00","saveCount":168,"isv_code":"0_2_jingxuan_19"},{"_id":344508,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1.tPdLFXXXXcWXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"布衣传说原创男装 男士长袖衬衫纯色纯棉修身方领衬衣CC630","coupon_price":"129.00","price":"129.00","saveCount":183,"isv_code":"0_2_jingxuan_19"},{"_id":342687,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1VaNqMXXXXXXwXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮男2016春季新款男士纯色衬衫韩版棉麻修身青年春装衬衣","coupon_price":"138.00","price":"198.00","saveCount":107,"isv_code":"0_2_jingxuan_19"},{"_id":342870,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1I1JfMXXXXXcrXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款潮男圆领拼色印花长袖T恤","coupon_price":"108.00","price":"218.00","saveCount":209,"isv_code":"0_2_jingxuan_19"},{"_id":262044,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1sd1gIVXXXXb1XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"欧颜 男士手链 韩版 潮男情侣饰品时尚个性多层 皮绳手链 女 配饰","coupon_price":"29.90","price":"89.00","saveCount":128,"isv_code":"0_2_jingxuan_19"},{"_id":296934,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1pLSUKpXXXXbIXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"韩版个性时尚925银男土耳钉 情侣十字架单只日韩国潮男女耳饰耳环","coupon_price":"29.00","price":"56.00","saveCount":3,"isv_code":"0_2_jingxuan_19"},{"_id":342818,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1uWZ7LFXXXXczXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春装新款男装衬衣 韩版修身青年男士格子布亚麻长袖衬衫棉麻上衣","coupon_price":"98.00","price":"139.00","saveCount":127,"isv_code":"0_2_jingxuan_19"},{"_id":342852,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1dZ0XLVXXXXbaXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮男亚麻休闲裤 小脚修身韩版裤脚拉链束脚哈伦裤","coupon_price":"108.00","price":"190.00","saveCount":92,"isv_code":"0_2_jingxuan_19"},{"_id":54509,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1OihiMXXXXXbWapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"WOOG2005男士韩版夹克 男 修身青年2016春装潮男无领黑色pu皮外套","coupon_price":"169.00","price":"578.00","saveCount":71,"isv_code":"0_2_jingxuan_19"},{"_id":333212,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1uRs_LVXXXXb0aXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21男装修身帅气棒球领迷彩印花夹克 春装新品男士时尚运动外套潮","coupon_price":"189.00","price":"389.00","saveCount":159,"isv_code":"0_2_jingxuan_19"},{"_id":342842,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1nyv4LFXXXXXxaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季夹克男韩版青少年棒球服薄外套潮流印花日系条纹短款上衣","coupon_price":"168.00","price":"198.00","saveCount":205,"isv_code":"0_2_jingxuan_19"},{"_id":339320,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1dFtnMXXXXXbcXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮男春季新款小领衬衣 修身时尚小清新","coupon_price":"129.00","price":"184.00","saveCount":98,"isv_code":"0_2_jingxuan_19"},{"_id":342517,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1LM_CLFXXXXatXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士外套男韩版修身2016春季新款青年休闲宽松短款夹克男潮春","coupon_price":"138.00","price":"304.00","saveCount":67,"isv_code":"0_2_jingxuan_19"},{"_id":342825,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1wJZTLFXXXXbmXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"海贼王卡通动漫印花夹克外套棒球领修身夹克衫甲克春装茄克 男子","coupon_price":"105.00","price":"175.00","saveCount":104,"isv_code":"0_2_jingxuan_19"},{"_id":342336,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1YnpeMXXXXXbfXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"JOKESTER时尚美式格子工装衬衫休闲复古风文艺街头秋装长袖男衬衣","coupon_price":"259.00","price":"259.00","saveCount":75,"isv_code":"0_2_jingxuan_19"},{"_id":329318,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1dcJfMXXXXXXaXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"gthomme春款男装男士牛仔夹克韩版修身青年牛仔衣休闲牛仔外套潮","coupon_price":"142.00","price":"348.00","saveCount":80,"isv_code":"0_2_jingxuan_19"},{"_id":300464,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1OKpAMXXXXXa7XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"WildBunch 春夏新品长袖修身牛津纺拼接衬衫男士韩版潮牌白色衬衣","coupon_price":"119.00","price":"269.00","saveCount":89,"isv_code":"0_2_jingxuan_19"},{"_id":342360,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1UZ_mLVXXXXbiXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春装新品 男士帅气短款夹克 立领外套JK2002","coupon_price":"179.00","price":"179.00","saveCount":57,"isv_code":"0_2_jingxuan_19"},{"_id":281719,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1rabTIpXXXXaOXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新品潮男束脚牛仔裤 青年休闲小脚裤日系宽松哈伦裤男装","coupon_price":"118.00","price":"299.00","saveCount":146,"isv_code":"0_2_jingxuan_19"},{"_id":339550,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1.TYlLFXXXXaqXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春夏新款夹克 男士休闲潮流七分袖蝙蝠袖外套 纯色男夹克","coupon_price":"139.00","price":"198.00","saveCount":124,"isv_code":"0_2_jingxuan_19"},{"_id":339924,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1aiRyMXXXXXbKXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"WOOG2005黑色夹克男韩版2016春季休闲棒球领夹克衫青年薄款上衣潮","coupon_price":"239.00","price":"475.00","saveCount":122,"isv_code":"0_2_jingxuan_19"},{"_id":342452,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1vpxUMXXXXXXUXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款休闲长裤 男都市时尚慢跑裤","coupon_price":"199.00","price":"199.00","saveCount":113,"isv_code":"0_2_jingxuan_19"},{"_id":342456,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1PEWkLpXXXXb4XVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款日系百搭纯色长裤纯棉工装裤男士裤子韩版修身休闲裤","coupon_price":"119.00","price":"259.00","saveCount":150,"isv_code":"0_2_jingxuan_19"},{"_id":332054,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1VCXbMXXXXXcSXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装韩版时尚骷髅头印花卫衣 男套头圆领青年潮牌男装","coupon_price":"128.00","price":"135.00","saveCount":57,"isv_code":"0_2_jingxuan_19"},{"_id":342363,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1We_GLVXXXXbVXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新款 百搭圆领男士时尚印花长袖卫衣","coupon_price":"109.00","price":"109.00","saveCount":148,"isv_code":"0_2_jingxuan_19"},{"_id":342049,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1aN3fLFXXXXaiXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款复古牛仔夹克男韩版修身牛仔外套男潮男牛仔衣服日系","coupon_price":"79.00","price":"128.00","saveCount":192,"isv_code":"0_2_jingxuan_19"},{"_id":283432,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1qNA_LVXXXXXLaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春季纯棉长袖T恤男圆领纯白色学生青年薄款打底衫潮流上衣服血桖","coupon_price":"62.00","price":"148.00","saveCount":90,"isv_code":"0_2_jingxuan_19"},{"_id":339780,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1IbTjLFXXXXbuaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Deere Jane男装外套春季青年修身薄款外衣日系复古印花短款夹克男","coupon_price":"138.00","price":"298.00","saveCount":227,"isv_code":"0_2_jingxuan_19"},{"_id":330887,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1P6ptMXXXXXceXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21 运动休闲裤男士裤子 修身小脚工装裤 春装男装潮男长裤子","coupon_price":"109.00","price":"299.00","saveCount":8,"isv_code":"0_2_jingxuan_19"},{"_id":342069,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1rqNdMXXXXXb5XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016新款纯色连帽夹克外套男韩版百搭男装","coupon_price":"197.80","price":"198.00","saveCount":145,"isv_code":"0_2_jingxuan_19"},{"_id":338987,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1cMJjMXXXXXczXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"【预售】春装男士修身日系连帽休闲夹克潮 青年外套 薄 男I50751A","coupon_price":"209.00","price":"429.00","saveCount":164,"isv_code":"0_2_jingxuan_19"},{"_id":342050,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1dtdCHpXXXXadaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"英伦男士9分裤竖条纹小脚哈伦裤韩版九分休闲裤潮男修身","coupon_price":"59.00","price":"399.00","saveCount":214,"isv_code":"0_2_jingxuan_19"},{"_id":339588,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1k.fVLXXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男装春秋长袖衬衫青少年文艺个性格子字母印花潮男士修身衬衣","coupon_price":"68.00","price":"135.00","saveCount":135,"isv_code":"0_2_jingxuan_19"},{"_id":339758,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1MGE6LVXXXXcDaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春装新款 男士青少年纯棉小直筒男装韩版潮男裤子","coupon_price":"89.90","price":"99.00","saveCount":67,"isv_code":"0_2_jingxuan_19"},{"_id":332046,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1QNwRKVXXXXbgXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"衣品天成 男式套头毛衣2016春装新款男装针织衫时尚韩版潮6ME002","coupon_price":"208.00","price":"208.00","saveCount":135,"isv_code":"0_2_jingxuan_19"},{"_id":339712,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB10HXhMXXXXXbHXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"21男装弹力低腰修身小脚牛仔裤 2016夏装新品时尚长裤潮男裤子","coupon_price":"149.00","price":"309.00","saveCount":125,"isv_code":"0_2_jingxuan_19"},{"_id":341807,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB110NxMXXXXXcdXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春季新款男装男士韩版潮流卫衣套装圆领黑白拼色棒球服修身潮外套","coupon_price":"99.00","price":"209.00","saveCount":165,"isv_code":"0_2_jingxuan_19"},{"_id":341816,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1YiwRLFXXXXaDXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"Deere Jane男装衬衫 青年韩版长袖衬衣 春季潮男休闲衣服免烫寸衫","coupon_price":"99.00","price":"208.00","saveCount":113,"isv_code":"0_2_jingxuan_19"},{"_id":339679,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1hTdyLVXXXXX7XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21插肩袖条纹学院风男装长袖卫衣 2016春装新品时尚舒适潮男上衣","coupon_price":"135.00","price":"239.00","saveCount":172,"isv_code":"0_2_jingxuan_19"},{"_id":341811,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1acMwLFXXXXbgXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"潮男青年休闲裤日系复古修身工装裤男士春季长裤男裤","coupon_price":"118.00","price":"248.00","saveCount":160,"isv_code":"0_2_jingxuan_19"},{"_id":339802,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1qSEmLpXXXXX1XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春季男鞋潮鞋皮鞋男士休闲鞋白鞋板鞋男真皮透气英伦学生运动鞋子","coupon_price":"108.00","price":"255.00","saveCount":194,"isv_code":"0_2_jingxuan_19"},{"_id":339382,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1YcRXMXXXXXXJaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"春装新款裤子男生小脚哈伦裤日系韩版吊裆裤修身潮男牛仔裤九分裤","coupon_price":"79.00","price":"139.00","saveCount":183,"isv_code":"0_2_jingxuan_19"},{"_id":295598,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1UkdkMXXXXXblXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"三弦男装 男士衬衫 春季修身商务长袖衬衣 韩版纯色休闲衬衫男潮","coupon_price":"89.00","price":"369.00","saveCount":87,"isv_code":"0_2_jingxuan_19"},{"_id":339801,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1i2XaMXXXXXXGaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"李宁男鞋运动鞋官方正品2016春季新款复古休闲网面透气板鞋休闲鞋","coupon_price":"199.00","price":"369.00","saveCount":191,"isv_code":"0_2_jingxuan_19"},{"_id":339769,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1CFJiMXXXXXbEXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新款男士夹克 韩版时尚青年外套","coupon_price":"178.00","price":"308.00","saveCount":206,"isv_code":"0_2_jingxuan_19"},{"_id":339519,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1zeo6LVXXXXcgXVXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"impromptu男装2016春装男士日系休闲连帽夹克外套 潮I50719A","coupon_price":"199.00","price":"349.00","saveCount":219,"isv_code":"0_2_jingxuan_19"},{"_id":339361,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1HfB7LpXXXXaBXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21男装中腰收口小脚九分裤 百搭休闲裤 2016男士春装灰色运动裤","coupon_price":"149.00","price":"269.00","saveCount":210,"isv_code":"0_2_jingxuan_19"},{"_id":339325,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1qcf6LFXXXXafXFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016男装春季休闲裤韩版修身小脚长裤 ","coupon_price":"98.00","price":"218.00","saveCount":130,"isv_code":"0_2_jingxuan_19"},{"_id":339333,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1n_dnMXXXXXceaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"男士运动裤 束脚裤休闲裤修身小脚哈伦裤 ","coupon_price":"109.00","price":"640.00","saveCount":91,"isv_code":"0_2_jingxuan_19"},{"_id":338797,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1XeERLVXXXXadapXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季新款男士牛仔夹克上衣外套韩版纯棉翻领水洗修身牛仔衣","coupon_price":"147.00","price":"258.00","saveCount":171,"isv_code":"0_2_jingxuan_19"},{"_id":294144,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1uwFlMXXXXXcMaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春季纯棉牛津纺白色衬衫","coupon_price":"109.00","price":"255.00","saveCount":195,"isv_code":"0_2_jingxuan_19"},{"_id":338961,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1mIhUMXXXXXccXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21男士牛津纺衬衫 男装青年简约休闲修身纯色衬衣长袖上衣 新品","coupon_price":"109.00","price":"239.00","saveCount":150,"isv_code":"0_2_jingxuan_19"},{"_id":249584,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1xlIAJFXXXXbgXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"回力男鞋春季白色帆布鞋男春低帮板鞋女休闲鞋男士布鞋学生鞋子潮","coupon_price":"59.00","price":"168.00","saveCount":99,"isv_code":"0_2_jingxuan_19"},{"_id":243932,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1K.4QMXXXXXbOXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"人本男鞋韩版棉麻系带柔软低帮鞋 纯色休闲板鞋春季学生帆布鞋 男","coupon_price":"69.00","price":"139.00","saveCount":185,"isv_code":"0_2_jingxuan_19"},{"_id":338805,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1CnSRLFXXXXcpaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016青少年夹克男士条纹潮流韩版棒球服开衫日系原宿风春秋薄外套","coupon_price":"168.00","price":"198.00","saveCount":200,"isv_code":"0_2_jingxuan_19"},{"_id":246876,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1KCHJJVXXXXa6XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"苎萝日系春季男士弹力牛仔裤修身款小脚牛仔长裤复古休闲男裤子潮","coupon_price":"99.00","price":"299.00","saveCount":200,"isv_code":"0_2_jingxuan_19"},{"_id":332158,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1WybQLXXXXXb0XXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"A21男装圆领套头长袖印花字母长袖卫衣 青春时尚百搭潮男春装新品","coupon_price":"119.00","price":"209.00","saveCount":60,"isv_code":"0_2_jingxuan_19"},{"_id":338342,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1s1I.LXXXXXcpXXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"2016春秋装潮男士韩版套头印花卫衣 ","coupon_price":"99.00","price":"190.00","saveCount":162,"isv_code":"0_2_jingxuan_19"},{"_id":338297,"pic_url":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1ZRQQLpXXXXbZXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"布衣传说原创男装 欧美简洁时尚男卫衣 百搭圆领休闲潮款外套","coupon_price":"89.00","price":"89.00","saveCount":154,"isv_code":"0_2_jingxuan_19"},{"_id":296790,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1bao7LVXXXXbcaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"衣品天成 2016春装新品 修身牛仔裤子 潮韩版 男装青年牛仔长裤男","coupon_price":"128.00","price":"278.00","saveCount":188,"isv_code":"0_2_jingxuan_19"},{"_id":332280,"pic_url":"http://img02.taobaocdn.com/bao/uploaded/i2/TB1iDYTKVXXXXX1XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"【限时特惠】男士冬季新款纯棉休闲裤 韩版潮男裤 ","coupon_price":"128.00","price":"148.00","saveCount":143,"isv_code":"0_2_jingxuan_19"},{"_id":327915,"pic_url":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1ko8kMXXXXXciXpXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"all in 2016春季男装 欧美街头格子花纹男士休闲裤修身小脚裤男裤","coupon_price":"170.00","price":"199.00","saveCount":180,"isv_code":"0_2_jingxuan_19"},{"_id":329707,"pic_url":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1hCKRKFXXXXc5XFXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg","title":"SIR7男士加绒牛仔裤男裤冬季韩版修身小脚裤复古长裤子加厚保暖裤","coupon_price":"109.00","price":"189.00","saveCount":162,"isv_code":"0_2_jingxuan_19"}]
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

    public static class UserEntity implements Serializable{
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

    public static class DataEntity implements Serializable{
        /**
         * campain_name : 精选
         * campain_icon :
         * campain_icon2 :
         * campain_color :
         * show_price : true
         */

        private CampaignKindEntity campaignKind;
        /**
         * _id : 345459
         * pic_url : http://img02.taobaocdn.com/bao/uploaded/i2/TB1qdo4LVXXXXaAaXXXXXXXXXXX_!!0-item_pic.jpg_450x10000q75.jpg
         * title : 2016春装新款纯棉长袖衬衫男修身条纹拼接休闲衬衣立领
         * coupon_price : 139.00
         * price : 399.00
         * saveCount : 108
         * isv_code : 0_2_jingxuan_19
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

        public static class CampaignKindEntity implements Serializable{
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

        public static class ItemDetailEntity implements Serializable{
            private int _id;
            private String pic_url;
            private String title;
            private String coupon_price;
            private String price;
            private int saveCount;
            private String isv_code;

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
        }
    }
}

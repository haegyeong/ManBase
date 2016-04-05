package cn.jmpt.manbase.bean;

/**
 * Created by Administrator on 2016-03-30.
 */
public class JinPin {
    private String _id;
    private String pic_url;
    private String title;
    private String price;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public JinPin(String _id, String pic_url, String title, String price) {
        this._id = _id;
        this.pic_url = pic_url;
        this.title = title;
        this.price = price;
    }

    public JinPin() {
    }
}

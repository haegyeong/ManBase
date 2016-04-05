package cn.jmpt.manbase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.SingleProduct;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleProductAdapter extends DefaultAdapter {
    private List<SingleProduct.DataEntity> products;

    public SingleProductAdapter(List<SingleProduct.DataEntity> products) {
        super(products);
        this.products = products;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_recommed, null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.iv_baoyou = (ImageView) convertView.findViewById(R.id.iv_baoyou);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            viewHolder.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            viewHolder.line = convertView.findViewById(R.id.line);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.iv_baoyou.setVisibility(View.GONE);
        viewHolder.line.setVisibility(View.GONE);
        SingleProduct.DataEntity singleProduct = products.get(position);
        ImageLoader.getInstance().displayImage(singleProduct.getPic_url(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_info.setText(singleProduct.getTitle());
        viewHolder.tv_price.setText("￥" + singleProduct.getCoupon_price());
        return convertView;
    }

    class ViewHolder {
        private ImageView iv_image;
        private TextView tv_info;
        private TextView tv_price;
        private ImageView iv_baoyou;
        private View line;

    }
}

package cn.jmpt.manbase.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.DaylyDetail;
import cn.jmpt.manbase.bean.SingleListProduct;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-31.
 */
public class ProductListAdapter extends DefaultAdapter {
    private List<SingleListProduct.DataEntity> data;

    public ProductListAdapter(List<SingleListProduct.DataEntity> data) {
        super(data);
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ProductViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ProductViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_recommed, null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            viewHolder.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            viewHolder.line = convertView.findViewById(R.id.line);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ProductViewHolder) convertView.getTag();
        }
        viewHolder.line.setVisibility(View.GONE);
        SingleListProduct.DataEntity dataEntity = data.get(position);
        ImageLoader.getInstance().displayImage(dataEntity.getPic_url(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_info.setText(dataEntity.getTitle());
        viewHolder.tv_price.setText("￥" + dataEntity.getCoupon_price());
        return convertView;
    }

    class ProductViewHolder {
        private ImageView iv_image;
        private TextView tv_info;
        private TextView tv_price;
        private View line;

    }
}

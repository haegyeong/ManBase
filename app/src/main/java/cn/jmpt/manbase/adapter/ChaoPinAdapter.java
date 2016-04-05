package cn.jmpt.manbase.adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.ChaoPin;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-29.
 */
public class ChaoPinAdapter extends DefaultAdapter {

    private List<ChaoPin.DataEntity.ItemDetailEntity> itemDetail;
    private String TAG = "main";

    public ChaoPinAdapter(List<ChaoPin.DataEntity.ItemDetailEntity> itemDetail) {
        super(itemDetail);
        this.itemDetail = itemDetail;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChaoPinViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ChaoPinViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_chaopin, null);
            viewHolder.iv_yesterday = (ImageView) convertView.findViewById(R.id.iv_yesterday);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_save = (TextView) convertView.findViewById(R.id.tv_save);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            viewHolder.tv_description = (TextView) convertView.findViewById(R.id.tv_description);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ChaoPinViewHolder) convertView.getTag();
        }
        ChaoPin.DataEntity.ItemDetailEntity itemDetailEntity = itemDetail.get(position);
//        Picasso.with(UIUtils.getContext()).load(itemDetailEntity.getPic_url()).into(viewHolder.iv_image);
        ImageLoader.getInstance().displayImage(itemDetailEntity.getPic_url(), viewHolder.iv_image, UIUtils.getOptions());
        if (itemDetailEntity.getIcon_type() == 2) {
            Log.e(TAG, "getIcon_type: " + itemDetailEntity.getIcon_type());
            viewHolder.iv_yesterday.setVisibility(View.VISIBLE);
        } else {
            viewHolder.iv_yesterday.setVisibility(View.GONE);
        }
        Log.e(TAG, "getSaveCount: "+itemDetailEntity.getSaveCount() );
        viewHolder.tv_save.setText(itemDetailEntity.getSaveCount() + "");
        viewHolder.tv_title.setText(itemDetailEntity.getTitle());
        viewHolder.tv_price.setText("￥" + itemDetailEntity.getPrice());
        viewHolder.tv_description.setText(itemDetailEntity.getDescription());
        return convertView;
    }

    class ChaoPinViewHolder {
        private ImageView iv_yesterday;
        private ImageView iv_image;
        private TextView tv_save;
        private TextView tv_title;
        private TextView tv_price;
        private TextView tv_description;
    }
}

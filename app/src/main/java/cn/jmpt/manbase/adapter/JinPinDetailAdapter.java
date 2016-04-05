package cn.jmpt.manbase.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.JinPin;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-30.
 */
public class JinPinDetailAdapter extends DefaultAdapter {
    private List<JinPin> jinPins;

    public JinPinDetailAdapter(List<JinPin> jinPins) {
        super(jinPins);
        this.jinPins = jinPins;
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
        Log.e("main", "getView: " + jinPins.get(position).getPrice());
        viewHolder.iv_baoyou.setVisibility(View.VISIBLE);
        viewHolder.line.setVisibility(View.GONE);
        JinPin jinPin = jinPins.get(position);
//        Picasso.with(UIUtils.getContext()).load(jinPin.getPic_url()).into(viewHolder.iv_image);
        ImageLoader.getInstance().displayImage(jinPin.getPic_url(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_info.setText(jinPin.getTitle());
        viewHolder.tv_price.setText("￥" + jinPin.getPrice());
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

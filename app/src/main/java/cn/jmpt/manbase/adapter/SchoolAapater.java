package cn.jmpt.manbase.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.ADDetailActvity;
import cn.jmpt.manbase.bean.School;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-27.
 */
public class SchoolAapater extends DefaultAdapter {
    private List<School.DataEntity> data;

    public SchoolAapater(List<School.DataEntity> data) {
        super(data);
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_school, null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final School.DataEntity dataEntity = data.get(position);
//        Picasso.with(UIUtils.getContext()).load(dataEntity.getImage()).into(viewHolder.iv_image);
        ImageLoader.getInstance().displayImage(dataEntity.getImage(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_title.setText(dataEntity.getTitle());
        viewHolder.tv_info.setText(dataEntity.getInfo());

        return convertView;
    }

    class ViewHolder {
        private ImageView iv_image;
        private TextView tv_title;
        private TextView tv_info;

    }

}

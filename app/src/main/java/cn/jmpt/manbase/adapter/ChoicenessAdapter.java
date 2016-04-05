package cn.jmpt.manbase.adapter;

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
import cn.jmpt.manbase.bean.Group;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-26.
 */
public class ChoicenessAdapter extends DefaultAdapter {
    List<Group.DataEntity.SchoolEntity> school;
    private String TAG = "main";

    public ChoicenessAdapter(List school) {
        super(school);
        this.school = school;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_home_school, null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            viewHolder.tv_clickCount = (TextView) convertView.findViewById(R.id.tv_clickCount);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Group.DataEntity.SchoolEntity schoolEntity = school.get(position);
//        Picasso.with(UIUtils.getContext()).load(schoolEntity.getImage()).into(viewHolder.iv_image);
        ImageLoader.getInstance().displayImage(schoolEntity.getImage(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_info.setText(schoolEntity.getInfo());
        viewHolder.tv_clickCount.setText(schoolEntity.getClickCount() + "");
        return convertView;
    }

    class ViewHolder {
        private ImageView iv_image;
        private TextView tv_info;
        private TextView tv_clickCount;

    }
}

package cn.jmpt.manbase.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyGridView;
import cn.jmpt.manbase.bean.GroupJinXuan;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-04-01.
 */
public class GroupJinXuanAdapter extends DefaultAdapter {
    private List<GroupJinXuan.DataEntity> data;

    public GroupJinXuanAdapter(List<GroupJinXuan.DataEntity> data) {
        super(data);
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyVivewHolder vivewHolder;
        GroupJinXuan.DataEntity dataEntity = data.get(position);
        if (convertView == null) {
            vivewHolder = new MyVivewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_group_jinxuan, null);
            vivewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            vivewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            convertView.setTag(vivewHolder);
        } else {
            vivewHolder = (MyVivewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(dataEntity.getBig_image()
                , vivewHolder.iv_image, UIUtils.getOptions());
        vivewHolder.tv_info.setText(dataEntity.getInfo());
        return convertView;
    }

    class MyVivewHolder {
        private ImageView iv_image;
        private TextView tv_info;
    }

}

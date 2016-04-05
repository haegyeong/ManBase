package cn.jmpt.manbase.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.GroupCategory;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-04-01.
 */
public class GroupCategyGridviewAdapter extends DefaultAdapter {
    private List<GroupCategory.DataEntity.ItemsEntity> items;

       public GroupCategyGridviewAdapter(List<GroupCategory.DataEntity.ItemsEntity> items) {
        super(items);
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Class cls  =parent.getParent().getClass();
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_group_category, null);
            viewHolder.iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(items.get(position).
                getClassify_icon(), viewHolder.iv_icon, UIUtils.getOptions());
        viewHolder.tv_title.setText(items.get(position).getClassify_name());
        return convertView;
    }

    class ViewHolder {
        private ImageView iv_icon;
        private TextView tv_title;
    }
}

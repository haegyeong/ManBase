package cn.jmpt.manbase.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.SingleCategory;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleCategoryAdapter extends DefaultAdapter {
    private List<SingleCategory.DataEntity.CategoriesEntity> categories;

    public SingleCategoryAdapter(List<SingleCategory.DataEntity.CategoriesEntity> categories) {
        super(categories);
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CategoryViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new CategoryViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_single_category, null);
            viewHolder.iv_icon = (ImageView) convertView.findViewById(R.id.iv_cateIcon);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (CategoryViewHolder) convertView.getTag();
        }
        SingleCategory.DataEntity.CategoriesEntity categoriesEntity = categories.get(position);
        ImageLoader.getInstance().displayImage(categoriesEntity.getCateimg(), viewHolder.iv_icon, UIUtils.getOptions());
        viewHolder.tv_title.setText(categoriesEntity.getName());
        return convertView;
    }

    class CategoryViewHolder {
        private ImageView iv_icon;
        private TextView tv_title;
    }
}

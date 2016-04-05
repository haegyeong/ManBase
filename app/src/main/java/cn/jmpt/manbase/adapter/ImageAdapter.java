package cn.jmpt.manbase.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-29.
 */
public class ImageAdapter extends BaseAdapter {

    private String[] imgs;

    public ImageAdapter(String[] imgs) {
        this.imgs = imgs;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return imgs[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(UIUtils.getContext(), R.layout.item_image, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv);
//        Picasso.with(UIUtils.getContext()).load(imgs[position]).into(imageView);
        ImageLoader.getInstance().displayImage(imgs[position], imageView, UIUtils.getOptions());
        return view;
    }
}

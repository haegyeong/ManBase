package cn.jmpt.manbase.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Group;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-27.
 */
public abstract class DefaultAdapter<T> extends BaseAdapter {
    private List<T> T;

    public DefaultAdapter(List<T> T) {
        this.T = T;
    }

    @Override
    public int getCount() {
        return T.size();
    }

    @Override
    public Object getItem(int position) {
        return T.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);
}

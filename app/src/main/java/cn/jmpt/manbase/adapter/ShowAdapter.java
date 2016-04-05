package cn.jmpt.manbase.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Show;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-27.
 */
public class ShowAdapter extends DefaultAdapter {

    private List<Show.DataEntity> data;

    public ShowAdapter(List<Show.DataEntity> data) {
        super(data);
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ShowViewHolder viewHolder = null;

        if (convertView == null) {
            viewHolder = new ShowViewHolder();
            convertView = View.inflate(parent.getContext(), R.layout.item_show, null);
            viewHolder.iv_heard = (ImageView) convertView.findViewById(R.id.iv_heard);
            viewHolder.tv_username = (TextView) convertView.findViewById(R.id.tv_username);
            viewHolder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            viewHolder.iv_show = (ImageView) convertView.findViewById(R.id.iv_show);
            viewHolder.tv_comment_coument = (TextView) convertView.findViewById(R.id.tv_comment_count);
            viewHolder.tv_like_coument = (TextView) convertView.findViewById(R.id.tv_like_count);
            viewHolder.tv_share = (TextView) convertView.findViewById(R.id.tv_share);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ShowViewHolder) convertView.getTag();
        }
        Show.DataEntity dataEntity = data.get(position);
//        Picasso.with(UIUtils.getContext()).load(dataEntity.getHead_pic()).into(viewHolder.iv_heard);
        ImageLoader.getInstance().displayImage(dataEntity.getHead_pic(), viewHolder.iv_heard, UIUtils.getOptions());
        viewHolder.tv_username.setText(dataEntity.getNick_name());
        viewHolder.tv_time.setText(dataEntity.getCreate_time());
        viewHolder.tv_info.setText(dataEntity.getComment());
//        Picasso.with(UIUtils.getContext()).load(dataEntity.getImage()).into(viewHolder.iv_show);
        ImageLoader.getInstance().displayImage(dataEntity.getImage(), viewHolder.iv_show, UIUtils.getOptions());
        viewHolder.tv_comment_coument.setText(dataEntity.getComment_count() + "");
        viewHolder.tv_like_coument.setText(dataEntity.getLike_count() + "");
//        viewHolder.tv_share.setOnClickListener();

        return convertView;
    }

    class ShowViewHolder {
        private TextView tv_username;
        private TextView tv_info;
        private ImageView iv_heard;
        private ImageView iv_show;
        private TextView tv_time;
        private TextView tv_like_coument;
        private TextView tv_comment_coument;
        private TextView tv_share;
    }
}

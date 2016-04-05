package cn.jmpt.manbase.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.bean.Group;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-26.
 */
public class GroupAdapter extends DefaultAdapter implements View.OnClickListener {
    private List<Group.DataEntity.MatchEntity> match;
    private int index;
    private Group.DataEntity.MatchEntity matchEntity;

    public GroupAdapter(List match) {
        super(match);
        this.match = match;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        index = position;
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_home_group, parent, false);
            viewHolder.big_image = ((ImageView) convertView.findViewById(R.id.big_image));
            viewHolder.pic_one = ((ImageView) convertView.findViewById(R.id.pic_one));
            viewHolder.pic_two = ((ImageView) convertView.findViewById(R.id.pic_two));
            viewHolder.pic_three = ((ImageView) convertView.findViewById(R.id.pic_three));
//            viewHolder.big_image.setOnClickListener(this);
//            viewHolder.pic_one.setOnClickListener(this);
//            viewHolder.pic_two.setOnClickListener(this);
//            viewHolder.pic_three.setOnClickListener(this);
            viewHolder.tv_info = ((TextView) convertView.findViewById(R.id.tv_info));
            viewHolder.layout_tags = ((LinearLayout) convertView.findViewById(R.id.layout_tags));
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        matchEntity = match.get(position);

//        Picasso.with(UIUtils.getContext()).load(matchEntity.getBig_image()).into(viewHolder.big_image);
//        Picasso.with(UIUtils.getContext()).load(matchEntity.getSingleItems().get(0).getPic_url()).into(viewHolder.pic_one);
//        Picasso.with(UIUtils.getContext()).load(matchEntity.getSingleItems().get(1).getPic_url()).into(viewHolder.pic_two);
//        Picasso.with(UIUtils.getContext()).load(matchEntity.getSingleItems().get(2).getPic_url()).into(viewHolder.pic_three);

        ImageLoader.getInstance().displayImage(matchEntity.getBig_image(), viewHolder.big_image, UIUtils.getOptions());
        ImageLoader.getInstance().displayImage(matchEntity.getSingleItems().get(0).getPic_url(), viewHolder.pic_one, UIUtils.getOptions());
        ImageLoader.getInstance().displayImage(matchEntity.getSingleItems().get(1).getPic_url(), viewHolder.pic_two, UIUtils.getOptions());
        ImageLoader.getInstance().displayImage(matchEntity.getSingleItems().get(2).getPic_url(), viewHolder.pic_three, UIUtils.getOptions());

        viewHolder.tv_info.setText(matchEntity.getInfo());

        List<Group.DataEntity.MatchEntity.TagsEntity> tags = matchEntity.getTags();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        for (int i = 0; i < tags.size(); i++) {
            TextView tv = new TextView(UIUtils.getContext());
            tv.setText(tags.get(i).getTagName());
            params.rightMargin = UIUtils.dp2px(5);
            tv.setPadding(UIUtils.dp2px(8), UIUtils.dp2px(2), UIUtils.dp2px(8), UIUtils.dp2px(2));
            tv.setLayoutParams(params);
            tv.setTextColor(Color.rgb(107, 211, 224));
            tv.setTextSize(13);
            tv.setBackgroundResource(R.drawable.button_bg);
            viewHolder.layout_tags.addView(tv);
        }
        return convertView;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        switch (v.getId()) {
            case R.id.big_image:
                Intent intent2 = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("collocation_id", matchEntity.getCollocation_id());
                UIUtils.getContext().startActivity(intent2);
                break;
            case R.id.pic_one:
                intent.putExtra("item_id", matchEntity.getSingleItems().get(0).getItem_id());
                break;
            case R.id.pic_two:
                intent.putExtra("item_id", matchEntity.getSingleItems().get(1).getItem_id());
                break;
            case R.id.pic_three:
                intent.putExtra("item_id", matchEntity.getSingleItems().get(2).getItem_id());
                break;
        }
        UIUtils.getContext().startActivity(intent);
    }

    class ViewHolder {
        private ImageView big_image;
        private ImageView pic_one;
        private ImageView pic_two;
        private ImageView pic_three;
        private TextView tv_info;
        private LinearLayout layout_tags;

    }
}

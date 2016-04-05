package cn.jmpt.manbase.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.activity.ADDetailActvity;
import cn.jmpt.manbase.bean.Category;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-26.
 */
public class ADAdapter extends PagerAdapter {

    private ArrayList<ImageView> adImgs;
    private List<Category.DataEntity> dataEntities;
    private Context context;

    public ADAdapter(Context context, ArrayList<ImageView> adImgs, List<Category.DataEntity> dataEntities) {
        this.adImgs = adImgs;
        this.dataEntities = dataEntities;
        this.context = context;
    }


    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        ImageView ad = adImgs.get(position % adImgs.size());
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ADDetailActvity.class);
                Bundle bundle = new Bundle();
                Category.DataEntity dataEntity = dataEntities.get(position % adImgs.size());
                bundle.putString("url", dataEntity.getTheme_link());
                bundle.putString("title", dataEntity.getTheme_name());
                bundle.putInt("allow_share", dataEntity.getAllow_share());
                intent.putExtras(bundle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });
        container.addView(ad);
        return ad;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}

package cn.jmpt.manbase.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.TodayDetailSingleItemAdapter;
import cn.jmpt.manbase.bean.TodayDetail;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-28.
 */
public class TodayDetailActivity extends AppCompatActivity implements Constant.OnTodayDetailListener {


    private TitleLayout titleLayout;
    private TodayDetail.DataEntity dataEntity;
    private TextView tv_savecount;
    private ImageView iv_pic;
    private TextView tv_title;
    private TextView tv_info;
    private LinearLayout layout_tags;
    private RecyclerView recyclerView;
    private TodayDetailSingleItemAdapter adapter;
    private String TAG = "main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_detail);
        int collocation_id = getIntent().getIntExtra("collocation_id", 0);

        downloadData(collocation_id);
        initView();
    }

    private void initView() {
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.setTv_title("搭配详情");
        titleLayout.getIv_left().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        titleLayout.getIv_right().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TodayDetailActivity.this, "分享成功", Toast.LENGTH_SHORT).show();
            }
        });
        tv_savecount = ((TextView) findViewById(R.id.tv_saveCount));
        iv_pic = ((ImageView) findViewById(R.id.iv_pic));
        tv_title = ((TextView) findViewById(R.id.tv_title));
        layout_tags = ((LinearLayout) findViewById(R.id.layout_tags));
        tv_info = ((TextView) findViewById(R.id.tv_info));
        recyclerView = ((RecyclerView) findViewById(R.id.recyclerView));
    }

    private void downloadData(int collocation_id) {
        String path = UrlSet.TODAY_DETAIL.replaceAll("@", collocation_id + "");
        Log.e(TAG, "downloadData:path= " + path);
        Constant.getTodayDetail(path, this);
    }

    @Override
    public void getTodayDetail(TodayDetail todayDetail) {
        this.dataEntity = todayDetail.getData();
        showView();
    }

    private void showView() {
        tv_savecount.setText(dataEntity.getSaveCount() + "");
//        Picasso.with(this).load(dataEntity.getBig_image()).into(iv_pic);
        ImageLoader.getInstance().displayImage(dataEntity.getBig_image(), iv_pic, UIUtils.getOptions());
        tv_title.setText(dataEntity.getInfo());
        tv_info.setText(dataEntity.getLong_info());
        showTags();//显示标签
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<TodayDetail.DataEntity.SingleItemsEntity> singleItems = dataEntity.getSingleItems();
//        adapter = new TodayDetailSingleItemAdapter(singleItems);
        adapter = new TodayDetailSingleItemAdapter(dataEntity);
        recyclerView.setAdapter(adapter);
    }

    private void showTags() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        for (int i = 0; i < dataEntity.getTags().size(); i++) {
            List<TodayDetail.DataEntity.TagsEntity> tags = dataEntity.getTags();
            TextView tv = new TextView(UIUtils.getContext());
            tv.setText(tags.get(i).getTagName());
            params.rightMargin = UIUtils.dp2px(5);
            tv.setPadding(UIUtils.dp2px(8), UIUtils.dp2px(2), UIUtils.dp2px(8), UIUtils.dp2px(2));
            tv.setLayoutParams(params);
            tv.setTextColor(Color.rgb(107, 211, 224));
            tv.setTextSize(13);
            tv.setBackgroundResource(R.drawable.button_bg);
            layout_tags.addView(tv);
        }
    }
}

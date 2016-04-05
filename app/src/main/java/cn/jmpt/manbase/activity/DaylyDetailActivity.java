package cn.jmpt.manbase.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.DaylyDetailAdapter;

/**
 * Created by Administrator on 2016-03-29.
 */
public class DaylyDetailActivity extends AppCompatActivity {

    private TitleLayout titleLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public static int kind_id;
    private String title;
    private String[] tabName;
    private DaylyDetailAdapter adapter;
    private String TAG = "main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_detail);
        initData();
        initView();
    }

    private void initData() {
        Intent intent = getIntent();
        kind_id = intent.getIntExtra("kind_id", 0);
        title = intent.getStringExtra("title");
        tabName = getResources().getStringArray(R.array.tabName);

    }

    private void initView() {
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.getIv_left().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tabLayout = ((TabLayout) findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        titleLayout.setTv_title(title);
        adapter = new DaylyDetailAdapter(getSupportFragmentManager(), tabName);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

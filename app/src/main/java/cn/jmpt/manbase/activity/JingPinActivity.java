package cn.jmpt.manbase.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.JinPinAdapter;

/**
 * Created by Administrator on 2016-03-29.
 */
public class JingPinActivity extends AppCompatActivity {

    private TitleLayout titleLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] price;
    private JinPinAdapter adapter;
    private String title;
    private String[] qinglv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jingpin);
        title = getIntent().getStringExtra("title");
        initData();
        initView();
    }

    private void initData() {
        price = getResources().getStringArray(R.array.Jinpin);
        qinglv = getResources().getStringArray(R.array.Qinglv);
    }

    private void initView() {
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.setTv_title(title);
        titleLayout.getIv_left().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tabLayout = ((TabLayout) findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        if (title.equals("精品小街")) {
            adapter = new JinPinAdapter(getSupportFragmentManager(), price);
        } else {
            adapter = new JinPinAdapter(getSupportFragmentManager(), qinglv);
        }
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        tabLayout.setupWithViewPager(viewPager);
    }
}

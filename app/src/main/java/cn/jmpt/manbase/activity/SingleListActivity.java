package cn.jmpt.manbase.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.RecommedAdapter;
import cn.jmpt.manbase.adapter.SingleListAdapter;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleListActivity extends AppCompatActivity {

    private TitleLayout titleLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] tabName;
    private RecommedAdapter adapter;
    private SingleListAdapter singleListAdapter;
    private int cate_id;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list);
        cate_id = getIntent().getIntExtra("cate_id", 0);
        title = getIntent().getStringExtra("title");
        initData();
        initView();
    }

    private void initData() {
        tabName = getResources().getStringArray(R.array.tabName);
    }

    private void initView() {
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.setTv_title(title);
        tabLayout = ((TabLayout) findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        singleListAdapter = new SingleListAdapter(getSupportFragmentManager(), tabName,cate_id  );
        viewPager.setAdapter(singleListAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

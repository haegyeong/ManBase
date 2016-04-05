package cn.jmpt.manbase.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.adapter.SplashAdapter;

/**
 * Created by Administrator on 2016-03-26.
 * 闪屏页
 */
public class SplashActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout dot_layout;
    private SplashAdapter adapter;
    private int[] imgRes = {R.mipmap.splash_icon_1, R.mipmap.splash_icon_2, R.mipmap.splash_icon_3, R.mipmap.splash_icon_4};
    private List<ImageView> imgs;
    private SharedPreferences sp;
    private String TAG = "main";
    private TextView goMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = UIUtils.getSharedPreferences(this);
        boolean isFirst = sp.getBoolean("isFirst", true);
        if (!isFirst) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
//            overridePendingTransition(R.anim.alpha_in_anim,
//                    R.anim.alpha_out_anim);
        }
        setContentView(R.layout.activity_splash);
        initView();
        initData();
        showView();


    }

    private void initView() {
        viewPager = ((ViewPager) findViewById(R.id.viewPager_splash));
        dot_layout = ((LinearLayout) findViewById(R.id.dot_layout));
        goMan = ((TextView) findViewById(R.id.goMain));
    }

    private void initData() {

        imgs = new ArrayList<>();
        for (int i = 0; i < imgRes.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setBackgroundResource(imgRes[i]);
            imgs.add(iv);

            /*根据图片的张数，确定底部圆点*/
            ImageView dot = new ImageView(this);
            dot.setBackgroundResource(R.drawable.select_point);
            dot.setEnabled(false);
            dot_layout.addView(dot);
        }
    }

    private void showView() {
        adapter = new SplashAdapter(imgs);
        viewPager.setAdapter(adapter);
        dot_layout.getChildAt(0).setEnabled(true);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dot_layout.getChildCount(); i++) {
                    dot_layout.getChildAt(i).setEnabled(position == i);
                }
                if (position == imgRes.length - 1) {
                    goMan.setVisibility(View.VISIBLE);
                } else {
                    goMan.setVisibility(View.GONE);
                }
            }
        });
    }

    /**
     * 立即体验
     */
    public void goMain(View view) {
        sp.edit().putBoolean("isFirst", false).commit();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

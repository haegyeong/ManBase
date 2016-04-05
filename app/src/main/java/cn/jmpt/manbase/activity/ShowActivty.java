package cn.jmpt.manbase.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.ShowAdapter;
import cn.jmpt.manbase.bean.Show;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-27.
 */
public class ShowActivty extends AppCompatActivity implements Constant.OnShowListener {

    private ListView lv_show;
    private ShowAdapter adapter;
    private Show show;
    private String TAG = "ShowActivty";
    private TitleLayout titleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initDownDate();


    }

    private void initView() {
        setContentView(R.layout.home_theme_show);
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.getIv_left().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        titleLayout.getIv_right().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShowActivty.this, "拍照show一下", Toast.LENGTH_SHORT).show();
            }
        });
        lv_show = ((ListView) this.findViewById(R.id.lv_show));
    }

    private void initDownDate() {
        Constant.getShow(UrlSet.SHOW, this);
    }

    @Override
    public void getShow(Show show) {
        this.show = show;
        showView();
    }

    private void showView() {
        List<Show.DataEntity> data = show.getData();
        adapter = new ShowAdapter(data);
        lv_show.setAdapter(adapter);
    }
}

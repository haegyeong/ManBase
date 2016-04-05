package cn.jmpt.manbase.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.GroupJinXuanAdapter;
import cn.jmpt.manbase.bean.GroupJinXuan;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-04-01.
 */
public class GroupDetailListActivity extends AppCompatActivity implements Constant.OnGroupJinXuanListener {
    private TitleLayout titleLayout;
    private GridView gridView;
    private int page = 1;
    private int classify_id;
    private int kind=1;
    private GroupJinXuan groupJinXuan;
    private String title;
    private String TAG="main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kind = getIntent().getIntExtra("kind", kind);
        classify_id = getIntent().getIntExtra("classify_id", classify_id);
        title = getIntent().getStringExtra("title");
        initView();
        downLoadData();
    }

    private void downLoadData() {
        String url = UrlSet.GROUP_CATEGORY_DETAIL.replaceAll("@classify_id", classify_id + "")
                .replaceAll("@kind", kind + "").replaceAll("@page", page + "");
        Log.e(TAG, "downLoadData: "+url );
        Constant.getGroupJinXuan(url, this);
    }

    private void initView() {
        setContentView(R.layout.activity_group);
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        titleLayout.setTv_title(title);
        gridView = ((GridView) findViewById(R.id.gridView));
    }

    @Override
    public void getGroupJinXuan(GroupJinXuan groupJinXuan) {
        this.groupJinXuan = groupJinXuan;
        showView();
    }

    private void showView() {
        List<GroupJinXuan.DataEntity> data = groupJinXuan.getData();
        GroupJinXuanAdapter adapter = new GroupJinXuanAdapter(data);
        gridView.setAdapter(adapter);
    }
}

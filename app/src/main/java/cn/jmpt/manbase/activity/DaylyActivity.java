package cn.jmpt.manbase.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.GridView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.adapter.DaylyAdapter;
import cn.jmpt.manbase.bean.Dayly;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-29.
 */
public class DaylyActivity extends AppCompatActivity implements Constant.OnDaylyListener {

    private RecyclerView recyclerView;
    private Dayly dayly;
    private DaylyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dayly);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        downLoadData();
    }

    private void downLoadData() {
        Constant.getDayly(UrlSet.DAYLIY, this);
    }

    @Override
    public void getDayly(Dayly dayly) {
        this.dayly = dayly;
        showView();
    }

    private void showView() {
        final List<Dayly.DataEntity> data = dayly.getData();
        adapter = new DaylyAdapter(data);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickLitener(new DaylyAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(UIUtils.getContext(), DaylyDetailActivity.class);
                intent.putExtra("kind_id", data.get(position).getKind_id());
                intent.putExtra("title", data.get(position).getKind_name());
                Log.e("main", "onItemClick: " + data.get(position).getKind_id() + "data.get(position).getKind_name()" + data.get(position).getKind_name());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }

            @Override
            public void onItemLongClick(View view, int position) {
            }
        });
    }
}

package cn.jmpt.manbase.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.adapter.ChaoPinAdapter;
import cn.jmpt.manbase.bean.ChaoPin;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-29.
 */
public class ChaoPinActivity extends AppCompatActivity implements Constant.OnChaoPinListener {

    private TitleLayout titleLayout;
    private ListView lv_chaopin;
    private ChaoPin chaoPin;
    private ChaoPinAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaopin);
        initView();
        downLoadData(1);
    }

    private void downLoadData(int page) {
        Constant.getChaoPin(UrlSet.CHAOPIN.replaceAll("@page", page + ""), this);

    }

    private void initView() {
        titleLayout = ((TitleLayout) findViewById(R.id.titleLayout));
        lv_chaopin = ((ListView) findViewById(R.id.lv_chaopin));
        lv_chaopin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChaoPin.DataEntity.ItemDetailEntity itemDetailEntity = (ChaoPin.DataEntity.ItemDetailEntity) adapter.getItem(position);
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.putExtra("item_id", itemDetailEntity.get_id());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public void getChaoPin(ChaoPin chaoPin) {
        this.chaoPin = chaoPin;
        showView();
    }

    private void showView() {
        List<ChaoPin.DataEntity.ItemDetailEntity> itemDetail = chaoPin.getData().getItemDetail();
        adapter = new ChaoPinAdapter(itemDetail);
        lv_chaopin.setAdapter(adapter);
    }
}

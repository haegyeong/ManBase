package cn.jmpt.manbase.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.adapter.SchoolAapater;
import cn.jmpt.manbase.bean.School;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-27.
 */
public class SchoolActivity extends AppCompatActivity implements Constant.OnSchoolListener {

    private ListView listView;
    private School school;
    private SchoolAapater adapter;
    private List<School.DataEntity> data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        listView = ((ListView) findViewById(R.id.lv_school));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                School.DataEntity dataEntity = (School.DataEntity) adapter.getItem(position);
                Intent intent = new Intent(SchoolActivity.this, ADDetailActvity.class);
                Bundle bundle = new Bundle();
                bundle.putString("url", dataEntity.getLink());
                bundle.putString("title", dataEntity.getTitle());
                bundle.putInt("allow_share", 1);
                intent.putExtras(bundle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });
        downloadData();
    }

    private void downloadData() {
        Constant.getSchool(UrlSet.SCHOOL, this);
    }

    @Override
    public void getSchool(School school) {
        this.school = school;
        showView();
    }

    private void showView() {
        data = school.getData();
        adapter = new SchoolAapater(data);
        listView.setAdapter(adapter);
    }

    public void goBack(View view) {
        finish();
    }
}

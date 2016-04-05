package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.ADDetailActvity;
import cn.jmpt.manbase.adapter.SchoolComentAdpater;
import cn.jmpt.manbase.bean.SchoolComent;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-04-01.
 */
public class SchoolContentFragment extends Fragment implements Constant.OnSchoolComtentListener {

    private int kind_id;
    private ListView listView;
    private int page = 1;
    private SchoolComent schoolComent;
    private List<SchoolComent.DataEntity> data;
    private SchoolComentAdpater adpater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kind_id = getArguments().getInt("kind_id");
        View view = initView(inflater);
        downLoadData();
        return view;
    }

    private void downLoadData() {
        String url = UrlSet.SCHOOL_TITLE_COMTENT.replaceAll("@kind", kind_id + "").replaceAll("@page", page + "");
        Constant.getSchoolComent(url, this);
    }

    @NonNull
    private View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_school_comtent, null);
        listView = ((ListView) view.findViewById(R.id.listview));
        return view;
    }

    @Override
    public void getSchoolComent(SchoolComent schoolComent) {
        this.schoolComent = schoolComent;
        showView();
    }

    private void showView() {
        data = schoolComent.getData();
        adpater = new SchoolComentAdpater(data);
        listView.setAdapter(adpater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SchoolComent.DataEntity dataEntity = (SchoolComent.DataEntity) adpater.getItem(position);
                Intent intent = new Intent(UIUtils.getContext(), ADDetailActvity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("allow_share", 1);
                bundle.putString("url", dataEntity.getLink());
                bundle.putString("title", dataEntity.getTitle());
                intent.putExtras(bundle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Toast.makeText(UIUtils.getContext(), "链接有问题", Toast.LENGTH_SHORT).show();
                UIUtils.getContext().startActivity(intent);
            }
        });
    }
}

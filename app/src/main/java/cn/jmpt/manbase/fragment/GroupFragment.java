package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyGridView;
import cn.jmpt.manbase.View.MyListView;
import cn.jmpt.manbase.activity.TodayDetailActivity;
import cn.jmpt.manbase.adapter.GroupCateAdapter;
import cn.jmpt.manbase.adapter.GroupJinXuanAdapter;
import cn.jmpt.manbase.bean.GroupCategory;
import cn.jmpt.manbase.bean.GroupJinXuan;
import cn.jmpt.manbase.bean.TodayDetail;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-26.
 */
public class GroupFragment extends Fragment implements Constant.OnGroupCategoryListener, Constant.OnGroupJinXuanListener {
    private View view;
    private MyListView listView;
    private MyGridView gridView;
    private GroupCategory groupCategory;
    private List<GroupCategory.DataEntity> data;
    private GroupJinXuan groupJinXuan;
    private GroupJinXuanAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initView(inflater, container);
        downLoadDdata();

        return view;
    }

    private void downLoadDdata() {
        Constant.getGroupCategory(UrlSet.GROUP_CATEGORY, this);
        Constant.getGroupJinXuan(UrlSet.GROUP_JINGXUAN, this);
    }

    private void initView(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_group, container, false);
        listView = ((MyListView) view.findViewById(R.id.listview));

        gridView = ((MyGridView) view.findViewById(R.id.gridView));
    }

    @Override
    public void getGroupCategory(GroupCategory groupCategory) {
        this.groupCategory = groupCategory;
        showView();
    }

    private void showView() {
        data = groupCategory.getData();
        GroupCateAdapter adapter = new GroupCateAdapter(data);
        listView.setAdapter(adapter);
    }

    @Override
    public void getGroupJinXuan(GroupJinXuan groupJinXuan) {
        this.groupJinXuan = groupJinXuan;
        showJinXuan();
    }

    private void showJinXuan() {
        List<GroupJinXuan.DataEntity> data = groupJinXuan.getData();
        adapter = new GroupJinXuanAdapter(data);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GroupJinXuan.DataEntity dataEntity = (GroupJinXuan.DataEntity) adapter.getItem(position);
                Intent intent = new Intent(UIUtils.getContext(), TodayDetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("collocation_id", dataEntity.getCollocation_id());
                UIUtils.getContext().startActivity(intent);
            }
        });
    }
}

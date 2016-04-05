package cn.jmpt.manbase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.adapter.SchoolTitleAdapter;
import cn.jmpt.manbase.bean.SchoolTitle;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-26.
 */
public class SchoolFragment extends Fragment implements Constant.OnSchoolTitleListener {
    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SchoolTitle schoolTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initView(inflater, container);
        downLoadData();
        return view;
    }

    private void downLoadData() {
        Constant.getSchoolTitle(UrlSet.SCHOOL_TITLE, this);
    }

    private void initView(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_school, container, false);
        tabLayout = ((TabLayout) view.findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) view.findViewById(R.id.viewPager));
    }

    @Override
    public void getSchoolTitle(SchoolTitle schoolTitle) {
        this.schoolTitle = schoolTitle;
        List<SchoolTitle.DataEntity> data = schoolTitle.getData();
        SchoolTitleAdapter adapter = new SchoolTitleAdapter(getActivity().getSupportFragmentManager(),data);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

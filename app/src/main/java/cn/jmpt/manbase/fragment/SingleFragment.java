package cn.jmpt.manbase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.TitleLayout;
import cn.jmpt.manbase.activity.MainActivity;
import cn.jmpt.manbase.adapter.SingCateViewpagerAdapter;
import cn.jmpt.manbase.bean.SingleCategory;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-26.
 */
public class SingleFragment extends Fragment implements Constant.OnSigleCategoryListener {
    private View view;
    private TitleLayout titleLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SingleCategory singleCategory;
    private SingCateViewpagerAdapter adapter;
    private String TAG = "main";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_single, container, false);
        initView();
        doloadData();

        return view;
    }

    private void doloadData() {
        Constant.getSingleCategory(UrlSet.SINGLE_CATEGORY, this);
    }

    private void initView() {
        titleLayout = ((TitleLayout) view.findViewById(R.id.titleLayout));
        titleLayout.getIv_right().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UIUtils.getContext(), "搜索", Toast.LENGTH_LONG).show();
            }
        });
        tabLayout = ((TabLayout) view.findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) view.findViewById(R.id.viewPager));
    }

    @Override
    public void getSingleCategory(SingleCategory singleCategory) {
        this.singleCategory = singleCategory;
        showView();
    }

    private void showView() {
        List<SingleCategory.DataEntity> data = singleCategory.getData();
        adapter = new SingCateViewpagerAdapter(MainActivity.supportFragmentManager, data);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

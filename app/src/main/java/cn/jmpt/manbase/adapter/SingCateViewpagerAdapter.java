package cn.jmpt.manbase.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.bean.SingleCategory;
import cn.jmpt.manbase.fragment.SingleCategoryFragment;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingCateViewpagerAdapter extends FragmentStatePagerAdapter {
    private List<SingleCategory.DataEntity> data;
    private List<String> titleName = new ArrayList<>();

    public SingCateViewpagerAdapter(FragmentManager fm, List<SingleCategory.DataEntity> data) {
        super(fm);
        this.data = data;
        for (int i = 0; i < data.size(); i++) {
            titleName.add(data.get(i).getName());
        }
    }

    @Override
    public Fragment getItem(int position) {
        SingleCategory.DataEntity dataEntity = data.get(position);
        SingleCategoryFragment fragment = new SingleCategoryFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("dataEntity", dataEntity);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return titleName.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleName.get(position);
    }
}

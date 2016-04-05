package cn.jmpt.manbase.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import cn.jmpt.manbase.fragment.RecommendFragment;

/**
 * Created by Administrator on 2016-03-29.
 */
public class DaylyDetailAdapter extends FragmentPagerAdapter {

    private String[] tabName;

    public DaylyDetailAdapter(FragmentManager fm, String[] tabName) {
        super(fm);
        this.tabName = tabName;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        RecommendFragment fragment = new RecommendFragment();
        if (position == 0) {
            bundle.putString("selectType", "");
        } else if (position == 1) {
            bundle.putString("selectType", "low");
        } else if (position == 2) {
            bundle.putString("selectType", "hight");
        } else if (position == 3) {
            bundle.putString("selectType", "new");
        }
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return tabName.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabName[position];
    }
}

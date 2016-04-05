package cn.jmpt.manbase.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cn.jmpt.manbase.fragment.RecommendFragment;
import cn.jmpt.manbase.fragment.SingleListFragment;

/**
 * Created by Administrator on 2016-03-29.
 */
public class SingleListAdapter extends FragmentPagerAdapter {

    private String[] tabName;
    private int cate_id;

    public SingleListAdapter(FragmentManager fm, String[] tabName, int cate_id) {
        super(fm);
        this.tabName = tabName;
        this.cate_id = cate_id;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        SingleListFragment fragment = new SingleListFragment();
        bundle.putInt("cate_id", cate_id);
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

package cn.jmpt.manbase.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import cn.jmpt.manbase.fragment.JinPinFragment;

/**
 * Created by Administrator on 2016-03-30.
 */
public class JinPinAdapter extends FragmentPagerAdapter {

    private String[] tabName;

    public JinPinAdapter(FragmentManager fm, String[] tabName) {
        super(fm);
        this.tabName = tabName;
    }

    @Override
    public Fragment getItem(int position) {
//        campaignId=2,3,4  campaignType=9.9,19.9,29.9 page=1
        JinPinFragment fragment = new JinPinFragment();
        Bundle bundle = new Bundle();
        if (tabName.length == 3) {
            bundle.putInt("flag", 0);
            if (position == 0) {
                bundle.putString("campaignId", "2");
                bundle.putString("campaignType", "9.9");
            } else if (position == 1) {
                bundle.putString("campaignId", "3");
                bundle.putString("campaignType", "19.9");
            } else if (position == 2) {
                bundle.putString("campaignId", "4");
                bundle.putString("campaignType", "29.9");
            }
        } else {
            bundle.putInt("flag", 1);
            if (position == 0) {
                bundle.putString("campaignType", "qinglv");
                bundle.putString("campaignId", "7");
            } else if (position == 1) {
                bundle.putString("campaignType", "songnvyou");
                bundle.putString("campaignId", "7");
            }
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
        Log.e("main", "getPageTitle: " + tabName[position]);
        return tabName[position];
    }
}

package cn.jmpt.manbase.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.bean.SchoolTitle;
import cn.jmpt.manbase.fragment.SchoolContentFragment;

/**
 * Created by Administrator on 2016-04-01.
 */
public class SchoolTitleAdapter extends FragmentStatePagerAdapter {
    private List<SchoolTitle.DataEntity> data;
    private List<String> title;

    public SchoolTitleAdapter(FragmentManager fm, List<SchoolTitle.DataEntity> data) {
        super(fm);
        this.data = data;
        title = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            title.add(data.get(i).getTitle());
        }
    }

    @Override
    public Fragment getItem(int position) {
        SchoolContentFragment fragment = new SchoolContentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("kind_id", data.get(position).getKind_id());
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}

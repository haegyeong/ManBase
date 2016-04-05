package cn.jmpt.manbase.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.fragment.SchoolFragment;
import cn.jmpt.manbase.fragment.GroupFragment;
import cn.jmpt.manbase.fragment.HomeFragment;
import cn.jmpt.manbase.fragment.MineFragment;
import cn.jmpt.manbase.fragment.SingleFragment;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private RadioGroup radioGroup;
    private List<Fragment> fragments;
    public static FragmentManager supportFragmentManager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        showView();
    }

    private void initView() {
        radioGroup = ((RadioGroup) findViewById(R.id.radioGropMenu));
    }

    private void initData() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new SingleFragment());
        fragments.add(new GroupFragment());
        fragments.add(new SchoolFragment());
        fragments.add(new MineFragment());

        supportFragmentManager = getSupportFragmentManager();
    }

    private void showView() {
        transaction = supportFragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragments.get(0));
        transaction.commit();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                transaction = supportFragmentManager.beginTransaction();
                for (int i = 0; i < group.getChildCount(); i++) {
                    RadioButton radioButton = (RadioButton) group.getChildAt(i);
                    if (radioButton.getId() == checkedId) {
                        radioButton.setChecked(true);
                        transaction.replace(R.id.fragmentContainer, fragments.get(i));
                    }
                }
                transaction.commit();
            }
        });
    }
}

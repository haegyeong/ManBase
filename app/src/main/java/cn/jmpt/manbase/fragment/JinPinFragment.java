package cn.jmpt.manbase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.adapter.JinPinDetailAdapter;
import cn.jmpt.manbase.bean.JinPin;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-30.
 */
public class JinPinFragment extends Fragment implements Constant.OnJinPinlListener {

//    campaignId=2,3,4  campaignType=9.9,19.9,29.9 page=1

    private GridView gridView;
    private int page = 1;
    private String campaignType;
    private String campaignId;
    private List<JinPin> jinPins;
    private String TAG = "main";
    private JinPinDetailAdapter adapter;
    private int flag = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jinpin, null);
        initView(view);
        initData();
        if (flag == 0) {
            downLoadJinPinData();
        } else if (flag == 1) {
            downLoadQingLvData();
        }
        return view;
    }

    private void initData() {
        flag = getArguments().getInt("flag");
        campaignId = getArguments().getString("campaignId");
        campaignType = getArguments().getString("campaignType");
    }

    private void initView(View view) {
        gridView = ((GridView) view.findViewById(R.id.gridView));
    }

    private void downLoadJinPinData() {
        String url = UrlSet.JINGPING.replaceAll("@campaignId", campaignId).replaceAll("@campaignType", campaignType).replaceAll("@page", page + "");
        Constant.getJinPinDetail(url, this);
    }

    private void downLoadQingLvData() {
        String url = UrlSet.QINGLV.replaceAll("@campaignId", campaignId).replaceAll("@campaignType", campaignType).replaceAll("@page", page + "");
        Constant.getJinPinDetail(url, this);
    }

    @Override
    public void getJinPin(List<JinPin> jinPins) {
        this.jinPins = jinPins;
        showView();
    }

    private void showView() {
        adapter = new JinPinDetailAdapter(jinPins);
        gridView.setAdapter(adapter);
    }
}

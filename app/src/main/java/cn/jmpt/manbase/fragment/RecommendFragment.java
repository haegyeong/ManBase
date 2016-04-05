package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.activity.DaylyDetailActivity;
import cn.jmpt.manbase.adapter.RecommedAdapter;
import cn.jmpt.manbase.bean.DaylyDetail;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-29.
 */
public class RecommendFragment extends Fragment implements Constant.OnDaylyDetailListener {
    //    private RecyclerView recyclerView;
    private int kind_id;
    private int page = 0;
    private String selectType = "";
    private DaylyDetail daylyDetail;
    private RecommedAdapter adapter;
    private String TAG = "main";
    private String url;
    //    private GridView gridView;
    private PullToRefreshGridView gridView;
    private List<DaylyDetail.DataEntity> data;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = initView(inflater);

        downLoadData();
        return view;
    }

    @NonNull
    private View initView(final LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_recommed, null);
        selectType = getArguments().getString("selectType");
//        gridView = ((GridView) view.findViewById(R.id.gridView));
        gridView = (PullToRefreshGridView) view.findViewById(R.id.gridView);
        gridView.setMode(PullToRefreshGridView.Mode.PULL_FROM_END);
        gridView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<GridView>() {
            @Override
            public void onRefresh(PullToRefreshBase<GridView> refreshView) {
                downLoadData();
            }
        });
        ILoadingLayout loadingLayoutProxy = gridView.getLoadingLayoutProxy();
        loadingLayoutProxy.setPullLabel("加载更多");  //设置属性
        loadingLayoutProxy.setReleaseLabel("释放开始加载");
        loadingLayoutProxy.setRefreshingLabel("正在加载...");
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DaylyDetail.DataEntity dataEntity = (DaylyDetail.DataEntity) adapter.getItem(position);
                int item_id = dataEntity.getItem_id();
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("item_id", item_id);
                UIUtils.getContext().startActivity(intent);
            }
        });
        return view;
    }

    private void downLoadData() {
        kind_id = DaylyDetailActivity.kind_id;
        url = UrlSet.DAYLYDETAIL.replaceAll("@kind_id", kind_id + "")
                .replaceAll("@page", (++page) + "")
                .replaceAll("@selectType", selectType);
        Log.e(TAG, "RecommendFragment: " + url);
        Constant.getDaylyDetail(url, this);
    }

    @Override
    public void getDaylyDetail(DaylyDetail daylyDetail) {
        this.daylyDetail = daylyDetail;
        if (page == 1) {
            showView();
        } else {
            if (daylyDetail == null) {
                Toast.makeText(UIUtils.getContext(), "没有更多数据了", Toast.LENGTH_SHORT).show();
                page = 0;
            } else {
                data = daylyDetail.getData();
                adapter.addData(data);
            }
            gridView.onRefreshComplete();
        }
    }

    private void showView() {
        data = daylyDetail.getData();
        adapter = new RecommedAdapter(data);
        gridView.setAdapter(adapter);
    }
}

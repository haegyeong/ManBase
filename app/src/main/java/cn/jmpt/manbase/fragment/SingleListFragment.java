package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.handmark.pulltorefresh.library.PullToRefreshGridView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.adapter.ProductListAdapter;
import cn.jmpt.manbase.bean.SingleListProduct;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleListFragment extends Fragment implements Constant.OnSingleListProductListener {
    private GridView gridView;
    private SingleListProduct singleListProduct;
    private String selectType;
    private int cate_id;
    private int page = 1;
    private ProductListAdapter listAdapter;
    private PullToRefreshGridView pullToRefresh;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = initView();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SingleListProduct.DataEntity dataEntity = (SingleListProduct.DataEntity) listAdapter.getItem(position);
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("item_id", dataEntity.get_id());
                UIUtils.getContext().startActivity(intent);
            }
        });
        Bundle bundle = getArguments();
        selectType = bundle.getString("selectType");
        cate_id = bundle.getInt("cate_id", 0);
        downLoadData();
        return view;
    }

    @NonNull
    private View initView() {
        View view = View.inflate(UIUtils.getContext(), R.layout.fragment_recommed, null);
        gridView = ((GridView) view.findViewById(R.id.gridView));
        return view;
    }

    private void downLoadData() {
        String url = UrlSet.SINGLE_PRODUCT_LIST.replaceAll("@selectType", selectType).replaceAll("@cate_id", cate_id + "").replaceAll("@page", page + "");
        Constant.getSingleListProduct(url, this);
    }

    @Override
    public void getSingleListProduct(SingleListProduct singleListProduct) {
        this.singleListProduct = singleListProduct;
        showView();
    }

    private void showView() {
        List<SingleListProduct.DataEntity> data = singleListProduct.getData();
        listAdapter = new ProductListAdapter(data);
        gridView.setAdapter(listAdapter);
    }
}

package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyGridView;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.activity.SingleListActivity;
import cn.jmpt.manbase.adapter.SingleCategoryAdapter;
import cn.jmpt.manbase.adapter.SingleProductAdapter;
import cn.jmpt.manbase.bean.SingleCategory;
import cn.jmpt.manbase.bean.SingleProduct;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-31.
 */
public class SingleCategoryFragment extends Fragment implements Constant.OnSingleProductListener {

    private MyGridView gv_category;
    private MyGridView gv_product;
    private TextView tv_title;
    private SingleCategory.DataEntity dataEntity;
    private List<SingleCategory.DataEntity.CategoriesEntity> categories;
    private SingleCategoryAdapter categoryAdapteradapter;
    private SingleProductAdapter productAdapter;
    private SingleProduct singleProduct;
    private SingleProduct.DataEntity product;
    private int page = 1;
    private String TAG = "main";
    private SingleCategory.DataEntity.CategoriesEntity categoriesEntity;
    private ScrollView scroollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_single_category, null);
        this.dataEntity = (SingleCategory.DataEntity) getArguments().getSerializable("dataEntity");
        initView(view);
        downLoadData();
        showCategory();

        return view;
    }

    private void initView(View view) {
        gv_category = ((MyGridView) view.findViewById(R.id.gv_category));
        gv_category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                categoriesEntity = (SingleCategory.DataEntity.CategoriesEntity) categoryAdapteradapter.getItem(position);

                Intent intent = new Intent(UIUtils.getContext(), SingleListActivity.class);
                intent.putExtra("cate_id", categoriesEntity.getCate_id());
                intent.putExtra("title", categoriesEntity.getName());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });

        gv_product = ((MyGridView) view.findViewById(R.id.gv_product));
        gv_product.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                product = (SingleProduct.DataEntity) productAdapter.getItem(position);
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.putExtra("item_id", product.getItem_id());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });
        tv_title = ((TextView) view.findViewById(R.id.tv_title));
    }

    private void downLoadData() {
//        cateId=@cateId&page=@page
        String url = UrlSet.SINGLE_PRODUCT.replaceAll("@cateId", dataEntity.getClassID() + "").replaceAll("@page", page + "");
        Constant.getSingleProduct(url, this);
    }

    private void showCategory() {
        categories = dataEntity.getCategories();
        Log.e(TAG, "showCategory: " + categories.get(0).getName());
        categoryAdapteradapter = new SingleCategoryAdapter(categories);
        gv_category.setAdapter(categoryAdapteradapter);
        tv_title.setText(dataEntity.getName() + "精选");
    }

    @Override
    public void getSingleProduct(SingleProduct singleProduct) {
        this.singleProduct = singleProduct;
        List<SingleProduct.DataEntity> data = singleProduct.getData();
        productAdapter = new SingleProductAdapter(data);
        gv_product.setAdapter(productAdapter);
    }
}

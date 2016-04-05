package cn.jmpt.manbase.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.adapter.BuyADAdapter;
import cn.jmpt.manbase.bean.BuyDetail;
import cn.jmpt.manbase.fragment.ProductFragment;
import cn.jmpt.manbase.fragment.ShopCommentFragment;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-28.
 */
public class BuyPageDetailActivity extends AppCompatActivity implements Constant.OnButDetailListener, View.OnClickListener {

    private LinearLayout layout_ad;
    private TextView tv_coupon_price;
    private TextView tv_save;
    private TextView tv_gobuy;
    private TextView tv_share;
    private RadioGroup radioGrop;
    private TextView tv_info;
    private TextView tv_price;
    private ViewPager viewPager;
    private LinearLayout dot_layout;
    private BuyDetail buyDetail;
    private BuyADAdapter adapter;
    private BuyDetail.DataEntity data;
    private RadioButton shop_button;
    private FragmentManager manager;
    private ProductFragment productFragment;
    private ShopCommentFragment shopCommentFragment;
    private List<Fragment> fragments;
    private LinearLayout layout_product;
    private LinearLayout layout_detail_buttom;
    private int item_id;
    private String TAG="main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_detail);
        item_id = getIntent().getIntExtra("item_id", 0);
        initView();
        initData();
        downloadData(item_id);
    }

    private void initData() {
        manager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        productFragment = new ProductFragment();
        shopCommentFragment = new ShopCommentFragment();
        fragments.add(productFragment);
        fragments.add(shopCommentFragment);
    }


    private void initView() {
        layout_ad = ((LinearLayout) findViewById(R.id.layout_ad));
        View adView = View.inflate(this, R.layout.home_ad, null);
        viewPager = (ViewPager) adView.findViewById(R.id.viewPager);
        dot_layout = ((LinearLayout) adView.findViewById(R.id.dot_layout));
        layout_ad.addView(adView);

        layout_product = ((LinearLayout) findViewById(R.id.layout_product));
        View productView = View.inflate(UIUtils.getContext(), R.layout.product_info, null);
        tv_coupon_price = ((TextView) productView.findViewById(R.id.tv_coupon_price));
        tv_price = ((TextView) productView.findViewById(R.id.tv_price));
        tv_info = ((TextView) productView.findViewById(R.id.tv_info));
        radioGrop = ((RadioGroup) productView.findViewById(R.id.radioGrop));
        shop_button = ((RadioButton) productView.findViewById(R.id.shop_button));
        shop_button.setChecked(true);
        layout_product.addView(productView);

        layout_detail_buttom = ((LinearLayout) findViewById(R.id.layout_detail_buttom));
        View buttomView = View.inflate(UIUtils.getContext(), R.layout.detail_buttom, null);
        tv_save = ((TextView) buttomView.findViewById(R.id.tv_save));
        tv_share = ((TextView) buttomView.findViewById(R.id.tv_share));
        tv_gobuy = ((TextView) buttomView.findViewById(R.id.tv_gobuy));
        tv_save.setOnClickListener(this);
        tv_share.setOnClickListener(this);
        tv_gobuy.setOnClickListener(this);
        layout_detail_buttom.addView(buttomView);

        radioGrop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = manager.beginTransaction();
                for (int i = 0; i < radioGrop.getChildCount(); i++) {
                    RadioButton radioButton = (RadioButton) radioGrop.getChildAt(i);
                    if (radioButton.getId() == checkedId) {
                        radioButton.setChecked(true);
                        transaction.replace(R.id.layout_fragment, fragments.get(i)).commit();
                    } else {
                        radioButton.setChecked(false);
                    }
                }
            }
        });


    }

    private void downloadData(int item_id) {
        Log.e(TAG, "购买: "+ UrlSet.DETAIL.replaceAll("@item_id", item_id + ""));
        Constant.getBuyDetail(UrlSet.DETAIL.replaceAll("@item_id", item_id + ""), this);
    }

    @Override
    public void getBuyDetail(BuyDetail buyDetail) {
        this.buyDetail = buyDetail;
        showView();
    }

    private void showView() {
        data = buyDetail.getData();
        /*展示广告*/
        showAD();
        tv_coupon_price.setText("￥" + data.getCoupon_price());
        tv_price.setText("￥" + data.getPrice());
        tv_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);//中划线
        tv_info.setText(data.getTitle());

        Bundle bundle = new Bundle();
        bundle.putSerializable("data", data); //传递序列化对象
        productFragment.setArguments(bundle);
        shopCommentFragment.setArguments(bundle);

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.layout_fragment, fragments.get(0)).commit();

    }

    private void showAD() {
        String pic_urls = data.getPic_urls();
        String[] imgPaths = pic_urls.split(",");
        List<ImageView> imgs = new ArrayList<>();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(UIUtils.dp2px(10), UIUtils.dp2px(10));
        for (int i = 0; i < imgPaths.length; i++) {
            ImageView ad = new ImageView(this);
            ad.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Picasso.with(this).load(imgPaths[i]).into(ad);
            imgs.add(ad);

            ImageView dot = new ImageView(UIUtils.getContext());
            dot.setImageResource(R.drawable.select_point);
            params.rightMargin = UIUtils.dp2px(8);
            dot.setLayoutParams(params);
            dot.setEnabled(false);
            dot_layout.addView(dot);
        }
        dot_layout.getChildAt(0).setEnabled(true);
        adapter = new BuyADAdapter(imgs);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                for (int i = 0; i < dot_layout.getChildCount(); i++) {
                    dot_layout.getChildAt(i).setEnabled(i == position);
                }
            }
        });
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_save:
                Toast.makeText(BuyPageDetailActivity.this, "收藏成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_share:
                Toast.makeText(BuyPageDetailActivity.this, "分享啦", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_gobuy:
                Toast.makeText(BuyPageDetailActivity.this, "去天猫咯", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package cn.jmpt.manbase.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.DepthPageTransformer;
import cn.jmpt.manbase.View.MyListView;
import cn.jmpt.manbase.View.ViewPagerScroller;
import cn.jmpt.manbase.activity.ADDetailActvity;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.activity.ChaoPinActivity;
import cn.jmpt.manbase.activity.DaylyActivity;
import cn.jmpt.manbase.activity.JingPinActivity;
import cn.jmpt.manbase.activity.QinglvActivity;
import cn.jmpt.manbase.activity.SchoolActivity;
import cn.jmpt.manbase.activity.ShowActivty;
import cn.jmpt.manbase.activity.TodayActvity;
import cn.jmpt.manbase.adapter.ADAdapter;
import cn.jmpt.manbase.adapter.BangbangAdapter;
import cn.jmpt.manbase.adapter.GroupAdapter;
import cn.jmpt.manbase.adapter.ChoicenessAdapter;
import cn.jmpt.manbase.adapter.SchoolAapater;
import cn.jmpt.manbase.bean.Category;
import cn.jmpt.manbase.bean.Choiceness;
import cn.jmpt.manbase.bean.Group;
import cn.jmpt.manbase.bean.School;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-26.
 */
public class HomeFragment extends Fragment implements Constant.OnCategoryListener, Constant.OnGroupListener, Constant.OnChoicenessListener, View.OnClickListener {
    private static final String TAG = "HomeFragment";

    /*广告容器*/
    private LinearLayout layout_ad;
    /*分类容器*/
    private LinearLayout layout_navigation;
    /*大图海报容器*/
    private LinearLayout layout_binner;
    /*搭配精选容器*/
    private LinearLayout layout_group;
    /*学堂精选容器*/
    private LinearLayout layout_school;
    /*特色市场容器*/
    private LinearLayout layout_feature;
    /*邦邦精选容器*/
    private LinearLayout layout_bangbang;

    private View view;
    private Category category;
    private Group group;
    private ViewPager viewPager;
    private ADAdapter adapter;
    private ArrayList<ImageView> adImgs;
    private LinearLayout dot_layout;
    private Handler handler = new Handler();
    private TextView themeName;
    private ImageView theme_icon;
    private ArrayList<String> imgsPath;
    private ImageView[] iv_img = new ImageView[4];
    //    private MyListView lv_group;
    private ListView lv_group;
    private GroupAdapter groupAdapter;
    private MyListView lv_school;
    //    private ListView lv_school;
    private ChoicenessAdapter schoolAdapter;
    private Choiceness choiceness;
    private RecyclerView recyclerView;
    private BangbangAdapter bangbangAdapter;
    private List<Category.DataEntity> dataEntities;
    private List<Choiceness.DataEntity.ItemDetailEntity> itemDetail;
    private ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /*实例化视图*/
        initView(inflater, container);

        if (savedInstanceState != null) {
            category = (Category) savedInstanceState.getSerializable("category");
            group = (Group) savedInstanceState.getSerializable("group");
            choiceness = (Choiceness) savedInstanceState.getSerializable("choiceness");
            if (category != null && group != null && choiceness != null) {

            } else {
                downLoadData();
            }
        } else {
             /*下载数据*/
            downLoadData();
        }


//        /*下载数据*/
//        downLoadData();
        return view;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putSerializable("category", category);
        outState.putSerializable("choiceness", choiceness);
        outState.putSerializable("group", group);
    }

    private void initView(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        scrollView = ((ScrollView) view.findViewById(R.id.scrollView));
        /*轮播广告*/
        layout_ad = ((LinearLayout) view.findViewById(R.id.layout_ad));
        View adView = inflater.inflate(R.layout.home_ad, null);
        viewPager = (ViewPager) adView.findViewById(R.id.viewPager);
        dot_layout = ((LinearLayout) adView.findViewById(R.id.dot_layout));
        layout_ad.addView(adView);

        /*导航指标*/
        layout_navigation = ((LinearLayout) view.findViewById(R.id.layout_navigation));

        /*大图海报*/
        layout_binner = ((LinearLayout) view.findViewById(R.id.layout_binner));

        /*搭配精选*/
        layout_group = ((LinearLayout) view.findViewById(R.id.layout_group));
        View groupView = inflater.inflate(R.layout.home_group, null);
        lv_group = ((ListView) groupView.findViewById(R.id.lv_group));
//        lv_group = ((MyListView) groupView.findViewById(R.id.lv_group));
        layout_group.addView(groupView);

        /*学堂精选*/
        layout_school = ((LinearLayout) view.findViewById(R.id.layout_school));
        View schoolView = inflater.inflate(R.layout.home_school, null);
//        lv_school = ((ListView) schoolView.findViewById(R.id.lv_school));
        lv_school = ((MyListView) schoolView.findViewById(R.id.lv_school));
        layout_school.addView(schoolView);


        /*特色市场*/
        layout_feature = ((LinearLayout) view.findViewById(R.id.layout_feature));
        View featureView = inflater.inflate(R.layout.home_feature, null);
        iv_img[0] = ((ImageView) featureView.findViewById(R.id.iv_one));
        iv_img[1] = ((ImageView) featureView.findViewById(R.id.iv_two));
        iv_img[2] = ((ImageView) featureView.findViewById(R.id.iv_three));
        iv_img[3] = ((ImageView) featureView.findViewById(R.id.iv_four));
        layout_feature.addView(featureView);


        layout_bangbang = ((LinearLayout) view.findViewById(R.id.layout_bangbang));
        View bangbangView = inflater.inflate(R.layout.home_bangbang, null);
        recyclerView = ((RecyclerView) bangbangView.findViewById(R.id.recyclerView));
        layout_bangbang.addView(bangbangView);

    }

    private void downLoadData() {
        Constant.getCategory(UrlSet.CATEGORY, this);
        Constant.getGroup(UrlSet.JINGXUAN, this);
        Constant.getChoiceness(UrlSet.BANGBAGNJINGXUAN, this);
    }


    private void showView() {
        List<Category.DataEntity> data = category.getData();
        /*广告展示*/
        initAD(data);
        /*主题展示*/
        initThemeView(data);
        /*大图海报展示*/
        initBinner(data);
        /*特色市场*/
        initFeature(data);

        scrollView.smoothScrollTo(0,0);
    }

    /*特色市场*/
    private void initFeature(List<Category.DataEntity> data) {
        imgsPath = new ArrayList<>();
        List<String> imgsPath = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            Category.DataEntity dataEntity = data.get(i);
            if (dataEntity.getType().equals("6")) {
                imgsPath.add(dataEntity.getTheme_image());
            }
        }
        for (int i = 0; i < 4; i++) {
//            Picasso.with(UIUtils.getContext()).load(imgsPath.get(i)).into(iv_img[i]);
            ImageLoader.getInstance().displayImage(imgsPath.get(i), iv_img[i], UIUtils.getOptions());
            /*设置特色市场图片点击监听*/
            iv_img[i].setOnClickListener(this);
        }
    }

    /*大图海报展示*/
    private void initBinner(List<Category.DataEntity> data) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        for (int i = 0; i < data.size(); i++) {
            Category.DataEntity dataEntity = data.get(i);
            if (dataEntity.getType().equals("4")) {
                ImageView binner = new ImageView(UIUtils.getContext());
                binner.setScaleType(ImageView.ScaleType.FIT_XY);
                params.topMargin = UIUtils.dp2px(10);
//                params.bottomMargin = UIUtils.dp2px(10);
                binner.setLayoutParams(params);
//                Picasso.with(UIUtils.getContext()).load(dataEntity.getTheme_image()).into(binner);
                ImageLoader.getInstance().displayImage(dataEntity.getTheme_image(), binner, UIUtils.getOptions());
                layout_binner.addView(binner);
            }
        }
    }

    /*主题展示*/
    private void initThemeView(List<Category.DataEntity> data) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1);
        for (int i = 0; i < data.size(); i++) {
            final Category.DataEntity themeEntity = data.get(i);
            if (themeEntity.getType().equals("3")) {
                View themeView = View.inflate(UIUtils.getContext(), R.layout.home_theme, null);
                theme_icon = ((ImageView) themeView.findViewById(R.id.ic_con));
                themeName = ((TextView) themeView.findViewById(R.id.tv_themeName));
//                Picasso.with(UIUtils.getContext()).load(themeEntity.getTheme_image()).into(theme_icon);
                ImageLoader.getInstance().displayImage(themeEntity.getTheme_image(), theme_icon, UIUtils.getOptions());
                themeName.setText(themeEntity.getTheme_name());
                themeView.setLayoutParams(params);
                if (themeEntity.getTheme_id() == 185) {
                    themeView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), ADDetailActvity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("url", themeEntity.getTheme_link());
                            bundle.putString("title", themeEntity.getTheme_name());
                            bundle.putInt("allow_share", themeEntity.getAllow_share());
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                if (themeEntity.getTheme_id() == 11) {
                    themeView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            startActivity(new Intent(getActivity(), ShowActivty.class));
                            Toast.makeText(UIUtils.getContext(), "这个没调好", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                if (themeEntity.getTheme_id() == 130) {
                    themeView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(getActivity(), SchoolActivity.class));
                        }
                    });
                }
                if (themeEntity.getTheme_id() == 36) {
                    themeView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(getActivity(), TodayActvity.class));
                        }
                    });
                }
                layout_navigation.addView(themeView);
            }
        }
    }

    /*广告展示*/
    private void initAD(List<Category.DataEntity> data) {
        adImgs = new ArrayList<>();
        dataEntities = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            Category.DataEntity dataEntity = data.get(i);
            if (dataEntity.getType().equals("2")) {
                dataEntities.add(dataEntity);
                ImageView ad = new ImageView(UIUtils.getContext());
//                Picasso.with(UIUtils.getContext()).load(dataEntity.getTheme_image()).into(ad);

                ImageLoader.getInstance().displayImage(dataEntity.getTheme_image(), ad, UIUtils.getOptions());
                adImgs.add(ad);

                ImageView dot = new ImageView(UIUtils.getContext());
                dot.setImageResource(R.drawable.select_point);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(UIUtils.dp2px(10), UIUtils.dp2px(10));
                params.rightMargin = UIUtils.dp2px(8);
                dot.setLayoutParams(params);
                dot.setEnabled(false);
                dot_layout.addView(dot);
            }
        }
        dot_layout.getChildAt(0).setEnabled(true);
        viewPager.setPageTransformer(true, new DepthPageTransformer()); //设置viewpager切换动画
        ViewPagerScroller scroller = new ViewPagerScroller(UIUtils.getContext());
        scroller.setScrollDuration(2000);//设置viewpager切换时长
        scroller.initViewPagerScroll(viewPager);
        adapter = new ADAdapter(getActivity(), adImgs, dataEntities);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(adImgs.size() * 8000);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dot_layout.getChildCount(); i++) {
                    dot_layout.getChildAt(i).setEnabled(position % adImgs.size() == i);
                }
            }
        });
        Runnable autoRunnable = new Runnable() {
            @Override
            public void run() {
                int currentItem = viewPager.getCurrentItem();
                viewPager.setCurrentItem(++currentItem);
                handler.postDelayed(this, 3000);
            }
        };
        handler.postDelayed(autoRunnable, 3000);
    }

    @Override
    public void getCategory(Category category) {
        this.category = category;
         /*显示界面*/
        showView();
        scrollView.smoothScrollTo(0,0);
    }

    @Override
    public void getGroup(Group group) {
        this.group = group;
        /*显示界面*/
        showViewJingXuan();
        scrollView.smoothScrollTo(0, 0);
    }

    private void showViewJingXuan() {
        List<Group.DataEntity.MatchEntity> match = group.getData().getMatch();
        groupAdapter = new GroupAdapter(match);
        lv_group.setAdapter(groupAdapter);

        List<Group.DataEntity.SchoolEntity> school = group.getData().getSchool();
        schoolAdapter = new ChoicenessAdapter(school);
        lv_school.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Group.DataEntity.SchoolEntity schoolEntity = (Group.DataEntity.SchoolEntity) schoolAdapter.getItem(position);

                Bundle bundle = new Bundle();
                bundle.putString("title", schoolEntity.getTitle());
                bundle.putString("url", schoolEntity.getLink());
                Intent intent = new Intent(UIUtils.getContext(), ADDetailActvity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                UIUtils.getContext().startActivity(intent);
            }
        });
        lv_school.setAdapter(schoolAdapter);
        scrollView.smoothScrollTo(0,0);
    }

    @Override
    public void getChoiceness(Choiceness choiceness) {
        this.choiceness = choiceness;
        showChoiceness();
        scrollView.smoothScrollTo(0,0);
    }

    /*邦邦精选*/
    private void showChoiceness() {
        itemDetail = choiceness.getData().getItemDetail();
        recyclerView.setLayoutManager(new GridLayoutManager(UIUtils.getContext(), 2));
        bangbangAdapter = new BangbangAdapter(itemDetail);
        recyclerView.setAdapter(bangbangAdapter);
        bangbangAdapter.setOnItemClickLitener(new BangbangAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.putExtra("item_id", itemDetail.get(position).get_id());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }

            @Override
            public void onItemLongClick(View view, int position) {
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_one:
                Intent intent = new Intent(UIUtils.getContext(), ChaoPinActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
                break;
            case R.id.iv_two:
                UIUtils.getContext().startActivity(new Intent(UIUtils.getContext(), DaylyActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                break;
            case R.id.iv_three:
                UIUtils.getContext().startActivity(new Intent(UIUtils.getContext(), JingPinActivity.class).putExtra("title", "精品小街").setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                break;
            case R.id.iv_four:
                UIUtils.getContext().startActivity(new Intent(UIUtils.getContext(), JingPinActivity.class).putExtra("title", "情侣专区").setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                break;
        }
    }
}

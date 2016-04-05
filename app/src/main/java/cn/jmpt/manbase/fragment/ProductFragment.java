package cn.jmpt.manbase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyListView;
import cn.jmpt.manbase.adapter.ImageAdapter;
import cn.jmpt.manbase.bean.BuyDetail;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-28.
 */
public class ProductFragment extends Fragment {

    private BuyDetail.DataEntity data;
    private TextView tv_name;
    private TextView tv_material;
    private TextView tv_style;
    private TextView tv_num_iid;
    private TextView tv_color;
    private TextView tv_season;
    private MyListView lv_image;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = (BuyDetail.DataEntity) getArguments().getSerializable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_product_info, container, false);
        tv_name = ((TextView) view.findViewById(R.id.tv_name));
        tv_material = ((TextView) view.findViewById(R.id.tv_material));
        tv_style = ((TextView) view.findViewById(R.id.tv_style));
        tv_num_iid = ((TextView) view.findViewById(R.id.tv_num_iid));
        tv_color = ((TextView) view.findViewById(R.id.tv_color));
        tv_season = ((TextView) view.findViewById(R.id.tv_season));
        lv_image = ((MyListView) view.findViewById(R.id.lv_image));
        String item_description = data.getItem_description();
        String[] imgs = item_description.split(",");
        ImageAdapter adapter = new ImageAdapter(imgs);
        lv_image.setAdapter(adapter);


        tv_name.setText(data.getBrand());
        tv_material.setText(data.getMaterial());
        tv_style.setText(data.getStyle());
        tv_num_iid.setText(data.getNum_iid());
        tv_color.setText(data.getColor());
        tv_season.setText(data.getSeason());
        return view;
    }
}

package cn.jmpt.manbase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyListView;
import cn.jmpt.manbase.adapter.CommentAdapter;
import cn.jmpt.manbase.bean.BuyDetail;
import cn.jmpt.manbase.bean.Comment;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-28.
 */
public class ShopCommentFragment extends Fragment implements Constant.OnCommentListener {
    private TextView tv_shopName;
    private TextView tv_speed;
    private TextView tv_service;
    private TextView tv_desc;
    private MyListView lv_comment;
    private BuyDetail.DataEntity data;
    private Comment comment;
    private CommentAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = (BuyDetail.DataEntity) getArguments().getSerializable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop_comment, container, false);
        tv_shopName = ((TextView) view.findViewById(R.id.tv_shopeName));
        tv_speed = ((TextView) view.findViewById(R.id.tv_speed));
        tv_service = ((TextView) view.findViewById(R.id.tv_service));
        tv_desc = ((TextView) view.findViewById(R.id.tv_desc_score));
        lv_comment = ((MyListView) view.findViewById(R.id.lv_comment));

        downLoadData(data.getItem_id());

        return view;
    }

    private void downLoadData(int item_id) {
        Constant.getComment(UrlSet.COMMENT.replaceAll("@item_id", item_id + ""), this);
    }

    @Override
    public void getComment(Comment comment) {
        this.comment = comment;
        showView();
    }

    private void showView() {
        tv_shopName.setText(comment.getData().getShop_name());
        Comment.DataEntity.ShopScoreEntity shop_score = comment.getData().getShop_score();
        tv_speed.setText(shop_score.getDispat_score());
        tv_service.setText(shop_score.getService_score());
        tv_desc.setText(shop_score.getDesc_score());

        adapter = new CommentAdapter(comment.getData().getComments());
        lv_comment.setAdapter(adapter);
    }
}

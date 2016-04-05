package cn.jmpt.manbase.adapter;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.activity.BuyPageDetailActivity;
import cn.jmpt.manbase.bean.TodayDetail;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-28.
 */
public class TodayDetailSingleItemAdapter extends RecyclerView.Adapter<TodayDetailSingleItemAdapter.MyViewHolder> {

    private List<TodayDetail.DataEntity.SingleItemsEntity> singleItems;
    private TodayDetail.DataEntity dataEntity;

    public TodayDetailSingleItemAdapter(List<TodayDetail.DataEntity.SingleItemsEntity> singleItems) {
        this.singleItems = singleItems;
    }

    public TodayDetailSingleItemAdapter(TodayDetail.DataEntity dataEntity) {
        this.dataEntity = dataEntity;
        this.singleItems = dataEntity.getSingleItems();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(UIUtils.getContext(), R.layout.item_today_single_item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final TodayDetail.DataEntity.SingleItemsEntity singleItemsEntity = singleItems.get(position);
//        Picasso.with(UIUtils.getContext()).load(singleItemsEntity.getPic_img()).into(holder.iv_pic);
        ImageLoader.getInstance().displayImage(singleItemsEntity.getPic_img(), holder.iv_pic, UIUtils.getOptions());
        holder.tv_description.setText(singleItemsEntity.getDescription() + "：");
        holder.tv_title.setText(singleItemsEntity.getTitle());
        holder.tv_coupon_price.setText("￥" + singleItemsEntity.getCoupon_price());
        holder.tv_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);//中划线
        holder.tv_price.setText("/￥" + singleItemsEntity.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIUtils.getContext(), BuyPageDetailActivity.class);
                intent.putExtra("item_id", singleItemsEntity.getItem_id());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                UIUtils.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return singleItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_pic;
        private final TextView tv_description;
        private final TextView tv_title;
        private final TextView tv_coupon_price;
        private final TextView tv_price;
        private View itemView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            iv_pic = ((ImageView) itemView.findViewById(R.id.iv_pic));
            tv_description = ((TextView) itemView.findViewById(R.id.tv_description));
            tv_title = ((TextView) itemView.findViewById(R.id.tv_title));
            tv_coupon_price = ((TextView) itemView.findViewById(R.id.tv_coupon_price));
            tv_price = ((TextView) itemView.findViewById(R.id.tv_price));

        }

    }
}

package cn.jmpt.manbase.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Choiceness;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-27.
 */
public class BangbangAdapter extends RecyclerView.Adapter<BangbangAdapter.MyViewHolder> {

    private List<Choiceness.DataEntity.ItemDetailEntity> itemDetail;

    public BangbangAdapter(List<Choiceness.DataEntity.ItemDetailEntity> itemDetail) {
        this.itemDetail = itemDetail;
    }

    public interface OnItemClickLitener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private OnItemClickLitener mOnItemClickLitener;

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_home_bangbang, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Choiceness.DataEntity.ItemDetailEntity itemDetailEntity = itemDetail.get(position);
//        Picasso.with(UIUtils.getContext()).load(itemDetailEntity.getPic_url()).into(holder.iv_image);
        ImageLoader.getInstance().displayImage(itemDetailEntity.getPic_url(), holder.iv_image, UIUtils.getOptions());
        holder.tv_info.setText(itemDetailEntity.getTitle());
        holder.tv_price.setText("￥" + itemDetailEntity.getPrice());
        holder.tv_saveCount.setText(itemDetailEntity.getSaveCount() + "");
        // 如果设置了回调，则设置点击事件
        if (mOnItemClickLitener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemClick(holder.itemView, pos);
                }
            });

            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemLongClick(holder.itemView, pos);
                    return false;
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return itemDetail.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_image;
        private final TextView tv_info;
        private final TextView tv_price;
        private final TextView tv_saveCount;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_image = ((ImageView) itemView.findViewById(R.id.iv_image));
            tv_info = ((TextView) itemView.findViewById(R.id.tv_info));
            tv_price = ((TextView) itemView.findViewById(R.id.tv_price));
            tv_saveCount = ((TextView) itemView.findViewById(R.id.tv_saveCount));
        }
    }
}

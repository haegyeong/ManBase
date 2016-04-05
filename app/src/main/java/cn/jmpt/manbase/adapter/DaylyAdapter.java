package cn.jmpt.manbase.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Dayly;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-29.
 */
public class DaylyAdapter extends RecyclerView.Adapter<DaylyAdapter.MyViewHolder> {

    private List<Dayly.DataEntity> data;
    private Dayly.DataEntity dataEntity;

    public DaylyAdapter(List<Dayly.DataEntity> data) {
        this.data = data;
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
        View view = View.inflate(UIUtils.getContext(), R.layout.item_dayly, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        dataEntity = data.get(position);
//        Picasso.with(UIUtils.getContext()).load(dataEntity.getKind_icon()).into(holder.iv_icon);
        ImageLoader.getInstance().displayImage(dataEntity.getKind_icon(), holder.iv_icon, UIUtils.getOptions());
        holder.tv_title.setText(dataEntity.getKind_name());
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
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_icon;
        private TextView tv_title;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
            tv_title = ((TextView) itemView.findViewById(R.id.tv_title));
        }
    }
}

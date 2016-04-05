package cn.jmpt.manbase.activity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Today;
import cn.jmpt.manbase.utils.Constant;
import cn.jmpt.manbase.utils.UIUtils;
import cn.jmpt.manbase.utils.UrlSet;

/**
 * Created by Administrator on 2016-03-27.
 */
public class TodayActvity extends AppCompatActivity implements Constant.OnTodayListener {

    private RecyclerView recyclerView;
    private Today today;
    private List<Today.DataEntity> data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        downLoadData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        recyclerView = ((RecyclerView) findViewById(R.id.recyclerView));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false));
    }

    private void downLoadData() {
        Constant.getToday(UrlSet.TODAY, this);
    }

    /*返回*/
    public void goBack(View view) {
        finish();
    }

    @Override
    public void getToday(Today today) {
        this.today = today;
        data = today.getData();
        showView();
    }

    private void showView() {
        recyclerView.setAdapter(new MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(TodayActvity.this).inflate(R.layout.item_today, null);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {
            final Today.DataEntity dataEntity = data.get(position);
//            Picasso.with(UIUtils.getContext()).load(dataEntity.getMatch().getBig_image()).into(holder.iv_image);
            ImageLoader.getInstance().displayImage(dataEntity.getMatch().getBig_image(), holder.iv_image, UIUtils.getOptions());
            holder.tv_city_name.setText(dataEntity.getCity_name());
            holder.tv_hightemp.setText(dataEntity.getHightemp());
            holder.tv_long_info.setText(dataEntity.getMatch().getLong_info());
            holder.tv_lowtemp.setText(dataEntity.getLowtemp() + "/");
            holder.tv_today.setText(dataEntity.getCity_name());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TodayActvity.this, TodayDetailActivity.class);
                    intent.putExtra("collocation_id", dataEntity.getMatch().getCollocation_id());
                    TodayActvity.this.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            private ImageView iv_image;
            private TextView tv_today;
            private TextView tv_lowtemp;
            private TextView tv_hightemp;
            private TextView tv_city_name;
            private TextView tv_long_info;
            private View itemView;

            public MyViewHolder(View itemView) {
                super(itemView);
                this.itemView = itemView;
                this.iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
                this.tv_today = (TextView) itemView.findViewById(R.id.tv_today);
                this.tv_lowtemp = (TextView) itemView.findViewById(R.id.tv_lowtemp);
                this.tv_hightemp = (TextView) itemView.findViewById(R.id.tv_hightemp);
                this.tv_city_name = (TextView) itemView.findViewById(R.id.tv_city_name);
                this.tv_long_info = (TextView) itemView.findViewById(R.id.tv_long_info);
            }
        }
    }
}

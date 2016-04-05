package cn.jmpt.manbase.adapter;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.View.MyGridView;
import cn.jmpt.manbase.activity.GroupDetailListActivity;
import cn.jmpt.manbase.bean.GroupCategory;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-04-01.
 */
public class GroupCateAdapter extends DefaultAdapter {
    private List<GroupCategory.DataEntity> data;
    private GroupCategyGridviewAdapter adapter;
    private List<GroupCategory.DataEntity.ItemsEntity> items;
    private GroupCategory.DataEntity.ItemsEntity itemsEntity;
    private String TAG = "main";

    public GroupCateAdapter(List<GroupCategory.DataEntity> data) {
        super(data);
        this.data = data;
    }

    ViewHolder viewHolder = null;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.group_style_layout, null);
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.myGridView = (MyGridView) convertView.findViewById(R.id.gridView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        GroupCategory.DataEntity dataEntity = data.get(position);
        viewHolder.tv_title.setText(dataEntity.getName());

        items = dataEntity.getItems();
        adapter = new GroupCategyGridviewAdapter(items);

        viewHolder.myGridView.setAdapter(adapter);
        viewHolder.myGridView.setPosition(position);
        viewHolder.myGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(UIUtils.getContext(), "该接口还在调试中哟", Toast.LENGTH_SHORT).show();
//                viewHolder.myGridView = (MyGridView) parent;
//                int lv_index = viewHolder.myGridView.getPosition();
//                Log.e(TAG, "onItemClick: ="+lv_index );
//                itemsEntity = (GroupCategory.DataEntity.ItemsEntity) adapter.getItem(position);
//                Intent intent = new Intent(UIUtils.getContext(), GroupDetailListActivity.class);
//                intent.putExtra("kind", data.get(lv_index).getKind());
//                intent.putExtra("classify_id", itemsEntity.getClassify_id());
//                intent.putExtra("title", itemsEntity.getClassify_name());
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                UIUtils.getContext().startActivity(intent);
            }
        });

        return convertView;
    }


    class ViewHolder {
        private TextView tv_title;
        private MyGridView myGridView;
    }
}

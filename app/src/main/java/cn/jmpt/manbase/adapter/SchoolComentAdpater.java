package cn.jmpt.manbase.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import org.w3c.dom.Text;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.SchoolComent;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-04-01.
 */
public class SchoolComentAdpater extends DefaultAdapter {

    private List<SchoolComent.DataEntity> data;

    public SchoolComentAdpater(List<SchoolComent.DataEntity> data) {
        super(data);
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(UIUtils.getContext(), R.layout.item_school_coment, null);
            viewHolder.iv_image = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.tv_info = (TextView) convertView.findViewById(R.id.tv_info);
            viewHolder.tv_clickCount = (TextView) convertView.findViewById(R.id.tv_clickCount);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SchoolComent.DataEntity dataEntity = data.get(position);
        ImageLoader.getInstance().displayImage(dataEntity.getImage(), viewHolder.iv_image, UIUtils.getOptions());
        viewHolder.tv_info.setText(dataEntity.getTitle());
        viewHolder.tv_clickCount.setText(dataEntity.getClickCount()+"");
        return convertView;
    }

    class ViewHolder {
        private ImageView iv_image;
        private TextView tv_info;
        private TextView tv_clickCount;
    }
}

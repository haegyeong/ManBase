package cn.jmpt.manbase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.bean.Comment;
import cn.jmpt.manbase.utils.UIUtils;

/**
 * Created by Administrator on 2016-03-28.
 */
public class CommentAdapter extends DefaultAdapter {

    private List<Comment.DataEntity.CommentsEntity> comments;

    public CommentAdapter(List<Comment.DataEntity.CommentsEntity> comments) {
        super(comments);
        this.comments = comments;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CommentViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new CommentViewHolder();
            convertView = LayoutInflater.from(UIUtils.getContext()).inflate(R.layout.item_comment, null);
            viewHolder.tv_username = (TextView) convertView.findViewById(R.id.tv_username);
            viewHolder.tv_comment = (TextView) convertView.findViewById(R.id.tv_comment);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (CommentViewHolder) convertView.getTag();
        }

        Comment.DataEntity.CommentsEntity commentsEntity = comments.get(position);

        viewHolder.tv_username.setText(commentsEntity.getName());
        viewHolder.tv_comment.setText(commentsEntity.getContent());
        return convertView;
    }

    class CommentViewHolder {
        private TextView tv_username;
        private TextView tv_comment;
    }
}

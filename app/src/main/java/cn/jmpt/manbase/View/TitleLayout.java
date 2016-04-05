package cn.jmpt.manbase.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.jmpt.manbase.R;

/**
 * Created by Administrator on 2016-03-28.
 */
public class TitleLayout extends RelativeLayout {
    private ImageView iv_left;
    private ImageView iv_right;
    private TextView tv_title;

    public TitleLayout(Context context) {
        this(context, null);
    }

    public TitleLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.attTitle);
        Drawable resLef = typedArray.getDrawable(R.styleable.attTitle_iv_left);
        Drawable resRig = typedArray.getDrawable(R.styleable.attTitle_iv_right);
        String text = typedArray.getString(R.styleable.attTitle_mytitle);

        View view = LayoutInflater.from(context).inflate(R.layout.title_layout, this, true);
        iv_left = (ImageView) view.findViewById(R.id.iv_left);
        iv_right = (ImageView) view.findViewById(R.id.iv_right);
        tv_title = (TextView) view.findViewById(R.id.tv_title);

        iv_left.setImageDrawable(resLef);
        iv_right.setImageDrawable(resRig);
        tv_title.setText(text);

        typedArray.recycle();
    }

    public ImageView getIv_left() {
        return iv_left;
    }

    public ImageView getIv_right() {
        return iv_right;
    }

    public void setTv_title(String title) {
        tv_title.setText(title);
    }
}

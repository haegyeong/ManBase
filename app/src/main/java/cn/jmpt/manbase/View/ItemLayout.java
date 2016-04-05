package cn.jmpt.manbase.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.jmpt.manbase.R;

/**
 * Created by Administrator on 2016-04-01.
 */
public class ItemLayout extends RelativeLayout {
    private String mytitle;
    private ImageView iv_icon;
    private TextView tv_title;
    private TextView tv_info;
    private Drawable drawable;
    private String myInfo;

    public ItemLayout(Context context) {
        this(context, null);
    }

    public ItemLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        View view = View.inflate(context, R.layout.item_mine_layout, this);
        iv_icon = ((ImageView) view.findViewById(R.id.iv_icon));
        tv_title = ((TextView) view.findViewById(R.id.tv_title));
        tv_info = ((TextView) view.findViewById(R.id.tv_info));

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.itemStyle);
        drawable = typedArray.getDrawable(R.styleable.itemStyle_iv_icon);
        myInfo = typedArray.getString(R.styleable.itemStyle_myinfo);
        mytitle = typedArray.getString(R.styleable.itemStyle_titleItem);

        iv_icon.setBackground(drawable);
        tv_info.setText(myInfo);
        tv_title.setText(mytitle);

        typedArray.recycle();
    }

    public ItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

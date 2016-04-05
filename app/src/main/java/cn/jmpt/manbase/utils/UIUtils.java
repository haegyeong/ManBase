package cn.jmpt.manbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import cn.jmpt.manbase.R;
import cn.jmpt.manbase.app.ManBaseApplication;

/**
 * Created by Administrator on 2016-03-26.
 * Ui工具类
 */
public class UIUtils {

    /**
     * 获取SharedPreferences
     */
    public static SharedPreferences getSharedPreferences(Context context) {

        SharedPreferences preferences = context.getSharedPreferences("config", Context.MODE_PRIVATE);

        return preferences;
    }

    public static Context getContext() {
        return ManBaseApplication.getInstance().getApplicationContext();
    }

    public static int dp2px(int dp) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    //显示图片的配置
    private static DisplayImageOptions options;

    public static DisplayImageOptions getOptions() {
        if (options == null) {
            options = new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.mipmap.ic_launcher)
                    .showImageOnFail(R.mipmap.ic_launcher)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .bitmapConfig(Bitmap.Config.RGB_565)
                    .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                    .build();
        }
        return options;
    }

}

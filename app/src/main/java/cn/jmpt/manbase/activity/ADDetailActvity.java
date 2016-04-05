package cn.jmpt.manbase.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cn.jmpt.manbase.R;

/**
 * Created by Administrator on 2016-03-27.
 */
public class ADDetailActvity extends AppCompatActivity {
    private TextView tv_title;
    private WebView webView;
    private ImageView iv_share;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String url = bundle.getString("url");
        int allow_share = bundle.getInt("allow_share");
        Log.e("main", "onCreate: " + title + "::" + url);
        setContentView(R.layout.item_home_ad);
        tv_title = ((TextView) findViewById(R.id.tv_title));
        webView = ((WebView) findViewById(R.id.webView));
        iv_share = ((ImageView) findViewById(R.id.iv_share));
        if (allow_share == 1) {
            iv_share.setVisibility(View.VISIBLE);
        } else {
            iv_share.setVisibility(View.GONE);
        }
        tv_title.setText(title);
        webView.getSettings().setBlockNetworkImage(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    /*返回上页*/
    public void goBack(View view) {
        finish();
    }

    /*分享*/
    public void goShare(View view) {
        Toast.makeText(ADDetailActvity.this, "分享", Toast.LENGTH_SHORT).show();/**/
    }
}

package cn.usmaker.heartdemo;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvTitle;
    private TextView mTvContent1;
    private TextView mTvContent2;
    private TextView mTvContent3;
    private TextView mTvContent4;
    private TextView mTvContent5;
    private TextView mTvContent6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mTvContent1 = (TextView) findViewById(R.id.tv_content1);
        mTvContent2 = (TextView) findViewById(R.id.tv_content2);
        mTvContent3 = (TextView) findViewById(R.id.tv_content3);
        mTvContent4 = (TextView) findViewById(R.id.tv_content4);
        mTvContent5 = (TextView) findViewById(R.id.tv_content5);
        mTvContent6 = (TextView) findViewById(R.id.tv_content6);
        //修改字体
        AssetManager assetManager = getAssets();
        Typeface     typeface1     = Typeface.createFromAsset(assetManager, "fonts/STXINGKA.TTF");
        Typeface     typeface2     = Typeface.createFromAsset(assetManager, "fonts/STCAIYUN.TTF");
        mTvTitle.setTypeface(typeface2);
        mTvContent1.setTypeface(typeface2);
        mTvContent2.setTypeface(typeface2);
        mTvContent3.setTypeface(typeface2);
        mTvContent4.setTypeface(typeface2);
        mTvContent5.setTypeface(typeface2);
        mTvContent6.setTypeface(typeface2);
    }
}

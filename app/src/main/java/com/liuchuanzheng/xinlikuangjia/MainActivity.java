package com.liuchuanzheng.xinlikuangjia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,BuildConfig.FLAVOR+"--"+BuildConfig.BUILD_TYPE+"--"+BuildConfig.LOG+"--"+BuildConfig.SERVER_URL,Toast.LENGTH_LONG).show();
        Log.i("liuchuanzheng",BuildConfig.FLAVOR+"--"+BuildConfig.BUILD_TYPE+"--"+BuildConfig.LOG+"--"+BuildConfig.SERVER_URL);
    }
}

package cn.zhaiyifan.logger.sample;

import android.app.Activity;
import android.os.Bundle;

import cn.zhaiyifan.logger.Logger;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d(TAG, "123");
        Logger.d(TAG, this);
        Logger.e(TAG, "123", new NullPointerException());
    }
}

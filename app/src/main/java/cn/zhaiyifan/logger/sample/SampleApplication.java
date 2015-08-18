package cn.zhaiyifan.logger.sample;

import android.app.Application;

import cn.zhaiyifan.logger.Logger;
import cn.zhaiyifan.logger.ReleaseLogger;

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Logger.init(this, ReleaseLogger.getInstance());
        } else {
            Logger.init(this, ReleaseLogger.getInstance());
        }
    }
}

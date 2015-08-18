package cn.zhaiyifan.logger;

import android.os.Environment;

/**
 * Logger configuration constants
 * <p/>
 * Created by zhaiyifan on 2015/8/18.
 */
public class Constants {
    // default tag
    public static final String TAG = "Logger";
    // log directory
    public static final String PATH = Environment.getExternalStorageDirectory() + "/logger/";
    // log filename
    public static final String FILE_NAME = "logger.log";
}

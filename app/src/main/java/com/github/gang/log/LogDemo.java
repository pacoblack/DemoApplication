package com.github.gang.log;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

import com.github.gang.BuildConfig;
import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;

public class LogDemo {
    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary("marsxlog");
    }

    final static String SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath();
    final static String logPath = SDCARD + "/marssample/log";
    static String cachePath = "";
    private LogDemo(Context context){
        init(context, "LogDemo");
    }

    private static volatile LogDemo instance;

    public static String getCachePath(Context context){
        if (TextUtils.isEmpty(cachePath)){
            cachePath = context.getCacheDir().getAbsolutePath();
        }
        return cachePath;
    }

    public static LogDemo getInstance(Context context){
        if(instance == null) {
            instance = new LogDemo(context);
        }
        return instance;
    }

    private void init(Context context, String logFileName){
        if (BuildConfig.DEBUG) {
            Log.setConsoleLogOpen(true);
            Log.appenderOpen(Xlog.LEVEL_DEBUG, Xlog.AppednerModeAsync, getCachePath(context), logPath, logFileName, 0);
        } else {
            Log.setConsoleLogOpen(false);
            Log.appenderOpen(Xlog.LEVEL_INFO, Xlog.AppednerModeAsync, getCachePath(context), logPath, logFileName, 0);
        }
        Log.setLogImp(new Xlog());
    }

    public static void close(){
        Log.appenderClose();
    }

    public void d(String tag, String message){
        Log.d(tag, message);
    }
    public void e(String tag, String message){
        Log.e(tag, message);
    }
    public void f(String tag, String message){
        Log.f(tag, message);
    }
    public void w(String tag, String message){
        Log.w(tag, message);
    }
    public void i(String tag, String message){
        Log.i(tag, message);
    }
    public void v(String tag, String message){
        Log.v(tag, message);
    }
}

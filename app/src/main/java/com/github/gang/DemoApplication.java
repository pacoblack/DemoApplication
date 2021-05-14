package com.github.gang;

import android.app.Application;
import android.util.Log;

import com.getkeepsafe.relinker.ReLinker;
import com.github.gang.mmkv.MMKV;
import com.github.gang.mmkv.MMKVContentChangeNotification;
import com.github.gang.mmkv.MMKVHandler;
import com.github.gang.mmkv.MMKVLogLevel;
import com.github.gang.mmkv.MMKVRecoverStrategic;
import com.github.logan.Logan;
import com.github.logan.LoganConfig;
import com.github.logan.OnLoganProtocolStatus;

import java.io.File;
import java.io.IOException;

import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;

public class DemoApplication extends Application implements MMKVHandler, MMKVContentChangeNotification {
    private static final String TAG = DemoApplication.class.getName();
    private static final String FILE_NAME = "logan_v1";
    private FlutterEngine flutterEngine;

    @Override
    public void onCreate() {
        super.onCreate();
        flutterEngine = new FlutterEngine(this);

        // Start executing Dart code to pre-warm the FlutterEngine.
        flutterEngine.getDartExecutor().executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
        );

        // Cache the FlutterEngine to be used by FlutterActivity.
        FlutterEngineCache
                .getInstance()
                .put("my_engine_id", flutterEngine);

        initLogan();
        Logan.w("MyApplication onCreate", 3);
        Logan.w("MyApplication onCreate", 3);
        Logan.w("MyApplication onCreate", 3);

//        String dir = getFilesDir().getAbsolutePath() + "/mmkv";
//        String rootDir = MMKV.initialize(dir, new MMKV.LibLoader() {
//            @Override
//            public void loadLibrary(String libName) {
//                ReLinker.loadLibrary(DemoApplication.this, libName);
//            }
//        }, MMKVLogLevel.LevelInfo);
//        Log.i("MMKV", "mmkv root: " + rootDir);
//        Log.i("MMKV", "mmkv version: " + MMKV.version());
//
//        // set log level
//        MMKV.setLogLevel(MMKVLogLevel.LevelInfo);
//
//        // you can turn off logging
//        //MMKV.setLogLevel(MMKVLogLevel.LevelNone);
//
//        // log redirecting & recover logic
//        MMKV.registerHandler(this);
//
//        // content change notification
//        MMKV.registerContentChangeNotify(this);
    }
    private void initLogan() {
        String path = getApplicationContext().getExternalFilesDir(null).getAbsolutePath()
                + File.separator + FILE_NAME;
        File pathFile = new File(path);
        if (!pathFile.exists()){
            pathFile.mkdirs();
        }
        LoganConfig config = new LoganConfig.Builder()
                .setCachePath(getApplicationContext().getFilesDir().getAbsolutePath())
                .setPath(getApplicationContext().getExternalFilesDir(null).getAbsolutePath()
                        + File.separator + FILE_NAME)
                .setEncryptKey16("0123456789012345".getBytes())
                .setEncryptIV16("0123456789012345".getBytes())
                .build();
        Logan.init(config);
        Logan.setDebug(true);
        Logan.setOnLoganProtocolStatus(new OnLoganProtocolStatus() {
            @Override
            public void loganProtocolStatus(String cmd, int code) {
                Log.d(TAG, "clogan > cmd : " + cmd + " | " + "code : " + code);
            }
        });

    }

    @Override
    public void onTerminate() {
        MMKV.onExit();

        super.onTerminate();
    }

    @Override
    public MMKVRecoverStrategic onMMKVCRCCheckFail(String mmapID) {
        return MMKVRecoverStrategic.OnErrorRecover;
    }

    @Override
    public MMKVRecoverStrategic onMMKVFileLengthError(String mmapID) {
        return MMKVRecoverStrategic.OnErrorRecover;
    }

    @Override
    public boolean wantLogRedirecting() {
        return true;
    }

    @Override
    public void mmkvLog(MMKVLogLevel level, String file, int line, String function, String message) {
        String log = "<" + file + ":" + line + "::" + function + "> " + message;
        switch (level) {
            case LevelDebug:
                Log.d("redirect logging MMKV", log);
                break;
            case LevelNone:
            case LevelInfo:
                Log.i("redirect logging MMKV", log);
                break;
            case LevelWarning:
                Log.w("redirect logging MMKV", log);
                break;
            case LevelError:
                Log.e("redirect logging MMKV", log);
                break;
        }
    }

    @Override
    public void onContentChangedByOuterProcess(String mmapID) {
        Log.i("MMKV", "other process has changed content of : " + mmapID);
    }
}

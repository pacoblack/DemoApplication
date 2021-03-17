package com.github.gang.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private static final String TAG = "MyService";

    private Binder mBinder = new IMyAidlInterface.Stub() {
        @Override
        public int add(int arg1, int arg2) throws RemoteException {
            System.out.println("wtg server add " + System.currentTimeMillis());
            return arg1 + arg2;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}

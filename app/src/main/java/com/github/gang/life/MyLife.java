package com.github.gang.life;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLife implements LifecycleObserver {

    private static final String TAG = "T-MyLife";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void A(){
        Log.d(TAG, "create");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void B(){
        Log.d(TAG, "onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void C(){
        Log.d(TAG, "onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void D(){
        Log.d(TAG, "Pause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void E(){
        Log.d(TAG, "onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void F(){
        Log.d(TAG, "destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void G(){
        Log.d(TAG, "Any");
    }
}

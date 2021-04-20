package com.github.gang.flexbox;

import android.content.Context;

import org.json.JSONObject;

public interface DynamicViewComponent<T> {
    T createDynamicView(Context context, JSONObject jsonObject);

    T createDynamicView(T view, JSONObject jsonObject);
}

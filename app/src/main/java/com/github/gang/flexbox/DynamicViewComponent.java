package com.github.gang.flexbox;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONObject;

public interface DynamicViewComponent {
    View createDynamicView(Context context, ViewGroup viewGroup, JSONObject jsonObject);

    View createDynamicView(View view, ViewGroup viewGroup, JSONObject jsonObject);
}

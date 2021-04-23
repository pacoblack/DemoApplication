package com.github.gang.flexbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.github.gang.R;

public class FlexViewFactory {
    public static FrameLayout newFrameLayout(Context context){
        return (FrameLayout) LayoutInflater.from(context).inflate(R.layout.view_flex_common_parent, null, false);
    }
}

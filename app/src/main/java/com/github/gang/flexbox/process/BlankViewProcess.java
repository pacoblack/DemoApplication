package com.github.gang.flexbox.process;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.CommonUtils;
import com.github.gang.flexbox.DynamicEngine;
import com.google.android.flexbox.FlexboxLayoutManager;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.Head.SUB_VIEWS;
import static com.github.gang.flexbox.json.FlexKeys.SubView.BACKGROUND_COLOR;
import static com.github.gang.flexbox.json.FlexKeys.SubView.CORNER_RADIUS;
import static com.github.gang.flexbox.json.FlexKeys.SubView.EVENT_CLICK;

public class BlankViewProcess {

    public View applyLayoutParams(View view, JSONObject params){
        FlexboxLayoutManager.LayoutParams lp = LayoutParamsHelper.createFlexLayoutParams(view, params);
        view.setLayoutParams(lp);
        bindEvent(view, params);
        return view;
    }

    protected void addSubView(ViewGroup viewGroup, JSONObject params) {
        if (viewGroup != null && params != null && params.has(SUB_VIEWS)) {
            RecyclerView flexView = DynamicEngine.createDynamicView(viewGroup.getContext(), params);
            viewGroup.addView(flexView);
        }
    }

    public View setView(View view, JSONObject params){
        if (view == null) {
            return null;
        }
        if (params != null){
            boolean hasColor = false;
            int color = 0;
            if (params.has(BACKGROUND_COLOR)){
                if (CommonUtils.isColor(params.optString(BACKGROUND_COLOR))){
                    hasColor = true;
                    color = Color.parseColor(params.optString(BACKGROUND_COLOR));
                    view.setBackgroundColor(color);
                }
            }
            if (params.has(CORNER_RADIUS)){
                int radius = params.optInt(CORNER_RADIUS);
                GradientDrawable gd = new GradientDrawable();
                gd.setCornerRadius(radius);
                if (hasColor) {
                    gd.setColor(color);
                }
                view.setBackground(gd);
            }
        }
        return view;
    }

    public void bindEvent(View view, JSONObject params){
        if (params != null){
            final String click = params.optString(EVENT_CLICK);
            if (!TextUtils.isEmpty(click)){
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO：这里认为click中会是deeplink

                    }
                });
            }
        }
    }


}

package com.github.gang.flexbox.process;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.github.gang.flexbox.DynamicViewComponent;

import org.json.JSONObject;

public class ButtonViewProcess extends BlankViewProcess implements DynamicViewComponent {
    @Override
    public View createDynamicView(Context context, ViewGroup viewGroup, JSONObject jsonObject) {
        Button button = new Button(context);
        if (viewGroup != null) {
            viewGroup.addView(button);
        }
        return createDynamicView(button, viewGroup, jsonObject);
    }

    @Override
    public View createDynamicView(View button, ViewGroup viewGroup, JSONObject jsonObject) {
        applyLayoutParams(viewGroup, jsonObject);
        addSubView(viewGroup, jsonObject);
        setView(button, jsonObject);
        return button;
    }

}
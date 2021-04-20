package com.github.gang.flexbox.process;

import android.content.Context;
import android.view.View;
import android.widget.Button;


import com.github.gang.flexbox.DynamicViewComponent;

import org.json.JSONObject;

public class ButtonViewProcess extends BlankViewProcess implements DynamicViewComponent<Button> {
    @Override
    public Button createDynamicView(Context context, JSONObject jsonObject) {
        Button button = new Button(context);
        return createDynamicView(button, jsonObject);
    }

    @Override
    public Button createDynamicView(Button button, JSONObject jsonObject) {
        apply(button, jsonObject);
        return button;
    }

    @Override
    public View apply(View view, JSONObject params) {
        return super.apply(view, params);
    }
}
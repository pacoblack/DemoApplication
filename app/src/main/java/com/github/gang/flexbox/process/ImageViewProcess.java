package com.github.gang.flexbox.process;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.github.gang.flexbox.DynamicViewComponent;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.SubView.SRC;

public class ImageViewProcess extends BlankViewProcess implements DynamicViewComponent {

    @Override
    public View createDynamicView(Context context, ViewGroup viewGroup, JSONObject jsonObject) {
        ImageView image = new ImageView(context);
        if (viewGroup != null) {
            viewGroup.addView(image);
        }
        return createDynamicView(image, viewGroup, jsonObject);
    }

    @Override
    public View createDynamicView(View view, ViewGroup viewGroup, JSONObject jsonObject) {
        applyLayoutParams(viewGroup, jsonObject);
        addSubView(viewGroup, jsonObject);
        setView(view, jsonObject);
        return view;
    }

    @Override
    public View setView(View view, JSONObject params) {
        if(view instanceof ImageView){
            if (params != null) {
                if (params.has(SRC)) {
                    Glide.with(view).load(params.optString(SRC)).into((ImageView) view);
                }
            }
        }
        return view;
    }
}

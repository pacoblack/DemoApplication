package com.github.gang.flexbox.process;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.github.gang.flexbox.DynamicViewComponent;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.SubView.SRC;

public class ImageViewProcess extends BlankViewProcess implements DynamicViewComponent<ImageView> {

    @Override
    public ImageView createDynamicView(Context context, JSONObject jsonObject) {
        ImageView image = new ImageView(context);
        return createDynamicView(image, jsonObject);
    }

    @Override
    public ImageView createDynamicView(ImageView view, JSONObject jsonObject) {
        apply(view, jsonObject);
        return view;
    }

    @Override
    public View apply(View view, JSONObject params) {
        if(view instanceof ImageView){
            if (params != null) {
                if (params.has(SRC)) {
                    Glide.with(view).load(params.optString(SRC)).into((ImageView) view);
                }
            }
        }
        return super.apply(view, params);
    }
}

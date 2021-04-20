package com.github.gang.flexbox.process;

import android.view.ViewGroup;

import com.github.gang.flexbox.FlexLayoutHelper;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static com.github.gang.flexbox.json.FlexKeys.SubView.HEIGHT;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_ALIGN_SELF;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_FLEX_BASIS_PERCENT;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_FLEX_GROW;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_FLEX_SHRINK;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_MAX_HEIGHT;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_MAX_WIDTH;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_MIN_HEIGHT;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_MIN_WIDTH;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_ORDER;
import static com.github.gang.flexbox.json.FlexKeys.SubView.LAYOUT_WRAP_BEFORE;
import static com.github.gang.flexbox.json.FlexKeys.SubView.MARGIN;
import static com.github.gang.flexbox.json.FlexKeys.SubView.WIDTH;


public class LayoutParamsHelper {

    public static ViewGroup.MarginLayoutParams createMarginLayoutParams(JSONObject jsonObject){
        ViewGroup.MarginLayoutParams layoutParams = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        if (jsonObject == null){
            return layoutParams;
        }
        if (jsonObject.has(WIDTH)) {
            layoutParams.width = jsonObject.optInt(WIDTH, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        if (jsonObject.has(HEIGHT)) {
            layoutParams.height = jsonObject.optInt(HEIGHT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        if (jsonObject.has(MARGIN)){
            JSONArray margins = jsonObject.optJSONArray(MARGIN);
            if (margins != null) {
                if (margins.length() == 4){
                    try {
                        layoutParams.leftMargin = margins.getInt(0);
                        layoutParams.topMargin = margins.getInt(1);
                        layoutParams.rightMargin = margins.getInt(2);
                        layoutParams.bottomMargin = margins.getInt(3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return layoutParams;
    }

    public static FlexboxLayoutManager.LayoutParams createFlexLayoutParams(JSONObject jsonObject){
        ViewGroup.LayoutParams params = createMarginLayoutParams(jsonObject);

        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(params);
        if (jsonObject != null) {
            if (jsonObject.has(LAYOUT_ORDER)){
                layoutParams.setOrder(jsonObject.optInt(LAYOUT_ORDER, 1));
            }
            if (jsonObject.has(LAYOUT_FLEX_GROW)){
                layoutParams.setFlexGrow((float) jsonObject.optDouble(LAYOUT_FLEX_GROW, 0));
            }
            if (jsonObject.has(LAYOUT_FLEX_SHRINK)){
                layoutParams.setFlexShrink((float) jsonObject.optDouble(LAYOUT_FLEX_SHRINK, 1));
            }
            if (jsonObject.has(LAYOUT_FLEX_BASIS_PERCENT)){
                layoutParams.setFlexBasisPercent((float) jsonObject.optDouble(LAYOUT_FLEX_BASIS_PERCENT, -1));
            }
            if (jsonObject.has(LAYOUT_ALIGN_SELF)){
                layoutParams.setAlignSelf(FlexLayoutHelper.layoutAlignSelf(jsonObject.optString(LAYOUT_ALIGN_SELF)));
            }
            if (jsonObject.has(LAYOUT_MIN_WIDTH)){
                layoutParams.setMinWidth(jsonObject.optInt(LAYOUT_MIN_WIDTH));
            }
            if (jsonObject.has(LAYOUT_MIN_HEIGHT)){
                layoutParams.setMinHeight(jsonObject.optInt(LAYOUT_MIN_HEIGHT));
            }
            if (jsonObject.has(LAYOUT_MAX_WIDTH)){
                layoutParams.setMaxWidth(jsonObject.optInt(LAYOUT_MAX_WIDTH));
            }
            if (jsonObject.has(LAYOUT_MAX_HEIGHT)){
                layoutParams.setMaxHeight(jsonObject.optInt(LAYOUT_MAX_HEIGHT));
            }
            if (jsonObject.has(LAYOUT_WRAP_BEFORE)){
                layoutParams.setWrapBefore(jsonObject.optBoolean(LAYOUT_WRAP_BEFORE, false));
            }
        }
        return layoutParams;
    }
}

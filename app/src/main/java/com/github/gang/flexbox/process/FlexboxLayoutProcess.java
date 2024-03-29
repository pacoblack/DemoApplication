package com.github.gang.flexbox.process;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.R;
import com.github.gang.flexbox.DynamicViewComponent;
import com.github.gang.flexbox.FlexAdapter;
import com.github.gang.flexbox.FlexLayoutHelper;
import com.google.android.flexbox.FlexboxLayoutManager;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.Head.ALIGN_CONTENT;
import static com.github.gang.flexbox.json.FlexKeys.Head.ALIGN_ITEMS;
import static com.github.gang.flexbox.json.FlexKeys.Head.FLEX_DIRECTION;
import static com.github.gang.flexbox.json.FlexKeys.Head.FLEX_WRAP;
import static com.github.gang.flexbox.json.FlexKeys.Head.JUSTIFY_CONTENT;
import static com.github.gang.flexbox.json.FlexKeys.Head.MAX_LINE;
import static com.github.gang.flexbox.json.FlexKeys.Head.SUB_VIEWS;


public class FlexboxLayoutProcess implements DynamicViewComponent {

    public FlexboxLayoutProcess() { }

    @Override
    public View createDynamicView(Context context, ViewGroup viewGroup, JSONObject jsonObject) {
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.view_recycler, null, false);
        return createDynamicView(recyclerView, viewGroup, jsonObject);
    }

    @Override
    public View createDynamicView(View view, ViewGroup viewGroup, JSONObject jsonObject) {
        FlexboxLayoutManager flexManager = new FlexboxLayoutManager(view.getContext());

        if (jsonObject != null) {
            if (jsonObject.has(FLEX_DIRECTION)) {
                String flexDirection = jsonObject.optString(FLEX_DIRECTION);
                flexManager.setFlexDirection(FlexLayoutHelper.flexDirection(flexDirection));
            }

            if (jsonObject.has(FLEX_WRAP)) {
                String flexWrap = jsonObject.optString(FLEX_WRAP);
                flexManager.setFlexWrap(FlexLayoutHelper.flexWrap(flexWrap));
            }

            if (jsonObject.has(JUSTIFY_CONTENT)) {
                String justifyContent = jsonObject.optString(JUSTIFY_CONTENT);
                flexManager.setJustifyContent(FlexLayoutHelper.justifyContent(justifyContent));
            }

            if (jsonObject.has(ALIGN_ITEMS)) {
                String alignItems = jsonObject.optString(ALIGN_ITEMS);
                flexManager.setAlignItems(FlexLayoutHelper.alignItems(alignItems));
            }

            if (jsonObject.has(ALIGN_CONTENT)) {
                String alignContent = jsonObject.optString(ALIGN_CONTENT);
                flexManager.setAlignContent(FlexLayoutHelper.alignContent(alignContent));
            }

            if (jsonObject.has(MAX_LINE)) {
                int maxLine = jsonObject.optInt(MAX_LINE, -1);
                flexManager.setMaxLine(maxLine);
            }
            ((RecyclerView)view).setAdapter(new FlexAdapter(jsonObject.optJSONArray(SUB_VIEWS), view));
        }
        ((RecyclerView)view).setLayoutManager(flexManager);
        return view;
    }


}

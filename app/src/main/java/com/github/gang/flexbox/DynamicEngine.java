package com.github.gang.flexbox;

import android.content.Context;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.process.FlexboxLayoutProcess;

import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.Head.SUB_VIEWS;

public class DynamicEngine {

    public static ViewGroup createDynamicView(Context context, JSONObject param){
        FlexboxLayoutProcess process = new FlexboxLayoutProcess();
        RecyclerView view = process.createDynamicView(context, param);
        if (param != null) {
            view.setAdapter(new FlexAdapter(param.optJSONArray(SUB_VIEWS)));
        }
        return view;
    }

}

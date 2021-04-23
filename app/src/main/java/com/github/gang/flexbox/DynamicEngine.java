package com.github.gang.flexbox;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.process.FlexboxLayoutProcess;

import org.json.JSONObject;

public class DynamicEngine {

    public static RecyclerView createDynamicView(Context context, JSONObject param){
        FlexboxLayoutProcess process = new FlexboxLayoutProcess();
        return (RecyclerView) process.createDynamicView(context, null, param);
    }

}

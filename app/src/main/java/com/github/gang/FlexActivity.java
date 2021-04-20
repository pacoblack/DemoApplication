package com.github.gang;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.DynamicEngine;
import com.github.gang.utils.FileUtils;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;

import org.json.JSONException;
import org.json.JSONObject;

public class FlexActivity extends AppCompatActivity {
    private ViewGroup container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flex);
        container = findViewById(R.id.container);
    }

    public void performFlexClick(View view) {
        FlexboxLayoutManager flexManager = new FlexboxLayoutManager(this);
        flexManager.setFlexDirection(FlexDirection.COLUMN);

//        recyclerView.setLayoutManager(flexManager);
//        recyclerView.setAdapter(new FlexAdapter(4));

    }

    public void performJsonFlexClick(View view) {
        JSONObject response = FileUtils.readFile(this, "flex.json");

        View flexView = null;
        try {
            flexView = DynamicEngine.createDynamicView(this, response.optJSONArray("layouts").getJSONObject(0));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        container.removeAllViews();
        container.addView(flexView);
    }
}

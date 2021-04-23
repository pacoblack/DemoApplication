package com.github.gang.flexbox;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.github.gang.flexbox.process.BlankViewProcess;
import com.github.gang.flexbox.process.ButtonViewProcess;
import com.github.gang.flexbox.process.ImageViewProcess;
import com.github.gang.flexbox.process.TextViewProcess;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.github.gang.flexbox.json.FlexKeys.SubView.TYPE;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.BUTTON;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.IMAGE;
import static com.github.gang.flexbox.json.FlexKeys.SubViewType.LABEL;

public class FlexAdapter extends RecyclerView.Adapter {
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_LABEL = 1;
    public static final int TYPE_BUTTON = 2;
    public static final int TYPE_IMAGE = 3;

    private final JSONArray jsonArray;
    private final View view;
    private ImageViewProcess imageViewProcess = new ImageViewProcess();
    private TextViewProcess textViewProcess = new TextViewProcess();
    private ButtonViewProcess buttonViewProcess = new ButtonViewProcess();
    private BlankViewProcess unknownViewProcess = new BlankViewProcess();

    public FlexAdapter(JSONArray jsonArray, View view) {
        this.jsonArray = jsonArray;
        this.view = view;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        FrameLayout frameLayout = FlexViewFactory.newFrameLayout(parent.getContext());
        switch (viewType){
            case TYPE_LABEL:
                frameLayout.addView(new TextView(parent.getContext()));
                return new RecyclerView.ViewHolder(frameLayout) {};
            case TYPE_BUTTON:
                frameLayout.addView(new Button(parent.getContext()));
                return new RecyclerView.ViewHolder(frameLayout) {};
            case TYPE_IMAGE:
                frameLayout.addView(new ImageView(parent.getContext()));
                return new RecyclerView.ViewHolder(frameLayout) {};
            default:
                return new RecyclerView.ViewHolder(frameLayout) {};
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewGroup viewGroup = (ViewGroup) holder.itemView;

        if (viewGroup.getChildAt(0) instanceof ImageView){
            imageViewProcess.createDynamicView(viewGroup.getChildAt(0), viewGroup, getData(position));
        } else if (viewGroup.getChildAt(0) instanceof Button){
            buttonViewProcess.createDynamicView((Button) viewGroup.getChildAt(0), viewGroup, getData(position));
        } else if (viewGroup.getChildAt(0) instanceof TextView){
            textViewProcess.createDynamicView((TextView) viewGroup.getChildAt(0), viewGroup, getData(position));
        } else {
            unknownViewProcess.applyLayoutParams(viewGroup, getData(position));
            ViewGroup.LayoutParams lp = viewGroup.getLayoutParams();
            lp.width = this.view.getMeasuredWidth();
            viewGroup.setLayoutParams(lp);
        }
    }

    @Override
    public int getItemCount() {
        return jsonArray == null || jsonArray.length() == 0 ? 0 : jsonArray.length();
    }

    @Override
    public int getItemViewType(int position) {
        return getViewType(parseJSONType(jsonArray, position));
    }

    public String parseJSONType(JSONArray source, int index){
        if (source == null || source.length() == 0){
            return "";
        }
        JSONObject obj = source.optJSONObject(index);
        if (obj != null) {
            return obj.optString(TYPE);
        }
        return "";
    }

    public int getViewType(String type){
        switch (type){
            case LABEL:
                return TYPE_LABEL;
            case BUTTON:
                return TYPE_BUTTON;
            case IMAGE:
                return TYPE_IMAGE;
            default:
                return TYPE_UNKNOWN;
        }
    }

    public JSONObject getData(int index){
        if (jsonArray == null || jsonArray.length() == 0){
            return null;
        }
        return jsonArray.optJSONObject(index);
    }
}

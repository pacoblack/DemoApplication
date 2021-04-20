package com.github.gang.flexbox;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    private ImageViewProcess imageViewProcess = new ImageViewProcess();
    private TextViewProcess textViewProcess = new TextViewProcess();
    private ButtonViewProcess buttonViewProcess = new ButtonViewProcess();
    private BlankViewProcess unknownViewProcess = new BlankViewProcess();

    public FlexAdapter(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case TYPE_LABEL:
                return new RecyclerView.ViewHolder(new TextView(parent.getContext())) {};
            case TYPE_BUTTON:
                return new RecyclerView.ViewHolder(new Button(parent.getContext())) {};
            case TYPE_IMAGE:
                return new RecyclerView.ViewHolder(new ImageView(parent.getContext())) {};
            default:
                return new RecyclerView.ViewHolder(new View(parent.getContext())) {};
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        View view = holder.itemView;
        if (view instanceof ImageView){
            imageViewProcess.createDynamicView((ImageView) view, getData(position));
        } else if (view instanceof Button){
            buttonViewProcess.createDynamicView((Button) view, getData(position));
        } else if (view instanceof TextView){
            textViewProcess.createDynamicView((TextView) view, getData(position));
        } else {
            unknownViewProcess.apply(view, getData(position));
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

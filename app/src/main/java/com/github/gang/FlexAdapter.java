package com.github.gang;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexboxLayoutManager;

public class FlexAdapter extends RecyclerView.Adapter {
    private final int size;

    public FlexAdapter(int i) {
        this.size = i;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler_item1, parent, false);
            FlexboxLayoutManager.LayoutParams lp = (FlexboxLayoutManager.LayoutParams) view.getLayoutParams();
            lp.setAlignSelf(AlignItems.FLEX_END);
            view.setLayoutParams(lp);
            return new RecyclerView.ViewHolder(view){};
        } else if (viewType == 2) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler_item2, parent, false);
            FlexboxLayoutManager.LayoutParams lp = (FlexboxLayoutManager.LayoutParams) view.getLayoutParams();
            lp.setAlignSelf(AlignItems.FLEX_END);
            view.setLayoutParams(lp);
            return new RecyclerView.ViewHolder(view){};
        } else if (viewType == 3) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler_item3, parent, false);
            FlexboxLayoutManager.LayoutParams lp = (FlexboxLayoutManager.LayoutParams) view.getLayoutParams();
            lp.setAlignSelf(AlignItems.CENTER);
            view.setLayoutParams(lp);
            return new RecyclerView.ViewHolder(view){};
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler_item4, parent, false);
            FlexboxLayoutManager.LayoutParams lp = (FlexboxLayoutManager.LayoutParams) view.getLayoutParams();
            lp.setAlignSelf(AlignItems.FLEX_START);
            view.setLayoutParams(lp);
            return new RecyclerView.ViewHolder(view){};
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return position + 1;
    }

    @Override
    public int getItemCount() {
        return size;
    }
}

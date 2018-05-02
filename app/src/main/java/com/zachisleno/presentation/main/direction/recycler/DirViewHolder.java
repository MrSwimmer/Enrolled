package com.zachisleno.presentation.main.direction.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zachisleno.R;


public class DirViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView original;
    TextView chance;
    public DirViewHolder(View v) {
        super(v);
        name = v.findViewById(R.id.item_dir_name);
        chance = v.findViewById(R.id.item_dir_chance);
        original = v.findViewById(R.id.item_dir_original);
    }
}

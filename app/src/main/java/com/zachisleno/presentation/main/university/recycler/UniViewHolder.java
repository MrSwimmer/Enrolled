package com.zachisleno.presentation.main.university.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zachisleno.R;


public class UniViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView numDirection;
    TextView bestDirection;
    TextView chance;
    ImageView image;

    public UniViewHolder(View v) {
        super(v);
        name = v.findViewById(R.id.item_uni_name);
        numDirection = v.findViewById(R.id.item_uni_count_dir);
        bestDirection = v.findViewById(R.id.item_uni_best_dir);
        chance = v.findViewById(R.id.item_uni_chance);
        image = v.findViewById(R.id.item_uni_image);
    }
}

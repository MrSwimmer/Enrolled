package com.zachisleno.presentation.main.direction.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bumptech.glide.Glide;
import com.zachisleno.App;
import com.zachisleno.R;
import com.zachisleno.data.api.model.res.Dir;
import com.zachisleno.data.api.model.res.Uni;
import com.zachisleno.presentation.main.detail_dir.DetailDirController;
import com.zachisleno.presentation.main.direction.DirectionController;

import java.util.ArrayList;


public class DirAdapter extends RecyclerView.Adapter<DirViewHolder> {

    ArrayList<Dir> dirs = new ArrayList<>();
    Router router;
    Context context;

    public DirAdapter(ArrayList<Dir> dirs, Router router, Context context) {
        this.dirs = dirs;
        this.router = router;
        this.context = context;
        App.getComponent().inject(this);
    }

    @Override
    public DirViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dir, parent, false);
        return new DirViewHolder(v);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(DirViewHolder holder, int position) {
        Dir dir = dirs.get(position);
        holder.chance.setText(dir.getChance() + "%");
        holder.name.setText(dir.getName());
        if (dir.isOriginal())
            holder.original.setText("Документ: оригинал");
        else
            holder.original.setText("Документ: копия");
        if(dir.getChance()<60)
            holder.chance.setTextColor(R.color.red);
        else if(dir.getChance()<80)
            holder.chance.setTextColor(R.color.main_orange);
        else
            holder.chance.setTextColor(R.color.green);
        holder.itemView.setOnClickListener(v -> router.replaceTopController(RouterTransaction.with(new DetailDirController())));
    }

    @Override
    public int getItemCount() {
        return dirs.size();
    }
}

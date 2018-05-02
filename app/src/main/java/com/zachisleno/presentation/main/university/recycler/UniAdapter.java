package com.zachisleno.presentation.main.university.recycler;

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
import com.zachisleno.data.api.model.res.Uni;
import com.zachisleno.presentation.main.direction.DirectionController;

import java.util.ArrayList;


public class UniAdapter extends RecyclerView.Adapter<UniViewHolder> {

    ArrayList<Uni> unis = new ArrayList<>();
    Router router;
    Context context;

    public UniAdapter(ArrayList<Uni> unis, Router router, Context context) {
        this.unis = unis;
        this.router = router;
        this.context = context;
        App.getComponent().inject(this);
    }

    @Override
    public UniViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_uni, parent, false);
        return new UniViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UniViewHolder holder, int position) {
        Uni uni = unis.get(position);
        Glide.with(context)
                .load(uni.getImage())
                .centerCrop()
                .placeholder(R.color.transparent)
                .into(holder.image);
        holder.chance.setText(uni.getChance()+"%");
        holder.bestDirection.setText("Лучшее направление: " + uni.getBestDir());
        holder.name.setText(uni.getName());
        holder.numDirection.setText("Направлений: " + uni.getNumDirs());
        holder.itemView.setOnClickListener(v -> router.replaceTopController(RouterTransaction.with(new DirectionController())));
    }

    @Override
    public int getItemCount() {
        return unis.size();
    }
}

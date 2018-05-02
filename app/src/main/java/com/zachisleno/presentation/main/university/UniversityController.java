package com.zachisleno.presentation.main.university;

import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.zachisleno.R;
import com.zachisleno.data.api.model.res.Uni;
import com.zachisleno.presentation.main.university.recycler.UniAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UniversityController extends MvpController<UniversityContract.View, UniversityContract.Presenter> implements UniversityContract.View, SwipeRefreshLayout.OnRefreshListener {


    @BindView(R.id.uni_recycler)
    RecyclerView recyclerView;
    @BindView(R.id.uni_swipe)
    SwipeRefreshLayout swipe;
    @BindView(R.id.uni_empty_text)
    TextView emptyText;

    @NonNull
    @Override
    public UniversityContract.Presenter createPresenter() {
        return new UniversityPresenter();
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_university, container, false);
        ButterKnife.bind(this, view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        swipe.setOnRefreshListener(this);
        swipe.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        return view;
    }

    @Override
    protected void onAttach(@NonNull View view) {
        super.onAttach(view);
        presenter.setRecyclerData();
    }

    @Override
    public void onRefresh() {
        swipe.setRefreshing(true);
        presenter.setRecyclerData();
    }

    @Override
    public void initAdapter(ArrayList<Uni> unis) {
        swipe.setRefreshing(false);
        if (unis.size() == 0)
            emptyText.setVisibility(View.VISIBLE);
        else
            emptyText.setVisibility(View.INVISIBLE);
        recyclerView.setAdapter(new UniAdapter(unis, getRouter(), getActivity()));
    }
}

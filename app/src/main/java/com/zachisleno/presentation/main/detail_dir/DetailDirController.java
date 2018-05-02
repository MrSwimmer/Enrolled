package com.zachisleno.presentation.main.detail_dir;

import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.zachisleno.R;
import com.zachisleno.data.api.model.res.DetailDir;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailDirController extends MvpController<DetailDirContract.View, DetailDirContract.Presenter> implements DetailDirContract.View, SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.detail_dir_swipe)
    SwipeRefreshLayout swipe;
    @BindView(R.id.detail_dir_name)
    TextView name;
    @BindView(R.id.detail_dir_pos)
    TextView pos;
    @BindView(R.id.detail_dir_pos_orig)
    TextView posOrig;
    @BindView(R.id.detail_dir_count_places)
    TextView places;
    @BindView(R.id.detail_dir_competition)
    TextView comp;
    @BindView(R.id.detail_dir_dis)
    TextView des;
    @BindView(R.id.detail_dir_chance)
    TextView chance;

    @NonNull
    @Override
    public DetailDirContract.Presenter createPresenter() {
        return new DetailDirPresenter();
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_detail_dir, container, false);
        ButterKnife.bind(this, view);
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
        presenter.setDetail();
    }

    @Override
    public void onRefresh() {
        swipe.setRefreshing(true);
        presenter.setDetail();
    }

    @Override
    public void initDetail(DetailDir detailDir) {
        name.setText(detailDir.getName());
        pos.setText(detailDir.getPos());
        posOrig.setText(detailDir.getPosOrig());
        places.setText(detailDir.getPlaces());
        comp.setText(detailDir.getComp());
        des.setText(detailDir.getDes());
        chance.setText(detailDir.getChance());
        chance.setTextColor(detailDir.getColor());
    }
}

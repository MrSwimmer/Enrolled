package com.zachisleno.presentation.main.settings;

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

public class SettingsController extends MvpController<SettingsContract.View, SettingsContract.Presenter> implements SettingsContract.View {

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
    public SettingsContract.Presenter createPresenter() {
        return new SettingsPresenter();
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_settings, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}

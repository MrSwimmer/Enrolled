package com.zachisleno.presentation.main.settings;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.zachisleno.App;
import com.zachisleno.R;
import com.zachisleno.data.api.model.res.DetailDir;
import com.zachisleno.domain.interactor.SettingsService;
import com.zachisleno.presentation.intro.IntroActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingsController extends MvpController<SettingsContract.View, SettingsContract.Presenter> implements SettingsContract.View {

    @BindView(R.id.settings_sign_out)
    TextView signOut;
    @BindView(R.id.settings_about_version)
    TextView aboutV;
    @BindView(R.id.settings_mark_in_gp)
    TextView markInGP;
    @BindView(R.id.settings_share)
    TextView share;


    @Inject
    SettingsService settingsService;

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
        App.getComponent().inject(this);
        return view;
    }

    @OnClick(R.id.settings_sign_out)
    void onSignOutClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выход из аккаунта")
                .setMessage("Вы действительно хотите выйти из аккаунта?")
                .setPositiveButton("Да", (dialog, which) -> {
                    settingsService.clearSettings();
                    Intent intent = new Intent(getActivity(), IntroActivity.class);
                    getActivity().startActivity(intent);
                }).setNegativeButton("Нет", (dialog, which) -> dialog.cancel());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @OnClick(R.id.settings_about_version)
    void onAboutVClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("О версии")
                .setMessage("Что-то о версии")
                .setPositiveButton("OK", (dialog, which) -> {
                    dialog.cancel();
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @OnClick(R.id.settings_mark_in_gp)
    void onMarkClick() {

    }

    @OnClick(R.id.settings_share)
    void onShareClick() {

    }
}

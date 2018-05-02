package com.zachisleno.presentation.main.settings;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.zachisleno.App;
import com.zachisleno.data.api.model.res.DetailDir;

public class SettingsPresenter extends MvpBasePresenter<SettingsContract.View> implements SettingsContract.Presenter {

    public SettingsPresenter() {
        App.getComponent().inject(this);
    }

}

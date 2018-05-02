package com.zachisleno.presentation.intro.auth;

import android.util.Log;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.zachisleno.App;
import com.zachisleno.domain.interactor.SettingsService;

import javax.inject.Inject;

public class AuthPresenter extends MvpBasePresenter<AuthContract.View> implements AuthContract.Presenter {
    @Inject
    SettingsService settingsService;

    public AuthPresenter() {
        App.getComponent().inject(this);
    }

    @Override
    public void checkUser() {
        String test = settingsService.getTest();
        Log.i("code", test);
        getView().gotoMain();
    }
}

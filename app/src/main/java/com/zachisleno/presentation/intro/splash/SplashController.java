package com.zachisleno.presentation.intro.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.zachisleno.App;
import com.zachisleno.R;
import com.zachisleno.domain.interactor.SettingsService;
import com.zachisleno.presentation.intro.first.FirstController;
import com.zachisleno.presentation.intro.slide.SlideActivity;
import com.zachisleno.presentation.main.MainActivity;

import javax.inject.Inject;

public class SplashController extends Controller {

    @Inject
    SettingsService settingsService;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_splash, container, false);
        App.getComponent().inject(this);
        new Handler().postDelayed(() -> {
            if (settingsService.getFirstName().equals("lol")) {
                Intent intent = new Intent(getActivity(), SlideActivity.class);
                getActivity().startActivity(intent);
                getRouter().replaceTopController(RouterTransaction.with(new FirstController()));
            } else {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent);
                getActivity().finish();
            }
        }, 2000);
        return view;
    }

}

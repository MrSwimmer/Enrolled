package com.zachisleno.presentation.intro.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.zachisleno.R;
import com.zachisleno.presentation.intro.first.FirstController;
import com.zachisleno.presentation.intro.slide.SlideActivity;

public class SplashController extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_splash, container, false);
        new Handler().postDelayed(() -> {
            if (true) {
                Intent intent = new Intent(getActivity(), SlideActivity.class);
                getActivity().startActivity(intent);
            }
            getRouter().replaceTopController(RouterTransaction.with(new FirstController()));
        }, 2000);
        return view;
    }

}

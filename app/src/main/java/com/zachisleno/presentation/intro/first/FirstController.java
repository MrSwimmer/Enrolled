package com.zachisleno.presentation.intro.first;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.zachisleno.R;
import com.zachisleno.presentation.intro.auth.AuthController;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstController extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_first, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.first_yes)
    void onYesClick() {
        getRouter().replaceTopController(RouterTransaction.with(new AuthController()));
    }

}

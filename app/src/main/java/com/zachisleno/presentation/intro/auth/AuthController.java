package com.zachisleno.presentation.intro.auth;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.zachisleno.R;
import com.zachisleno.presentation.intro.slide.SlideActivity;
import com.zachisleno.presentation.main.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AuthController extends MvpController<AuthContract.View, AuthContract.Presenter> implements AuthContract.View{

    @NonNull
    @Override
    public AuthContract.Presenter createPresenter() {
        return new AuthPresenter();
    }

    @OnClick(R.id.auth_button)
    void onButtonClick() {

        presenter.checkUser();
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_auth, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void gotoMain() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        getActivity().startActivity(intent);
    }
}

package com.zachisleno.presentation.intro.auth;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.zachisleno.R;
import com.zachisleno.presentation.intro.slide.SlideActivity;
import com.zachisleno.presentation.main.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AuthController extends MvpController<AuthContract.View, AuthContract.Presenter> implements AuthContract.View{

    @BindView(R.id.auth_first_name)
    TextView first;
    @BindView(R.id.auth_second_name)
    TextView second;
    @BindView(R.id.auth_third_name)
    TextView third;

    @NonNull
    @Override
    public AuthContract.Presenter createPresenter() {
        return new AuthPresenter();
    }

    @OnClick(R.id.auth_button)
    void onButtonClick() {
        presenter.checkUser(first.getText().toString(), second.getText().toString(), third.getText().toString());
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

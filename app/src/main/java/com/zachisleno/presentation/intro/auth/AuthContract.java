package com.zachisleno.presentation.intro.auth;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface AuthContract {
    interface View extends MvpView {

        void gotoMain();
    }

    interface Presenter extends MvpPresenter<View> {
        void checkUser(String first, String second, String third);
    }
}

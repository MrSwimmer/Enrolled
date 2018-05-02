package com.zachisleno.presentation.main.university;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.zachisleno.data.api.model.res.Uni;

import java.util.ArrayList;

public interface UniversityContract {

    interface View extends MvpView {

        void initAdapter(ArrayList<Uni> unis);
    }

    interface Presenter extends MvpPresenter<View> {

        void setRecyclerData();
    }
}

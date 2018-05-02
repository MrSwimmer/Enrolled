package com.zachisleno.presentation.main.direction;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.zachisleno.data.api.model.res.Dir;

import java.util.ArrayList;

public interface DirectionContract {
    interface View extends MvpView {
        void initAdapter(ArrayList<Dir> dirs);
    }

    interface Presenter extends MvpPresenter<View> {

        void setRecyclerData();
    }
}

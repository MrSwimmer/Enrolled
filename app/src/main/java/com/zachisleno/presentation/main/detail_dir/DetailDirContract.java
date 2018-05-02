package com.zachisleno.presentation.main.detail_dir;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.zachisleno.data.api.model.res.DetailDir;
import com.zachisleno.data.api.model.res.Uni;

import java.util.ArrayList;

public interface DetailDirContract {
    interface View extends MvpView {

        void initDetail(DetailDir detailDir);
    }

    interface Presenter extends MvpPresenter<View> {

        void setDetail();
    }
}

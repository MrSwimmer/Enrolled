package com.zachisleno.presentation.main.detail_dir;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.zachisleno.App;
import com.zachisleno.R;
import com.zachisleno.data.api.model.res.DetailDir;
import com.zachisleno.data.api.model.res.Uni;

import java.util.ArrayList;

public class DetailDirPresenter extends MvpBasePresenter<DetailDirContract.View> implements DetailDirContract.Presenter {

    public DetailDirPresenter() {
        App.getComponent().inject(this);
    }

    @Override
    public void setDetail() {
        DetailDir detailDir = new DetailDir("Программная инженерия", "Описание", "88%", "Документ: копия", "Конкурс: 8 чел/место", "Количество мест: 20", "Текущая позиция: 40", "Позиция по оригиналам: 10", R.color.red);
        getView().initDetail(detailDir);
    }
}

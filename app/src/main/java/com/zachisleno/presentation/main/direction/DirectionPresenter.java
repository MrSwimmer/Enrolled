package com.zachisleno.presentation.main.direction;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.zachisleno.data.api.model.res.Dir;
import com.zachisleno.data.api.model.res.Uni;

import java.util.ArrayList;

public class DirectionPresenter extends MvpBasePresenter<DirectionContract.View> implements DirectionContract.Presenter {

    public static Dir curDir;

    @Override
    public void setRecyclerData() {
        ArrayList<Dir> dirs = new ArrayList<>();
        for(int i=0; i<5; i++) {
            dirs.add(new Dir("name", false, 43));
        }
        getView().initAdapter(dirs);
    }

}

package com.zachisleno.presentation.main.university;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.zachisleno.App;
import com.zachisleno.data.api.model.res.Uni;

import java.util.ArrayList;
import java.util.Arrays;

public class UniversityPresenter extends MvpBasePresenter<UniversityContract.View> implements UniversityContract.Presenter {

    public static Uni curUni;
    public UniversityPresenter() {
        App.getComponent().inject(this);
    }

    @Override
    public void setRecyclerData() {
        ArrayList<Uni> unis = new ArrayList<>();
        for(int i=0; i<5; i++) {
            unis.add(new Uni(4, "шарага", "https://pp.userapi.com/c627721/v627721422/13a96/og7Ekkct4EU.jpg", 54, "kekos"));
        }
        getView().initAdapter(unis);
    }
}

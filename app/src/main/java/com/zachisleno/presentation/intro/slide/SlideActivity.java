package com.zachisleno.presentation.intro.slide;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zachisleno.R;

import javax.inject.Inject;

import agency.tango.materialintroscreen.MaterialIntroActivity;

public class SlideActivity extends MaterialIntroActivity {

    @Inject
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] intros = getResources().getStringArray(R.array.intros);
        enableLastSlideAlphaExitTransition(true);
        for(int i=0; i<intros.length; i++) {
            addSlide(new SlideFragment(intros[i]));
        }
    }


    @Override
    public void onFinish() {
        super.onFinish();
    }
}
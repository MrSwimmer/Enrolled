package com.zachisleno.presentation.intro.slide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zachisleno.R;

public class SlideFragment extends agency.tango.materialintroscreen.SlideFragment {
    String text;
    TextView textView;

    public SlideFragment() {
        super();
    }

    @SuppressLint("ValidFragment")
    public SlideFragment(String textView) {
        super();
        this.text = textView;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.intro_slide, container, false);
        textView = view.findViewById(R.id.textintro);
        textView.setText(text);
        return view;
    }

    @Override
    public String cantMoveFurtherErrorMessage() {
        return "Ошибка";
    }
    @Override
    public int backgroundColor() {
        return R.color.main;
    }

    @Override
    public int buttonsColor() {
        return R.color.main_orange;
    }
}

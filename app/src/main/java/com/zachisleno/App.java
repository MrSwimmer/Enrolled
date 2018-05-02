package com.zachisleno;

import android.app.Application;

import com.zachisleno.di.AppComponent;
import com.zachisleno.di.DaggerAppComponent;
import com.zachisleno.di.module.SharedPreferencesModule;

public class App extends Application {
    private static AppComponent component;
    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .sharedPreferencesModule(new SharedPreferencesModule(getApplicationContext()))
                .build();
    }
}

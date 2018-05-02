package com.zachisleno.domain.interactor;

import android.content.SharedPreferences;

public class SettingsService {

    SharedPreferences sharedPreferences;

    public SettingsService(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public String getTest() {
        return sharedPreferences.getString("test", "lol");
    }
}

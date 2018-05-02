package com.zachisleno.domain.interactor;

import android.content.SharedPreferences;

public class SettingsService {
    String ID = "id";
    String FIRST_NAME = "first name";
    String SECOND_NAME = "second name";
    String THIRD_NAME = "third name";


    SharedPreferences sharedPreferences;

    public SettingsService(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public String getTest() {
        return sharedPreferences.getString("test", "lol");
    }

    public void clearSettings() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIRST_NAME, "lol");
        editor.apply();
    }

    public String getFirstName() {
        return sharedPreferences.getString(FIRST_NAME, "lol");
    }

    public void initUser(String id, String first, String second, String third) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIRST_NAME, first);
        editor.putString(SECOND_NAME, second);
        editor.putString(THIRD_NAME, third);
        editor.putString(ID, third);
        editor.apply();
    }
}

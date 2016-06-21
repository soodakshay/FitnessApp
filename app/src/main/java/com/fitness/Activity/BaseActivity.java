package com.fitness.Activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.fitness.Const;


public class BaseActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(Const.PREFS , MODE_PRIVATE);
        editor = preferences.edit();


    }
}

package com.fitness.Activity;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.fitness.Const;
import com.fitness.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    ImageButton exitBT, signupBT;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences(Const.PREFS, MODE_PRIVATE);
        editor = preferences.edit();
        if (preferences.contains(Const.IS_LOGGEDIN)) {
            if (preferences.getBoolean(Const.IS_LOGGEDIN, false)) {
                Toast.makeText(MainActivity.this, "Welcome back " + preferences.getString(Const.USERNAME, "Name"), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, TrainingTypeActivity.class));
                finish();
            } else {
                initUI();
            }
        } else {
            initUI();
        }

    }

    private void initUI() {

        exitBT = (ImageButton) findViewById(R.id.exitBT);
        signupBT = (ImageButton) findViewById(R.id.signupBT);
        exitBT.setOnClickListener(this);
        signupBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.exitBT:
                finish();
                break;

            case R.id.signupBT:
                startActivity(new Intent(this, SignupActivity.class));
                finish();
                break;
        }

    }
}

package com.fitness.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.fitness.Gain.GainDietWorkout;
import com.fitness.R;


public class TrainingTypeActivity extends BaseActivity implements View.OnClickListener {
    ImageView looseIV, gainIV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_type);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initUI();
    }

    private void initUI() {
        looseIV = (ImageView) findViewById(R.id.looseIV);
        gainIV = (ImageView) findViewById(R.id.gainIV);
        looseIV.setOnClickListener(this);
        gainIV.setOnClickListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.looseIV:
                startActivity(new Intent(TrainingTypeActivity.this, LoseDietWorkout.class));

                break;
            case R.id.gainIV:
                startActivity(new Intent(TrainingTypeActivity.this, GainDietWorkout.class));
                break;
        }
    }
}

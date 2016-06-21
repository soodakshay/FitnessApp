package com.fitness.Gain;

import android.os.Bundle;
import android.view.MenuItem;

import com.fitness.Activity.BaseActivity;
import com.fitness.R;


public class GainWorkoutChart extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_workout_chart);
getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

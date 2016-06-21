package com.fitness.Gain;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.fitness.Activity.BaseActivity;
import com.fitness.Activity.LooseDiet;
import com.fitness.Activity.LooseExerciseActivity;
import com.fitness.R;

/**
 * Created by AKSHAY_SOOD on 17/04/16.
 */
public class GainDietWorkout extends BaseActivity {
    ImageButton dietChatIV , workoutIV;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_diet_workout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dietChatIV = (ImageButton) findViewById(R.id.GaindietChartIV);
        workoutIV = (ImageButton) findViewById(R.id.GainworkoutIV);
        dietChatIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GainDietWorkout.this , GainDiet.class));
            }
        });

        workoutIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GainDietWorkout.this , GainWorkoutChart.class));
            }
        });
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

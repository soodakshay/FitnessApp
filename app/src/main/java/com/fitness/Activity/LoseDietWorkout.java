package com.fitness.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.fitness.R;


public class LoseDietWorkout extends BaseActivity {
    ImageButton dietChatIV , workoutIV;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_diet_workout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dietChatIV = (ImageButton) findViewById(R.id.dietChartIV);
        workoutIV = (ImageButton) findViewById(R.id.workoutIV);
        dietChatIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseDietWorkout.this , LooseDiet.class));
            }
        });

        workoutIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseDietWorkout.this , LooseExerciseActivity.class));
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

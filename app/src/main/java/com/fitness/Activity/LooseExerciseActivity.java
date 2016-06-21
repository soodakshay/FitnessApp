package com.fitness.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.fitness.R;


public class LooseExerciseActivity extends BaseActivity {
    Button workoutListBT;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loose_exercie);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        workoutListBT = (Button) findViewById(R.id.workoutListBT);
        workoutListBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LooseExerciseActivity.this, WorkoutListActivity.class));
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}





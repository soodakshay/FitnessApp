package com.fitness.Gain;

import android.os.Bundle;
import android.view.MenuItem;

import com.fitness.Activity.BaseActivity;
import com.fitness.R;

/**
 * Created by AKSHAY_SOOD on 17/04/16.
 */
public class GainDiet extends BaseActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_diet);
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

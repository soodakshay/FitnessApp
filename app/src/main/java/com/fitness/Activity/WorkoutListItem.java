package com.fitness.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.fitness.R;


public class WorkoutListItem extends BaseActivity {
    ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_list_item_images);
        imageView= (ImageView) findViewById(R.id.looseWorkoutIV);
        Intent intent = getIntent();
        int postion = intent.getIntExtra("position" , 0);

        switch (postion)
        {
            case 0:
                imageView.setImageResource(R.mipmap.position_1);
                break;
            case 1:
                imageView.setImageResource(R.mipmap.position_2);
                break;

            case 2:
                imageView.setImageResource(R.mipmap.position_3);
                break;

            case 3:
                imageView.setImageResource(R.mipmap.position_4);
                break;
            case 4:
                imageView.setImageResource(R.mipmap.position_5);
                break;
            case 5:

                imageView.setImageResource(R.mipmap.position_6);
                break;
            case 6:
                imageView.setImageResource(R.mipmap.position_7);
                break;
            case 7:
                imageView.setImageResource(R.mipmap.position_8);
                break;
            case 8:
                imageView.setImageResource(R.mipmap.position_9);
                break;
            case 9:
                imageView.setImageResource(R.mipmap.position_10);
                break;



        }


    }
}

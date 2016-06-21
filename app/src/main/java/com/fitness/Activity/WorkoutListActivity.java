package com.fitness.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fitness.R;

public class WorkoutListActivity extends BaseActivity {
ListView workoutListLV;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_list_activity);
getSupportActionBar().setDisplayShowHomeEnabled(true);
        workoutListLV = (ListView) findViewById(R.id.workoutListLV);
        workoutListLV.setAdapter(new WorkOutListAdapter(WorkoutListActivity.this));

        workoutListLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(WorkoutListActivity.this , WorkoutListItem.class);
                intent.putExtra("position" , position);
                startActivity(intent);
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

class WorkOutListAdapter extends BaseAdapter {
    String[] items = {"Moderate Intensity Minute: 1, 2, 3 Squat and Rear Lunge", "Moderate Intensity Minute: Squat, Plank, Pushup " ,
            "High Intensity Push: Squat Jumps In n’ Out" , "Moderate Intensity Minute: Deadlift Balance",
    "High Intensity Push: Side-to-Side Shuffle Jump","Moderate Intensity Minute: Tabletop Dip","Moderate Intensity Minute: V Sit-Ups",
            "High Intensity Push: Plank Pike Jumps","Finishing Hip Stretch"};
    Context context;
    LayoutInflater inflater;

    public WorkOutListAdapter(Context context) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder1 holder1;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_loose, null);
            holder1 = new ViewHolder1();
            holder1.textView = (TextView) convertView.findViewById(R.id.trainingTypeTV);
            convertView.setTag(holder1);
        }else {
            holder1 = (ViewHolder1) convertView.getTag();
        }

        holder1.textView.setText(items[position]);
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }
}

class ViewHolder1{
    TextView textView;
}

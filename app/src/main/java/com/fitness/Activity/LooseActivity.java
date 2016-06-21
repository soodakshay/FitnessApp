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


public class LooseActivity extends BaseActivity {

    ListView looseLV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loose);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        looseLV = (ListView) findViewById(R.id.looseLV);
        looseLV.setAdapter(new looseLVAdapter(LooseActivity.this));

        looseLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(LooseActivity.this, LooseExerciseActivity.class));
                        break;

                    case 1:
                        startActivity(new Intent(LooseActivity.this, LooseDiet.class));
                        break;
                }
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

class looseLVAdapter extends BaseAdapter {
    String[] items = {"Exercise", "Diet Chart"};
    TextView textView;
    Context context;
    LayoutInflater inflater;

    public looseLVAdapter(Context context) {
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
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_loose, null);
            textView = (TextView) convertView.findViewById(R.id.trainingTypeTV);
        }

        textView.setText(items[position]);
        return convertView;
    }
}

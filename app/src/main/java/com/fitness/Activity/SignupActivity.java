package com.fitness.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.fitness.Const;
import com.fitness.R;

public class SignupActivity extends BaseActivity {

    TextInputEditText usernameET , ageET, weightET , heightFTET , heightinET ;

    Button saveBT;
    RadioGroup radioGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();

    }

    private void initUI() {
        usernameET = (TextInputEditText) findViewById(R.id.usernameET);
        ageET = (TextInputEditText) findViewById(R.id.ageET);
        weightET = (TextInputEditText) findViewById(R.id.weightET);
        heightFTET = (TextInputEditText) findViewById(R.id.heightFTET);
        heightinET = (TextInputEditText) findViewById(R.id.heightinET);
        saveBT = (Button) findViewById(R.id.saveBT);
        radioGroup = (RadioGroup) findViewById(R.id.radioGenderRB);

        preferences = getSharedPreferences(Const.PREFS , MODE_PRIVATE);
        editor = preferences.edit();
        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preferences = getSharedPreferences(Const.PREFS , MODE_PRIVATE);
                editor = preferences.edit();
                String username = usernameET.getText().toString();
                String age = ageET.getText().toString();
                String weight = weightET.getText().toString();
                String height_ft = heightFTET.getText().toString();
                String height_in = heightinET.getText().toString();
                int genderID = radioGroup.getCheckedRadioButtonId();
                String gender=null;
                switch (genderID)
                {
                    case R.id.maleRB:
                        gender = "Male";
                        break;
                    case R.id.femaleRB:
                        gender = "Female";
                        break;
                }
                if(username.equals("") || age.equals("") || weight.equals("") || height_ft.equals("") || height_in.equals("")  || gender == null)
                {
                    Toast.makeText(SignupActivity.this , "All Fields Are Mandatory" , Toast.LENGTH_SHORT).show();
                }else{
                    editor.putString(Const.USERNAME , username);
                    editor.putString(Const.AGE , age);
                    editor.putString(Const.WEIGHT , weight);
                    editor.putString(Const.HEIGHT_FT , height_ft);
                    editor.putBoolean(Const.IS_LOGGEDIN ,true);
                    editor.putString(Const.HEIGHT_IN , height_in).commit();
                    startActivity(new Intent(SignupActivity.this , TrainingTypeActivity.class));
                    finish();
                }


            }
        });


    }
}

package com.example.mna_rajput.uicomponentlab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadiobtnActivity extends AppCompatActivity {

    Button button;
    RadioButton genderradioButton;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobtn);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
    }

    public void onclickbuttonMethod(View v) {

        int selectedId = radioGroup.getCheckedRadioButtonId();

        genderradioButton = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(RadiobtnActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(RadiobtnActivity.this, genderradioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}

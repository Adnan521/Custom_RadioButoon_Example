package com.example.custom_radiobutoon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);
    }

    public void Submit(View view) {
        int radiobtnId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radiobtnId);

        if (radiobtnId==-1){
            Toast.makeText(MainActivity.this, "Noting Selected", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "Checked Value Is : "+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
        }



    }
}
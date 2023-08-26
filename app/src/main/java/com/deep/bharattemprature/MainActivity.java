package com.deep.bharattemprature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputTv;
    EditText inputTv;
    Switch optionBtn;
    Button btn, clearbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionBtn = findViewById(R.id.switchforC2F);
        inputTv = findViewById(R.id.editTv);
        outputTv = findViewById(R.id.resultTv);
        btn = findViewById(R.id.oprBtn);
        clearbtn = findViewById(R.id.clearbtn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputValue = Integer.parseInt(inputTv.getText().toString());

                if(optionBtn.isChecked()) {
                    // if input value in Celcius
                    int ResultValue = (int) ((inputValue * 1.8) + 32);
                    outputTv.setText(ResultValue);
                }
                else {
                    //if value is Forenhite
                    int ResultValue = (int) ( (inputValue - 32) * 0.5555);
                    outputTv.setText(ResultValue);
                }
            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputTv.setText(" ");
                inputTv.setText(" ");
            }
        });

    }
}
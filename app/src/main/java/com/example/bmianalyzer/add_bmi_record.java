package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_bmi_record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bmi_record);

        Button btn_weightDecre = findViewById(R.id.weightDecre1);
        btn_weightDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.et_weight1);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button btn_weightIncre = findViewById(R.id.weightIncre1);
        btn_weightIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.et_weight1);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });
        ////////////

        Button btn_lengthDecre = findViewById(R.id.lengthDecre1);
        btn_lengthDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed_lenght1);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button btn_lengthIncre = findViewById(R.id.lengthIncre1);
        btn_lengthIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed_lenght1);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });
    }

}
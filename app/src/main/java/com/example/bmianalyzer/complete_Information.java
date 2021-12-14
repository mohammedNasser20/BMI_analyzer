package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class complete_Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_information);

        Button weightDecre = findViewById(R.id.weightDecre);
        weightDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.et_weight);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button weightIncre = findViewById(R.id.weightIncre);
        weightIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.et_weight);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });

        Button lengthDecre = findViewById(R.id.lengthDecre);
        lengthDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed_lenght);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button lengthIncre = findViewById(R.id.lengthIncre);
        lengthIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed_lenght);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });

        //button
        Button save_button = findViewById(R.id.save);
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(complete_Information.this, home.class);
                finish();
                startActivity(intent);
            }
        });
    }


}
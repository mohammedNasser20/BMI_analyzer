package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<String> tall = new ArrayList<>();
        ArrayList<String> weight = new ArrayList<>();
        ArrayList<String> clas = new ArrayList<>();
        ArrayList<String> date = new ArrayList<>();

        for (int i=0;i<=15;i++){
            tall.add("170 cm");
            weight.add("60 kg");
            clas.add("Normal");
            date.add("20/3/2021");
        }

        RecyclerView status_List = (RecyclerView) findViewById(R.id.status_List);
        statusListAdapter adapter = new statusListAdapter() ;
        adapter.setList(tall,date,weight,clas);
        status_List.setAdapter(adapter);
        status_List.setLayoutManager(new LinearLayoutManager(this));




        Button btn_addRecord = findViewById(R.id.btn_addRecord);
        btn_addRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,add_bmi_record.class));
            }
        });

        Button btn_addfood = findViewById(R.id.btn_addfood);
        btn_addfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,add_food.class));
            }
        });

        Button btn_viewFood = findViewById(R.id.btn_viewFood);
        btn_viewFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,food_list.class));
            }
        });

        //button
        Button log_out_button = findViewById(R.id.log_out);
        log_out_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, logIn.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
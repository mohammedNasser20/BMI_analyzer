package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class food_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        RecyclerView food_List = (RecyclerView) findViewById(R.id.foodList);
        foodListAdapter adapter = new foodListAdapter() ;
        food_List.setAdapter(adapter);
        food_List.setLayoutManager(new LinearLayoutManager(this));
    }
}
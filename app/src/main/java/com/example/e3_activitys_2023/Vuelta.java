package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Vuelta extends AppCompatActivity {

    LinearLayout vuelta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuelta);

        Intent intent = getIntent();
        vuelta = findViewById(R.id.vuelta);

        vuelta.setBackgroundResource(intent.getIntExtra("color",R.color.white));

    }

}
package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Colors4 extends AppCompatActivity {

    View view111;
    View view112;
    View view121;
    View view122;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors4);

        view111 = findViewById(R.id.view111);
        view112 = findViewById(R.id.view112);
        view121 = findViewById(R.id.view121);
        view122 = findViewById(R.id.view122);

        view111.setOnClickListener(onClickListener);
        view112.setOnClickListener(onClickListener);
        view121.setOnClickListener(onClickListener);
        view122.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        Intent i = new Intent(this, Vuelta.class);

        v.getBackground();
        i.putExtra("color",((ColorDrawable)v.getBackground()).getColor());
        i.putExtra("buttons", 2);
        startActivity(i);

    };

}
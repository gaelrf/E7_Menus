package com.example.e3_activitys_2023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Colors6 extends AppCompatActivity {

    private final int VUELTA = 1;
    View view211;
    View view212;
    View view213;
    View view221;
    View view222;
    View view223;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors6);

        view211 = findViewById(R.id.view211);
        view212 = findViewById(R.id.view212);
        view213 = findViewById(R.id.view213);
        view221 = findViewById(R.id.view221);
        view222 = findViewById(R.id.view222);
        view223 = findViewById(R.id.view223);

        view211.setOnClickListener(onClickListener);
        view212.setOnClickListener(onClickListener);
        view213.setOnClickListener(onClickListener);
        view221.setOnClickListener(onClickListener);
        view222.setOnClickListener(onClickListener);
        view223.setOnClickListener(onClickListener);


    }

    View.OnClickListener onClickListener = v -> {

        Intent i = new Intent(this, Vuelta.class);

        v.getBackground();
        i.putExtra("color", ((ColorDrawable) v.getBackground()).getColor());
        i.putExtra("buttons", 2);
        startActivityForResult(i, VUELTA);

    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == VUELTA) {

            if (resultCode == RESULT_OK) {

                int button = data.getIntExtra("button", 1);

                if (button == 2) {

                    finish();

                }

            }

        }

    }

}


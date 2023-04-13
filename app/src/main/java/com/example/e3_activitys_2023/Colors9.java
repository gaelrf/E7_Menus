package com.example.e3_activitys_2023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Colors9 extends AppCompatActivity {

    private final int VUELTA = 1;
    View view311;
    View view312;
    View view313;
    View view321;
    View view322;
    View view323;
    View view331;
    View view332;
    View view333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors9);

        view311 = findViewById(R.id.view311);
        view312 = findViewById(R.id.view312);
        view313 = findViewById(R.id.view313);
        view321 = findViewById(R.id.view321);
        view322 = findViewById(R.id.view322);
        view323 = findViewById(R.id.view323);
        view331 = findViewById(R.id.view331);
        view332 = findViewById(R.id.view332);
        view333 = findViewById(R.id.view333);

        view311.setOnClickListener(onClickListener);
        view312.setOnClickListener(onClickListener);
        view313.setOnClickListener(onClickListener);
        view321.setOnClickListener(onClickListener);
        view322.setOnClickListener(onClickListener);
        view323.setOnClickListener(onClickListener);
        view331.setOnClickListener(onClickListener);
        view332.setOnClickListener(onClickListener);
        view333.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        Intent i = new Intent(this, Vuelta.class);

        v.getBackground();
        i.putExtra("color",((ColorDrawable)v.getBackground()).getColor());
        i.putExtra("buttons", 3);
        startActivityForResult(i, VUELTA);

    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==VUELTA){

            if (resultCode==RESULT_OK) {

                int button = data.getIntExtra("button", 1);

                if (button == 2) {

                    finish();

                } else if (button == 3) {

                    finishAffinity();

                }

            }

        }

    }

}
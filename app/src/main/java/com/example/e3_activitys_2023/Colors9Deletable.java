package com.example.e3_activitys_2023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Colors9Deletable extends AppCompatActivity {

    private final int GUSTA = 1;
    View view411;
    View view412;
    View view413;
    View view421;
    View view422;
    View view423;
    View view431;
    View view432;
    View view433;
    View evaluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors9_deletable);
        
        view411 = findViewById(R.id.view411);
        view412 = findViewById(R.id.view412);
        view413 = findViewById(R.id.view413);
        view421 = findViewById(R.id.view421);
        view422 = findViewById(R.id.view422);
        view423 = findViewById(R.id.view423);
        view431 = findViewById(R.id.view431);
        view432 = findViewById(R.id.view432);
        view433 = findViewById(R.id.view433);

        view411.setOnClickListener(onClickListener);
        view412.setOnClickListener(onClickListener);
        view413.setOnClickListener(onClickListener);
        view421.setOnClickListener(onClickListener);
        view422.setOnClickListener(onClickListener);
        view423.setOnClickListener(onClickListener);
        view431.setOnClickListener(onClickListener);
        view432.setOnClickListener(onClickListener);
        view433.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        evaluar = v;

        Intent i = new Intent(this, Gusta.class);

        v.getBackground();
        i.putExtra("color",((ColorDrawable)v.getBackground()).getColor());
        startActivityForResult(i, GUSTA);

    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode== GUSTA){

            if (resultCode==RESULT_OK) {

                int gusta = data.getIntExtra("gusta", 1);

                if (gusta == 1) {

                    evaluar.setVisibility(View.VISIBLE);

                } else if (gusta == 2) {

                    evaluar.setVisibility(View.INVISIBLE);

                }

            }else if (resultCode==RESULT_CANCELED){

                Toast.makeText(this, "No Contesta", Toast.LENGTH_SHORT).show();

            }

        }

    }

}
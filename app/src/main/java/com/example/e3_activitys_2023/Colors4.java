package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Colors4 extends AppCompatActivity {

    View view11;
    View view12;
    View view21;
    View view22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors4);

        view11 = findViewById(R.id.view11);
        view12 = findViewById(R.id.view12);
        view21 = findViewById(R.id.view21);
        view22 = findViewById(R.id.view22);

        view11.setOnClickListener(onClickListener);
        view12.setOnClickListener(onClickListener);
        view21.setOnClickListener(onClickListener);
        view22.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        Intent i = new Intent(this, Vuelta.class);

        switch (v.getId()){

            case R.id.view11:

                i.putExtra("color",R.color.black);
                startActivity(i);
                break;

            case R.id.view12:

                i.putExtra("color",R.color.teal_200);
                startActivity(i);
                break;

            case R.id.view21:


                i.putExtra("color",R.color.purple_700);
                startActivity(i);
                break;

            case R.id.view22:


                i.putExtra("color",R.color.purple_200);
                startActivity(i);
                break;

        }

    };

}
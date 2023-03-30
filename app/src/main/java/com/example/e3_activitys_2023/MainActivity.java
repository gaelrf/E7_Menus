package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPantalla1;
    Button btnPantalla2;
    Button btnPantalla3;
    Button btnPantalla4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPantalla1 = findViewById(R.id.btnPantalla1);
        btnPantalla2 = findViewById(R.id.btnPantalla2);
        btnPantalla3 = findViewById(R.id.btnPantalla3);
        btnPantalla4 = findViewById(R.id.btnPantalla4);

        btnPantalla1.setOnClickListener(onClickListener);
        btnPantalla2.setOnClickListener(onClickListener);
        btnPantalla3.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        Intent intent;

        switch (v.getId()){

            case R.id.btnPantalla1:

                intent = new Intent(MainActivity.this,Colors4.class);
                startActivity(intent);

                break;

            case R.id.btnPantalla2:

                intent = new Intent(MainActivity.this,Colors6.class);
                startActivity(intent);

                break;

            case R.id.btnPantalla3:

                intent = new Intent(MainActivity.this,Colors9.class);
                startActivity(intent);

                break;

        }

    };

}
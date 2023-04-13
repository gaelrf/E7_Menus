package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Vuelta extends AppCompatActivity {

    LinearLayout vuelta;
    Button btnAtras;
    Button btnInicio;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuelta);

        Intent intent = getIntent();
        int buttons = intent.getIntExtra("buttons",1);

        vuelta = findViewById(R.id.vuelta);
        btnAtras = findViewById(R.id.btnAtras);
        btnAtras.setOnClickListener(onClickListener);

        if(buttons==2){

            btnInicio = findViewById(R.id.btnInicio);
            btnInicio.setVisibility(View.VISIBLE);
            btnInicio.setOnClickListener(onClickListener);

        }else if (buttons==3){

            btnInicio = findViewById(R.id.btnInicio);
            btnInicio.setVisibility(View.VISIBLE);
            btnInicio.setOnClickListener(onClickListener);
            btnFinalizar = findViewById(R.id.btnFinalizar);
            btnFinalizar.setVisibility(View.VISIBLE);
            btnFinalizar.setOnClickListener(onClickListener);

        }

        vuelta.setBackgroundColor(intent.getIntExtra("color",-1));

    }

    View.OnClickListener onClickListener = v -> {

        Intent intent = new Intent();

        switch (v.getId()){

            case R.id.btnAtras:

                intent.putExtra("button",1);
                break;

            case R.id.btnInicio:

                intent.putExtra("button",2);
                break;
            case R.id.btnFinalizar:

                intent.putExtra("button",3);
                break;

        }

        setResult(RESULT_OK,intent);
        finish();

    };

}
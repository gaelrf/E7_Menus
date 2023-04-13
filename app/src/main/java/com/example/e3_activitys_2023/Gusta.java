package com.example.e3_activitys_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Gusta extends AppCompatActivity {

    View viewEvaluar;
    RadioGroup rgrGusta;
    Button btnEntendido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gusta);

        viewEvaluar = findViewById(R.id.viewEvaluar);
        rgrGusta = findViewById(R.id.rgrGusta);
        btnEntendido = findViewById(R.id.btnEntendido);

        btnEntendido.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = v -> {

        Intent intent = new Intent();

        switch (rgrGusta.getCheckedRadioButtonId()){

            case R.id.rbtSi:

                intent.putExtra("gusta",1);
                break;

            case R.id.rbtNo:

                intent.putExtra("gusta",2);
                break;

        }

        setResult(RESULT_OK,intent);
        finish();

    };

}
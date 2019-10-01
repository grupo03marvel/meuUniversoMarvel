package com.example.meuuniversomarvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnQuadrinhos;
    private Button btnPersonagens;
    private Button btnAutores;
    private Button btnSeries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();

        btnSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnQuadrinhos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnPersonagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnAutores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void initView(){
        btnAutores.findViewById(R.id.buttonAutores);
        btnPersonagens.findViewById(R.id.buttonPersonagens);
        btnQuadrinhos.findViewById(R.id.buttonQuadrinhos);
        btnSeries.findViewById(R.id.buttonSeries);

    }
}

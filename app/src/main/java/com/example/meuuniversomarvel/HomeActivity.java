package com.example.meuuniversomarvel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meuuniversomarvel.interfaces.RecyclerViewOnClick;

public class HomeActivity extends AppCompatActivity implements RecyclerViewOnClick {

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

    public void onClick(){
//        Intent intent = new Intent( HomeActivity.this, com.example.meuuniversomarvel.views.InfoContainer.class);
//        Bundle bundle = new Bundle();
//        bundle.putParcelable();
//        intent.putExtras(bundle);
//        startActivity(intent);
    }
}

package com.example.meuuniversomarvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Cadastro_Activity extends AppCompatActivity {
    Button btnRecuperar;
    TextInputLayout email;


    public static final String END_EMAIL_KEY = "email";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecuperar = findViewById(R.id.botaoRecuperar);
        email = findViewById(R.id.digitarEmail);



        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String endemail = email.getEditText().getText().toString();


                if (!endemail.isEmpty() ){
                    //Criando uma nova instancia do tipo Intent
                    Intent intent = new Intent(Cadastro_Activity.this,Recuperar_SenhaEmail.class);

                    //Criando uma nova instancia do bundle
                    Bundle bundle = new Bundle();

                    //Passando os dados para o bundle
                    bundle.putString(END_EMAIL_KEY,endemail);


                    intent.putExtras(bundle);
                    //Passo a intent para a startActivity
                    startActivity(intent);

                }
                else{

                    email.setError("Preencha o campo com seu endereço de email");


                }


            }
        });


    }
}

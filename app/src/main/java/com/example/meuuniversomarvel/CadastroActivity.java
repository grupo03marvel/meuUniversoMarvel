package com.example.meuuniversomarvel;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class CadastroActivity extends AppCompatActivity {

    private TextInputLayout Nomecad;
    private TextInputLayout SenhaCad;
    private TextInputLayout EmailCad;
    private TextInputLayout IdadeCad;
    private Button btnCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);



        Nomecad =findViewById(R.id.nomeUsuario);
        SenhaCad = findViewById(R.id.senhaCadastro);
        EmailCad = findViewById(R.id.EmailDoUsuario);
        IdadeCad = findViewById(R.id.IdadeDoUsuario);
        btnCad = findViewById(R.id.btnRegistroCadastro);

        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome= Nomecad.getEditText().getText().toString();
                String senha = SenhaCad.getEditText().getText().toString();
                String email = EmailCad.getEditText().getText().toString();
                int idade = Integer.parseInt(IdadeCad.getEditText().getText().toString());


                if(!nome.isEmpty() && idade!=0 && senha.isEmpty() && email.isEmpty()){

                    // Adicionar Activit de destino **********
                    Intent intent = new Intent(CadastroActivity.this, CadastroActivity.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("NOME", nome);
                    bundle.putString("SENHA", senha);
                    bundle.putString("EMAIL", email);
                    bundle.putInt("IDADE", idade);


                    intent.putExtras(bundle);
                    startActivity(intent);

                } else {
                    Nomecad.setError("O campo não pode estar vazio");
                    SenhaCad.setError("O campo não pode estar vazio");
                    EmailCad.setError("O campo não pode estar vazio");
                    IdadeCad.setError("O campo não pode estar vazio");
                }

            }
        });


    }
}

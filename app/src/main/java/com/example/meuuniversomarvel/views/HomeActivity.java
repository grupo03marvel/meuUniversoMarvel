package com.example.meuuniversomarvel.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.meuuniversomarvel.models.ModeloHome;
import com.example.meuuniversomarvel.R;
import com.example.meuuniversomarvel.interfaces.Comunicador;

public class HomeActivity extends AppCompatActivity implements Comunicador {
    private Comunicador comunicador;
    private FrameLayout container;
    public static final String MH_KEY = "modeloHome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        replaceFragment(R.id.container, new CategoriaFragment());
    }

    @Override
    public void receberMensagem(ModeloHome modeloHome) {
        setBundleToFragment(modeloHome, MH_KEY);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private void replaceFragment(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }

    private void setBundleToFragment(ModeloHome modeloHome, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE, modeloHome);
        Fragment outraCategoria = new CategoriaFragment();
        outraCategoria.setArguments(bundle);
        replaceFragment(R.id.container, outraCategoria);

    }
}

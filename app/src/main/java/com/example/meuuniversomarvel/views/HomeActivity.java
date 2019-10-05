package com.example.meuuniversomarvel.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.meuuniversomarvel.adapters.ItemAdapter;
import com.example.meuuniversomarvel.models.ItemHome;
import com.example.meuuniversomarvel.models.ModeloHome;
import com.example.meuuniversomarvel.R;
import com.example.meuuniversomarvel.interfaces.Comunicador;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements Comunicador {
    private Comunicador comunicador;
    private FrameLayout container;
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<ItemHome> listaItens = new ArrayList<>();
    public static final String MH_KEY = "modeloHome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ModeloHome modeloHome = new ModeloHome("Fragment", R.drawable.autores, popularLista());
        setBundleToFragment(modeloHome, MH_KEY);

        //replaceFragment(R.id.container, new CategoriaFragment());
    }


    public List<ItemHome> popularLista(){
        listaItens.add(new ItemHome(R.drawable.hq3, "Shrek"));
        listaItens.add(new ItemHome(R.drawable.hq3, "Nois"));
        listaItens.add(new ItemHome(R.drawable.hq3, "lalala"));

        return listaItens;
    }

    @Override
    public void receberMensagem(ModeloHome modeloHome) {
        setBundleToFragment(modeloHome, MH_KEY);
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

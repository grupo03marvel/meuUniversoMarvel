package com.example.meuuniversomarvel.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.meuuniversomarvel.R;
import com.example.meuuniversomarvel.views.InfoQuadrinhosFragment;

public class InfoContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_container);

//        replaceFragment(R.id.containerInfo, new InfoQuadrinhosFragment());
//        replaceFragment(R.id.containerInfo, new InfoPersonagensFragment());


    }

    private void replaceFragment(int container, Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}

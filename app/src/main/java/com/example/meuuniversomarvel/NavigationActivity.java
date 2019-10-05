package com.example.meuuniversomarvel;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class NavigationActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle bardrawer = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(bardrawer);

        bardrawer.syncState();




        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_quadrinhos, R.id.nav_personagens, R.id.nav_autores,
                R.id.nav_series, R.id.nav_favoritos, R.id.nav_login, R.id.nav_sobre, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();


                if(id == R.id.nav_quadrinhos){
                    //replaceFragment(new fragmento());
                    //ModelItemHome quadrinhos = new ModelItemHome("Quadrinhos", R.drawable.quadrinhos,popularLista());
                }

                if(id == R.id.nav_personagens){


                }

                if(id == R.id.nav_autores){

                }

                if(id == R.id.nav_series){

                }

                if(id == R.id.nav_favoritos){

                }

                if(id == R.id.nav_login){

                }

                if(id == R.id.nav_sobre){

                }

                if(id == R.id.nav_logout){

                }



                

                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }


    public void replaceFragment(Fragment fragmento){
        getSupportFragmentManager()
        .beginTransaction()
                .replace(R.id.container, fragmento)
                .commit();
    }

}

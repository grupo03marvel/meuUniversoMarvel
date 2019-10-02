package com.example.meuuniversomarvel.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.meuuniversomarvel.models.ModeloHome;
import com.example.meuuniversomarvel.R;

import static com.example.meuuniversomarvel.views.HomeActivity.MH_KEY;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriaFragment extends Fragment {
    private ImageView imagemCategoria;
    private RecyclerView recyclerItensCat;

    public CategoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categoria, container, false);
        initViews(view);
        //remover commit quando arrumar o modelo, ainda falta fazer alguns ajustes na classe modelo também
//        if(!getArguments().isEmpty()){
//            ModeloHome modeloHome = getArguments().getParcelable(MH_KEY);
//
//            if(modeloHome != null){
//
//                Drawable drawable = getResources().getDrawable(modeloHome.getImagemCategoria());
//
//                imagemCategoria.setImageDrawable(drawable);
//
//                //dúvida
//                //recyclerItensCat.setRecycledViewPool();
//
//            }
//
//        }



        return view;
    }

    public void initViews(View view){
        imagemCategoria = view.findViewById(R.id.imagemCategoria);
        recyclerItensCat = view.findViewById(R.id.recyclerItensCat);
    }
}

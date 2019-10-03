package com.example.meuuniversomarvel.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.meuuniversomarvel.models.ItemHome;
import com.example.meuuniversomarvel.models.ModeloHome;
import com.example.meuuniversomarvel.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.meuuniversomarvel.views.HomeActivity.MH_KEY;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriaFragment extends Fragment {
    private String nomePagina;
    private ImageView imagemCategoria;
    //private List<ItemHome> listaItensHome;

    public CategoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categoria, container, false);
        initViews(view);
//        if(!getArguments().isEmpty()){
//            ModeloHome modeloHome = getArguments().getParcelable(MH_KEY);
//
//            if(modeloHome != null){
//
//                Drawable drawable = getResources().getDrawable(modeloHome.getImagemCategoria());
//
//                imagemCategoria.setImageDrawable(drawable);
//
//
//
//
//            }
//
//        }



        return view;
    }

    public void initViews(View view){
        //nomePagina como não é um item do XML precisa ser declarado?
        imagemCategoria = view.findViewById(R.id.imagemCategoria);
        // = view.findViewById(R.id.recyclerItensCat);
    }
}

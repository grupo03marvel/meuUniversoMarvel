package com.example.meuuniversomarvel.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.meuuniversomarvel.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoPersonagensFragment extends Fragment {

    private ImageView imagemBannerPers;
    private ImageView imagemPersonagem;
    private TextView txtInfoDetalhe;
    private TextView txtTitulo;


    public InfoPersonagensFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_info_quadrinhos, container, false);

        Fragment fragment = new Fragment();

        initViews(view);

        return view;
    }



    private void initViews(View view) {
        imagemBannerPers = view.findViewById(R.id.imagemBanner);
        imagemPersonagem = view.findViewById(R.id.imageQuadrinho);
        txtInfoDetalhe = view.findViewById(R.id.textViewDetalhe1);
        txtTitulo = view.findViewById(R.id.textViewDetalhe);
    }

}

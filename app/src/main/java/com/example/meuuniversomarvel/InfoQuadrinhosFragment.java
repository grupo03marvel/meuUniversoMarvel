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
public class InfoQuadrinhosFragment extends Fragment {


    private ImageView imagemBanner;
    private ImageView imagemQuadrinho;
    private TextView txtInfoDetalhe1;
    private TextView txtInfoDetalhe2;
    private TextView txtTitulo;


    public InfoQuadrinhosFragment() {
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
        imagemBanner = view.findViewById(R.id.imagemBanner);
        imagemQuadrinho = view.findViewById(R.id.imageQuadrinho);
        txtInfoDetalhe1 = view.findViewById(R.id.textViewDetalhe1);
        txtInfoDetalhe2 = view.findViewById(R.id.textViewDetalhe);
        txtTitulo = view.findViewById(R.id.textViewTitulo);
    }


}

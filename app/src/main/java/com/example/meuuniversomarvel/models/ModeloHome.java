package com.example.meuuniversomarvel.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.recyclerview.widget.RecyclerView;

public class ModeloHome implements Parcelable {
    private String nomePagina;
    private int imagemCategoria;
    private RecyclerView categorias;

    //construtor

    public ModeloHome(int imagemCategoria, RecyclerView categorias) {
        this.imagemCategoria = imagemCategoria;
        this.categorias = categorias;
    }

    public ModeloHome() {
    }

    //getters and setters

    public int getImagemCategoria() {
        return imagemCategoria;
    }

    public void setImagemCategoria(int imagemCategoria) {
        this.imagemCategoria = imagemCategoria;
    }

    public RecyclerView getCategorias() {
        return categorias;
    }

    public void setCategorias(RecyclerView categorias) {
        this.categorias = categorias;
    }

    public String getNomePagina() {
        return nomePagina;
    }

    public void setNomePagina(String nomePagina) {
        this.nomePagina = nomePagina;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagemCategoria);
        dest.writeString(nomePagina);
    }
}

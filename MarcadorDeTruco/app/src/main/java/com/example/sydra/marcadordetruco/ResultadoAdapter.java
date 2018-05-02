package com.example.sydra.marcadordetruco;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ResultadoAdapter extends RecyclerView.Adapter{


    private ArrayList<Resultado> listaResultados;

    public ResultadoAdapter(ArrayList<Resultado> listaInicial){

        this.listaResultados = listaInicial;
    }

    public void setNovaLista(ArrayList<Resultado> listaInicial){
        this.listaResultados = listaInicial;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RV", "Gaveta Criada");
        View elementoPrincipalXml = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resultado, parent, false);
        ResultadoHolder gaveta = new ResultadoHolder(elementoPrincipalXml);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d("RV", "Gaveta Atualizada "+position);
        ResultadoHolder gaveta = (ResultadoHolder) holder;
        Resultado daVez = this.listaResultados.get(position);
        gaveta.apresentaOResultado( daVez );
    }

    @Override
    public int getItemCount() {
        return this.listaResultados.size();
    }
}

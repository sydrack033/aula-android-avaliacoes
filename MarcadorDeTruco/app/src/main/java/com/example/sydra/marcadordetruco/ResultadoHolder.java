package com.example.sydra.marcadordetruco;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ResultadoHolder extends RecyclerView.ViewHolder{

    private TextView tvNome_equipe1;
    private TextView tvNome_equipe2;
    private TextView tvPontos_equipe1;
    private TextView tvPontos_equipe2;


    public ResultadoHolder(View itemView) {
        super(itemView);

        tvNome_equipe1 = itemView.findViewById(R.id.tvNome_equipe1);
        tvNome_equipe2 = itemView.findViewById(R.id.tvNome_equipe2);
        tvPontos_equipe1 = itemView.findViewById(R.id.tvPontos_equipe1);
        tvPontos_equipe2 = itemView.findViewById(R.id.tvPontos_equipe2);

    }

    public void apresentaOResultado(Resultado daVez){
        tvNome_equipe1.setText(daVez.getNome_equipe1());
        tvNome_equipe2.setText(daVez.getNome_equipe2());
        tvPontos_equipe1.setText(String.valueOf(daVez.getPontos_equipe1()));
        tvPontos_equipe2.setText(String.valueOf(daVez.getPontos_equipe2()));
    }
}

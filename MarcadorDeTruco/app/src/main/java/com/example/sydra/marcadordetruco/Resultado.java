package com.example.sydra.marcadordetruco;

public class Resultado {
    private String nome_equipe1;
    private String nome_equipe2;
    private int pontos_equipe1;
    private int pontos_equipe2;

    public Resultado(String nome_equipe1, String nome_equipe2, int pontos_equipe1, int pontos_equipe2){
        this.nome_equipe1 = nome_equipe1;
        this.nome_equipe2 = nome_equipe2;
        this.pontos_equipe1 = pontos_equipe1;
        this.pontos_equipe2 = pontos_equipe2;
    }

    public void setNome_equipe1(String nome_equipe1) {
        this.nome_equipe1 = nome_equipe1;
    }

    public void setNome_equipe2(String nome_equipe2) {
        this.nome_equipe2 = nome_equipe2;
    }

    public void setPontos_equipe1(int pontos_equipe1) {
        this.pontos_equipe1 = pontos_equipe1;
    }

    public void setPontos_equipe2(int pontos_equipe2) {
        this.pontos_equipe2 = pontos_equipe2;
    }

    public String getNome_equipe1() {

        return nome_equipe1;
    }

    public String getNome_equipe2() {
        return nome_equipe2;
    }

    public int getPontos_equipe1() {
        return pontos_equipe1;
    }

    public int getPontos_equipe2() {
        return pontos_equipe2;
    }
}

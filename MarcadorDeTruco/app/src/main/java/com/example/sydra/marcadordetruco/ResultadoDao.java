package com.example.sydra.marcadordetruco;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ResultadoDao {
    private static final String FILE_NAME = "resultados.txt";

    private static ArrayList<Resultado> bd = new ArrayList<>();

    public static ArrayList<Resultado> getLista(Context c){
        bd = new ArrayList<>();
        FileInputStream inputStream;
        try {
            inputStream = c.openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            String[] lineSep;
            while ((line = bufferedReader.readLine()) != null) {
                lineSep = line.split(";");
                bd.add(new Resultado(lineSep[0], lineSep[1], Integer.parseInt(lineSep[2]), Integer.parseInt(lineSep[3])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bd;
    }

    public static void salvar(Context c, Resultado r){
        bd.add(r);
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(FILE_NAME, Context.MODE_APPEND);
            String line = r.getNome_equipe1() + ";" + r.getNome_equipe2() + ";" + r.getPontos_equipe1() + ";" + r.getPontos_equipe2();
            outputStream.write( (line + System.getProperty("line.separator")).getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void inicializaLista(){
        bd = new ArrayList<>();
        for(int i = 0; i < 1; i++) {
            bd.add(new Resultado("nos", "Eles", 11, 9));
        }
    }
}

package com.example.sydra.marcadordetruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PlacarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);
    }

    public void onClickPontos(View view) {
        EditText etNome_equipe1 = findViewById(R.id.etNome_equipe1);
        EditText etNome_equipe2 = findViewById(R.id.etNome_equipe2);
        RadioGroup rgEquipe1 = findViewById(R.id.rgEquipe1);
        RadioGroup rgEquipe2 = findViewById(R.id.rgEquipe2);
        RadioButton rbPontos_equipe1 = findViewById(rgEquipe1.getCheckedRadioButtonId());
        RadioButton rbPontos_equipe2 = findViewById(rgEquipe2.getCheckedRadioButtonId());


        Resultado resultado = new Resultado(
                etNome_equipe1.getText().toString(),
                etNome_equipe2.getText().toString(),
                Integer.parseInt(rbPontos_equipe1.getText().toString()),
                Integer.parseInt(rbPontos_equipe2.getText().toString())
        );

        ResultadoDao.salvar(this, resultado);

        //setResult(Activity.RESULT_OK);
        //finish();
    }
}

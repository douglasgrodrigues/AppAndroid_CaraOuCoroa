package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar os dados passados
        Bundle dadosRecebidos = getIntent().getExtras();
        int numero = dadosRecebidos.getInt("numero");

        if ( numero == 0 ){  //cara
            imageResultado.setImageResource( R.drawable.moeda_cara );
        }else{ //coroa
            imageResultado.setImageResource( R.drawable.moeda_coroa );
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();         //Desempilha a activity atual

            }
        });

    }
}

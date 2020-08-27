package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);
        buttonJogar.setOnClickListener(new View.OnClickListener() { //Cria o evento dentro do oncreate
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class); //chama a nota activity

                //gerar numero random e passar para a outra tela
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);         //passa os valores para a nota activity

                startActivity( intent);  //Efetiva a ação

            }
        });


    }



}

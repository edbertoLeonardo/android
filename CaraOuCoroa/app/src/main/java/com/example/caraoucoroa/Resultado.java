package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Resultado extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton imageViewVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        imageViewVoltar = findViewById(R.id.imageButtonView);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0 ){//cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else {//coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }


    }
}
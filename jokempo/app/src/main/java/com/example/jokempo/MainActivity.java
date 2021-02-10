package com.example.jokempo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ConstraintLayout constraintLayout;

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");

    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");

    }

    public void selecionadoLagarto(View view){
        this.opcaoSelecionada("lagarto");

    }

    public void selecionadoSpock(View view){
        this.opcaoSelecionada("spock");

    }
    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textresultado);


            int numero = new Random().nextInt(5);
            String[] opcoes = {"pedra", "tesoura", "papel", "lagarto", "spock"};
            String opcaoDoApp = opcoes[ numero ];

            switch (opcaoDoApp){
                case "pedra" : imageResultado.setImageResource(R.drawable.pedra);
                    break;
                case "papel" : imageResultado.setImageResource(R.drawable.papel);
                    break;
                case "tesoura" : imageResultado.setImageResource(R.drawable.tesoura);
                    break;
                case "lagarto" : imageResultado.setImageResource(R.drawable.lagarto);
                    break;
                case "spock" : imageResultado.setImageResource(R.drawable.spock);
                    break;

            }

            if (
                    (opcaoDoApp == "tesoura" && opcaoSelecionada == "papel") ||
                    (opcaoDoApp == "tesoura" && opcaoSelecionada == "lagarto") ||
                    (opcaoDoApp == "papel" && opcaoSelecionada == "pedra") ||
                    (opcaoDoApp == "papel" && opcaoSelecionada == "spock") ||
                    (opcaoDoApp == "pedra" && opcaoSelecionada == "tesoura") ||
                    (opcaoDoApp == "pedra" && opcaoSelecionada == "lagarto") ||
                    (opcaoDoApp == "spock" && opcaoSelecionada == "pedra") ||
                    (opcaoDoApp == "spock" && opcaoSelecionada == "tesoura") ||
                    (opcaoDoApp == "lagarto" && opcaoSelecionada == "spock") ||
                    (opcaoDoApp == "lagarto" && opcaoSelecionada == "papel")
            ){
                textoResultado.setText("Você Perdeu :(");
                constraintLayout = findViewById(R.id.corDeFundo);
               constraintLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));


            }else if (
                            (opcaoSelecionada == "tesoura" && opcaoDoApp == "papel") ||
                            (opcaoSelecionada == "tesoura" && opcaoDoApp == "lagarto") ||
                            (opcaoSelecionada == "papel" && opcaoDoApp == "pedra") ||
                            (opcaoSelecionada == "papel" && opcaoDoApp == "spock") ||
                            (opcaoSelecionada == "pedra" && opcaoDoApp == "tesoura") ||
                            (opcaoSelecionada == "pedra" && opcaoDoApp == "lagarto") ||
                            (opcaoSelecionada == "spock" && opcaoDoApp == "pedra") ||
                            (opcaoSelecionada == "spock" && opcaoDoApp == "tesoura") ||
                            (opcaoSelecionada == "lagarto" && opcaoDoApp == "spock") ||
                            (opcaoSelecionada == "lagarto" && opcaoDoApp == "papel")

            ){
                textoResultado.setText("Você Ganhou :)");
                constraintLayout = findViewById(R.id.corDeFundo);
                constraintLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));

            }else{
                textoResultado.setText("Empate :/");
                constraintLayout = findViewById(R.id.corDeFundo);
                constraintLayout.setBackgroundColor(getResources().getColor(android.R.color.background_light));
            }

    }

}
package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

   public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textReusltado);
    }

    public void calcularPreco(View view){

        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if (camposValidados){

            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);
            Double resultado = valorAlcool/valorGasolina;

            if (resultado >= 0.7){
                textResultado.setText("Melhor usar gasolina");
            }else {
                textResultado.setText("Melhor usar álcool");
            }


        }else {
            textResultado.setText("Preencha os campos primeiro");
        }
    }

    public Boolean validarCampos(String precoAlcool, String precoGasolina){

        Boolean camposValidados = true;
        String campo = "peenchido";

        if (precoAlcool.equals("")){
            camposValidados = false;
            campo = "alcool";
        }else if (precoGasolina.equals("")){
            camposValidados = false;
            campo = "gasolina";
        }

        return camposValidados;
    }
}
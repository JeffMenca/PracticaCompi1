package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.example.practica1.objetos.Forma;
import com.example.practica1.analizador.Parser;
import com.example.practica1.objetos.lexico;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editEntrada;
    private EditText errorEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Boton de compilar */
    public void compilar(View view) {

        //recibiendo los componentes del activity main
        editEntrada = findViewById(R.id.multiTextAccion);
        errorEntrada = findViewById(R.id.editTextError);
        String entrada = editEntrada.getText().toString();
        StringReader reader = new StringReader(entrada);
        errorEntrada.getText().clear();
        // ArrayList de formas
        ArrayList<Forma> formas = new ArrayList<Forma>();
        ArrayList<String> errores = new ArrayList<String>();
        lexico lexico = new lexico(reader);
        Parser parser = new Parser(lexico);
        //Intenta enviar formas encontradas al siguiente Activity
        try {
            parser.parse();
            formas = parser.getFormasList();
            errores = parser.getErrorsList();
            for (String erroresEncontrados : errores) {
                errorEntrada.setText(errorEntrada.getText() + erroresEncontrados);
            }
            Intent intent = new Intent(this, FormasGeneradas.class);
            //Crea bundle con array serializable
            Bundle args = new Bundle();
            args.putSerializable("formasEncontradas", formas);
            intent.putExtra("Bundle", args);
            startActivity(intent);
        } catch (Exception ex) {
            errores = parser.getErrorsList();
            for (String erroresEncontrados : errores) {
                errorEntrada.setText(errorEntrada.getText() + erroresEncontrados+ "\n");
            }
        }

    }


}
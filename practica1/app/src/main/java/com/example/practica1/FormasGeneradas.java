package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.practica1.analizador.Forma;
import com.example.practica1.analizador.Linea;

import java.util.ArrayList;

public class FormasGeneradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_generadas);

        // Metodo para recibir mensajes

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        ArrayList<Forma> formas=(ArrayList<Forma>) args.getSerializable("formasEncontradas");
        TextView textView = findViewById(R.id.resultadoText);
        for (Forma formaElegida : formas) {
            textView.setText(formaElegida.getTipo() + " " + formaElegida.getColor());
        }
    }
}
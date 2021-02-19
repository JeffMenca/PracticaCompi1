package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.practica1.UI.Draw;
import com.example.practica1.objetos.Forma;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class FormasGeneradas extends AppCompatActivity {
    //Array de formas
    ArrayList<Forma> formas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_generadas);
        try {
            recibirFormas();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //Se agregan las formas pintadas en el Layout
        ConstraintLayout layout1 = findViewById(R.id.resultLayout);
        Draw fondo = new Draw(this, formas);
        layout1.addView(fondo);
    }

    //Metodo para recibir las formas del Activity anterior
    private void recibirFormas() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        formas = (ArrayList<Forma>) args.getSerializable("formasEncontradas");

    }
}
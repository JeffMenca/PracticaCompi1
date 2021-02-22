package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.practica1.UI.Draw;
import com.example.practica1.objetos.*;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class FormasGeneradas extends AppCompatActivity {
    ArrayList<OperadorFinded> reporteOperadores = new ArrayList<OperadorFinded>();
    ArrayList<ColorFinded> reporteColores = new ArrayList<ColorFinded>();
    ArrayList<ObjetoFinded> reporteObjetos = new ArrayList<ObjetoFinded>();
    //Array de formas
    ArrayList<Forma> formas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_generadas);
        try {
            recibirFormas();
            recibirOperadores();
            recibirColores();
            recibirObjetos();
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
    //Metodo para recibir los operadores del Activity anterior
    private void recibirOperadores() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        reporteOperadores = (ArrayList<OperadorFinded>) args.getSerializable("operadoresEncontrados");
    }
    //Metodo para recibir los colores del Activity anterior
    private void recibirColores() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        reporteColores = (ArrayList<ColorFinded>) args.getSerializable("coloresEncontrados");
    }
    //Metodo para recibir los objetos del Activity anterior
    private void recibirObjetos() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        reporteObjetos = (ArrayList<ObjetoFinded>) args.getSerializable("objetosEncontrados");
    }

    /* Boton de ver Reporte de formas */
    public void verReporteOperadores(View view) {
        //Intenta enviar formas encontradas al siguiente Activity
        try {
            if (reporteOperadores.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("operadoresEncontrados", reporteOperadores);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }
        } catch (Exception ex) {

        }
    }

    /* Boton de ver Reporte de colores */
    public void verReporteColores(View view) {
        //Intenta enviar formas encontradas al siguiente Activity
        try {
            if (reporteColores.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("coloresEncontrados", reporteColores);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }
        } catch (Exception ex) {
        }
    }

    /* Boton de ver Reporte de objetos */
    public void verReporteObjetos(View view) {
        //Intenta enviar objetos encontradas al siguiente Activity
        try {
            if (reporteObjetos.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("objetosEncontrados", reporteObjetos);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }
        } catch (Exception ex) {
        }
    }
}
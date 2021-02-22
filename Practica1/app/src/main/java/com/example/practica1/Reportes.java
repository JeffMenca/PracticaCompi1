package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.practica1.UI.Draw;
import com.example.practica1.objetos.*;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Reportes extends AppCompatActivity {
    ArrayList<ErrorFinded> reporteErrores = new ArrayList<ErrorFinded>();
    ArrayList<OperadorFinded> reporteOperadores = new ArrayList<OperadorFinded>();
    ArrayList<ColorFinded> reporteColores = new ArrayList<ColorFinded>();
    ArrayList<ObjetoFinded> reporteObjetos = new ArrayList<ObjetoFinded>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        try {
            recibirErrores();
            recibirOperadores();
            recibirColores();
            recibirObjetos();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        if(reporteErrores!=null){
            tablaErrores();
        }
        else if(reporteOperadores!=null){
            tablaOperadores();
        }
        else if(reporteColores!=null){
            tablaColores();
        }
        else if(reporteObjetos!=null){
            tablaObjetos();
        }


    }

    //Metodo para recibir los errores del Activity anterior
    private void recibirErrores() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        reporteErrores = (ArrayList<ErrorFinded>) args.getSerializable("erroresEncontrados");
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

    private void tablaErrores(){
        TableLayout tabla=findViewById(R.id.tablaErrores);
        for (ErrorFinded erroresEncontrados : reporteErrores) {
            TextView lexema = new TextView(this);
            TextView fila = new TextView(this);
            TextView columna = new TextView(this);
            TextView tipo = new TextView(this);
            TextView descripcion = new TextView(this);

            lexema.setPadding(30, 30, 30, 30);
            fila.setPadding(30, 30, 30, 30);
            columna.setPadding(30, 30, 30, 30);
            tipo.setPadding(30, 30, 30, 30);
            descripcion.setPadding(30, 30, 30, 30);

            TableRow row = new TableRow(this);
            lexema.setText(erroresEncontrados.getLexema());
            fila.setText(String.valueOf(erroresEncontrados.getLinea()));
            columna.setText(String.valueOf(erroresEncontrados.getColumna()));
            tipo.setText(erroresEncontrados.getTipo());
            descripcion.setText(erroresEncontrados.getDescripcion());

            row.addView(lexema);
            row.addView(fila);
            row.addView(columna);
            row.addView(tipo);
            row.addView(descripcion);
            tabla.addView(row);
        }
    }

    private void tablaOperadores(){
        TextView descripcion= findViewById(R.id.textView8);
        descripcion.setText("");
        TableLayout tabla=findViewById(R.id.tablaErrores);
        for (OperadorFinded operadoresEncontrados : reporteOperadores) {

            TextView operador = new TextView(this);
            TextView fila = new TextView(this);
            TextView columna = new TextView(this);
            TextView ocurrencia = new TextView(this);

            operador.setPadding(30, 30, 30, 30);
            fila.setPadding(30, 30, 30, 30);
            columna.setPadding(30, 30, 30, 30);
            ocurrencia.setPadding(30, 30, 30, 30);

            TableRow row = new TableRow(this);
            operador.setText(operadoresEncontrados.getOperador());
            fila.setText(String.valueOf(operadoresEncontrados.getLinea()));
            columna.setText(String.valueOf(operadoresEncontrados.getColumna()));
            ocurrencia.setText(operadoresEncontrados.getOcurrencia());



            row.addView(operador);
            row.addView(fila);
            row.addView(columna);
            row.addView(ocurrencia);
            tabla.addView(row);
        }
    }

    private void tablaColores(){
        TextView descripcion= findViewById(R.id.textView8);
        TextView descripcion1= findViewById(R.id.textView9);
        TextView descripcion2= findViewById(R.id.textView10);
        descripcion.setText("");
        descripcion1.setText("");
        descripcion2.setText("");
        TableLayout tabla=findViewById(R.id.tablaErrores);
        for (ColorFinded coloresEncontrados : reporteColores) {

            TextView color = new TextView(this);
            TextView veces = new TextView(this);

            color.setPadding(30, 30, 30, 30);
            veces.setPadding(30, 30, 30, 30);

            TableRow row = new TableRow(this);
            color.setText(coloresEncontrados.getColor());
            veces.setText(String.valueOf(coloresEncontrados.getCantidad()));

            row.addView(color);
            row.addView(veces);
            tabla.addView(row);
        }
    }

    private void tablaObjetos(){
        TextView descripcion= findViewById(R.id.textView8);
        TextView descripcion1= findViewById(R.id.textView9);
        TextView descripcion2= findViewById(R.id.textView10);
        descripcion.setText("");
        descripcion1.setText("");
        descripcion2.setText("");
        TableLayout tabla=findViewById(R.id.tablaErrores);
        for (ObjetoFinded objetosEncontrados : reporteObjetos) {

            TextView objeto = new TextView(this);
            TextView veces = new TextView(this);

            objeto.setPadding(30, 30, 30, 30);
            veces.setPadding(30, 30, 30, 30);

            TableRow row = new TableRow(this);
            objeto.setText(objetosEncontrados.getObjeto());
            veces.setText(String.valueOf(objetosEncontrados.getCantidad()));

            row.addView(objeto);
            row.addView(veces);
            tabla.addView(row);
        }
    }
}
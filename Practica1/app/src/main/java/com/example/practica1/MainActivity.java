package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.example.practica1.objetos.*;
import com.example.practica1.objetos.Forma;
import com.example.practica1.analizador.*;

import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editEntrada;
    private EditText errorEntrada;
    private ArrayList<ErrorFinded> reporteErrores = new ArrayList<ErrorFinded>();
    private ArrayList<OperadorFinded> reporteOperadores = new ArrayList<OperadorFinded>();
    private ArrayList<ColorFinded> reporteColores = new ArrayList<ColorFinded>();
    private ArrayList<ObjetoFinded> reporteObjetos = new ArrayList<ObjetoFinded>();

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
            //Formas
            formas = parser.getFormasList();
            //Errores
            errores = parser.getErrorsList();
            reporteErrores=new ArrayList<ErrorFinded>();
            reporteErrores.addAll(parser.getReporteErrorsList());
            reporteErrores.addAll(lexico.getReporteErrorsList());
            //Operadores
            reporteOperadores=parser.getOperadoresList();
            //Colores
            reporteColores=parser.getColoresList();
            //Objetos
            reporteObjetos=parser.getObjetosList();

            for (String erroresEncontrados : errores) {
                errorEntrada.setText(errorEntrada.getText() + erroresEncontrados);
            }
            if (formas.size()!=0) {
                Intent intent = new Intent(this, FormasGeneradas.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("formasEncontradas", formas);
                if (reporteOperadores.size()!=0) {
                    args.putSerializable("operadoresEncontrados", reporteOperadores);
                }
                if (reporteColores.size()!=0) {
                    args.putSerializable("coloresEncontrados", reporteColores);
                }
                if (reporteObjetos.size()!=0) {
                    args.putSerializable("objetosEncontrados", reporteObjetos);
                }
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }

        } catch (Exception ex) {
            errores = parser.getErrorsList();
            for (String erroresEncontrados : errores) {
                errorEntrada.setText(errorEntrada.getText() + erroresEncontrados + "\n");
            }
        }

    }

    /* Boton de verReporte */
    public void verReporte(View view) {

        //Intenta enviar formas encontradas al siguiente Activity
        try {
            if (reporteErrores.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("erroresEncontrados", reporteErrores);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }

        } catch (Exception ex) {

        }

    }


}
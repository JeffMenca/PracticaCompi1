package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.example.practica1.analizador.Forma;
import com.example.practica1.analizador.Parser;
import com.example.practica1.analizador.Poligono;
import com.example.practica1.analizador.lexico;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.practica1.OBJECTS";
    private EditText editEntrada;
    private EditText errorEntrada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Boton de compilar */
    public void compilar(View view) {

        //recibiendo los componentes del activity main
        editEntrada = findViewById(R.id.multiTextAccion);
        errorEntrada = findViewById(R.id.editTextError);
        String entrada = editEntrada.getText().toString();
        StringReader reader = new StringReader(entrada);
        // ArrayList de formas
        ArrayList<Forma> formas=new ArrayList<Forma>();
        lexico lexico = new lexico(reader);
        Parser parser = new Parser(lexico);

        try {
            parser.parse();
            formas = parser.getFormasList();
            Intent intent = new Intent(this, FormasGeneradas.class);
            Bundle args = new Bundle();
            args.putSerializable("formasEncontradas",(Serializable) formas);
            intent.putExtra("Bundle",args);
            startActivity(intent);
        } catch (Exception ex) {
            errorEntrada.setText("Error irrecuperable " + ex);
        }


    }
}
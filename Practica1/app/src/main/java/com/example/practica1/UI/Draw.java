//Packages
package com.example.practica1.UI;
//Imports
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.example.practica1.objetos.Circulo;
import com.example.practica1.objetos.Cuadrado;
import com.example.practica1.objetos.Forma;
import com.example.practica1.objetos.Linea;
import com.example.practica1.objetos.Poligono;
import com.example.practica1.objetos.Rectangulo;

import java.util.ArrayList;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Draw extends View {
    private final ArrayList<Forma> formas;
    //Constructor
    public Draw(Context context, ArrayList<Forma> formas) {
        super(context);
        this.formas = formas;
    }

    /*Nuevo metodo onDraw*/
    protected void onDraw(Canvas canvas) {

        Paint pincel = new Paint();
        /*Seleccion de forma por pintar*/
        for (Forma formaElegida : formas) {

            /*LINEA*/
            if (formaElegida.getTipo().equals("linea")) {
                pincel = asignarColor(formaElegida.getColor());
                Linea nuevaLinea = (Linea) formaElegida;
                canvas.drawLine(nuevaLinea.posx(), nuevaLinea.posy(), nuevaLinea.getPosx2(), nuevaLinea.getPosy2(), pincel);

                /*CIRCULO*/
            } else if (formaElegida.getTipo().equals("circulo")) {
                pincel = asignarColor(formaElegida.getColor());
                Circulo nuevoCirculo = (Circulo) formaElegida;
                canvas.drawCircle(nuevoCirculo.posx(), nuevoCirculo.posy(), nuevoCirculo.getRadio(), pincel);

                /*CUADRADO*/
            } else if (formaElegida.getTipo().equals("cuadrado")) {
                pincel = asignarColor(formaElegida.getColor());
                Cuadrado nuevoCuadrado = (Cuadrado) formaElegida;
                Path path = new Path();
                path.moveTo(nuevoCuadrado.posx(), nuevoCuadrado.posy());
                path.lineTo(nuevoCuadrado.posx() + nuevoCuadrado.getTamanioLado(), nuevoCuadrado.posy());
                path.lineTo(nuevoCuadrado.posx() + nuevoCuadrado.getTamanioLado(), nuevoCuadrado.posy() + nuevoCuadrado.getTamanioLado());
                path.lineTo(nuevoCuadrado.posx(), nuevoCuadrado.posy() + nuevoCuadrado.getTamanioLado());
                canvas.drawPath(path, pincel);

                /*RECTANGULO*/
            } else if (formaElegida.getTipo().equals("rectangulo")) {
                pincel = asignarColor(formaElegida.getColor());
                Rectangulo nuevoRectangulo = (Rectangulo) formaElegida;
                Path path = new Path();
                path.moveTo(nuevoRectangulo.posx(), nuevoRectangulo.posy());
                path.lineTo(nuevoRectangulo.posx() + nuevoRectangulo.getAncho(), nuevoRectangulo.posy());
                path.lineTo(nuevoRectangulo.posx() + nuevoRectangulo.getAncho(), nuevoRectangulo.posy() + nuevoRectangulo.getAlto());
                path.lineTo(nuevoRectangulo.posx(), nuevoRectangulo.posy() + nuevoRectangulo.getAlto());
                canvas.drawPath(path, pincel);

                /*POLIGONO*/
            } else if (formaElegida.getTipo().equals("poligono")) {
                pincel = asignarColor(formaElegida.getColor());
                Poligono nuevoPoligono = (Poligono) formaElegida;
                float radius = 500f;
                Path path = new Path();
                for (int i = 0; i <= nuevoPoligono.cantidadLados(); i++) {
                    if (i == 0) {
                        path.moveTo(nuevoPoligono.posx(), nuevoPoligono.posy());
                    } else {
                        path.lineTo(nuevoPoligono.posx() + (float) (nuevoPoligono.ancho() * cos(360 / nuevoPoligono.cantidadLados() * i)), nuevoPoligono.posy() + (float) (nuevoPoligono.alto() * sin(360 / nuevoPoligono.cantidadLados() * i)));
                    }
                }
                //path.close();
                canvas.drawPath(path, pincel);
            }
        }
    }

    /*Metodo para cambiar los colores*/
    private Paint asignarColor(String color) {
        Paint pincel = new Paint();
        pincel.setStrokeWidth(15);
        pincel.setStyle(Paint.Style.FILL);
        pincel.setColor(Color.BLACK);
        if (color.equals("azul")) pincel.setColor(Color.BLUE);
        if (color.equals("rojo")) pincel.setColor(Color.RED);
        if (color.equals("verde")) pincel.setColor(Color.GREEN);
        if (color.equals("amarillo")) pincel.setARGB(255, 248, 243, 53);
        if (color.equals("naranja")) pincel.setARGB(255, 239, 127, 26);
        if (color.equals("morado")) pincel.setARGB(255, 125, 33, 129);
        if (color.equals("cafe")) pincel.setARGB(255, 75, 54, 33);
        if (color.equals("negro")) pincel.setColor(Color.BLACK);
        return pincel;
    }


}

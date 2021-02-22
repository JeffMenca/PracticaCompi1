//Packages
package com.example.practica1.objetos;

import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class ColorFinded implements Serializable {
    //Atributos
    private String color;
    private int cantidad;

    //Constructor
    public ColorFinded(String color,int cantidad) {
        this.color=color;
        this.cantidad=cantidad;
    }

    //Metodos
    public String getColor() {
        return color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

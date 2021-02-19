//Metodos
package com.example.practica1.objetos;

public class Rectangulo extends Forma {
    //Atributos
    private int alto;
    private int ancho;
    //Constructor
    public Rectangulo(String tipo,int posx, int posy, String color,int alto,int ancho) {
        super(tipo,posx,posy,color);
        this.alto=alto;
        this.ancho=ancho;
    }
    //Metodos
    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
}

//Paquetes
package com.example.practica1.analizador;

public class Poligono extends Forma {
    //Atributos
    private int alto;
    private int ancho;
    private int cantidadLados;
    //Constructor
    public Poligono(String tipo,int posx, int posy, String color,int alto, int ancho,int cantidadLados) {
        super(tipo,posx,posy,color);
        this.alto=alto;
        this.ancho=ancho;
        this.cantidadLados=cantidadLados;
    }
    //Metodos
    public int alto() {
        return alto;
    }
    public int ancho() {
        return ancho;
    }
    public int cantidadLados() {
        return cantidadLados;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setCantidadLados(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }
    
}

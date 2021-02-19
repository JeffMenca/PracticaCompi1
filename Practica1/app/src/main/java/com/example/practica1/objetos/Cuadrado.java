//Paquete
package com.example.practica1.objetos;

public class Cuadrado extends Forma {
    
    //Atributos
    private int tamanioLado;
    //Constructor
    public Cuadrado(String tipo,int posx, int posy, String color,int tamanioLado) {
        super(tipo,posx,posy,color);
        this.tamanioLado=tamanioLado;
    }
    //Metodos
    public int getTamanioLado() {
        return tamanioLado;
    }

    public void setTamanioLado(int tamanioLado) {
        this.tamanioLado = tamanioLado;
    }
    
}

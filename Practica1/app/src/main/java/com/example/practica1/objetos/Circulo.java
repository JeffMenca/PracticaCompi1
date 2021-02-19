//Paquete
package com.example.practica1.objetos;

public class Circulo extends Forma {
    //Atributos
    private int radio;
    //Constructor
    public Circulo(String tipo,int posx, int posy, String color,int radio) {
        super(tipo,posx,posy,color);
        this.radio=radio;
    }
    //Metodos
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}

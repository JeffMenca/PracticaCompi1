//Paquetes
package com.example.practica1.analizador;

public class Linea extends Forma {
    //Atributos
    private int posx2;
    private int posy2;;
    //Constructor
    public Linea(String tipo,int posx, int posy, String color,int posx2, int posy2) {
        super(tipo,posx,posy,color);
        this.posx2=posx2;
        this.posy2=posy2;
    }
    //Metodos
    public int getPosx2() {
        return posx2;
    }

    public void setPosx2(int posx2) {
        this.posx2 = posx2;
    }

    public void setPosy2(int posy2) {
        this.posy2 = posy2;
    }
    public int getPosy2() {
        return posy2;
    }
}

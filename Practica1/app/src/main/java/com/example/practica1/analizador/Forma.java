//Paquetes
package com.example.practica1.analizador;
import java.io.Serializable;

public class Forma implements Serializable {
    //Atributos
    private int posx;
    private int posy;
    private String color;
    private String tipo;
    //Constructor
    public Forma(String tipo,int posx, int posy, String color) {
        this.tipo=tipo;
        this.posx=posx;
        this.posy=posy;
        this.color=color;
    }
    //Metodos
    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int posx() {
        return posx;
    }

    public int posy() {
        return posy;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
}

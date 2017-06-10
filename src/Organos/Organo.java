/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organos;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public abstract class Organo {
     private Color color;
    private ArrayList<String> caracteristicas = new ArrayList();
     private int n_potenciado;
    private int n_prueba;

    public Organo() {
    }
    
    public Organo(Color color, int n_potenciado, int n_prueba) {
        this.color = color;
        this.n_potenciado = n_potenciado;
        this.n_prueba = n_prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getN_potenciado() {
        return n_potenciado;
    }

    public void setN_potenciado(int n_potenciado) {
        this.n_potenciado = n_potenciado;
    }

    public int getN_prueba() {
        return n_prueba;
    }

    public void setN_prueba(int n_prueba) {
        this.n_prueba = n_prueba;
    }
    
    public abstract String getNombre();
    public abstract int getEfectividad();

    @Override
    public abstract String toString();
    
    
}

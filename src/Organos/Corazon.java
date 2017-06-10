/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organos;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public class Corazon extends Organo{
    final private String nombre = "Corazon";
    final int efectividad = 21546;

    public Corazon() {
        super();
    }

    public Corazon(Color color, int n_potenciado, int n_prueba) {
        super(color, n_potenciado, n_prueba);
    }
    
      @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEfectividad() {
        return efectividad;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}

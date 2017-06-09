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
public class Riñon extends Organo{

    final private String nombre = "Riñon";
    final int efectividad = 753266;

    public Riñon() {
        super();
    }

    public Riñon(Color color, int n_potenciado, int n_prueba) {
        super(color, n_potenciado, n_prueba);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

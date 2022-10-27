/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidos;

/**
 *
 * @author hola
 */
public abstract class Item {
    private String nombre;
    private double costo;
    
    public Item(String nombre, double costo){
        this.nombre = nombre;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
    
    
}

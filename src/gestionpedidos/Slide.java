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
public class Slide extends Item{
    private int espesor;

    public Slide(int espesor, String nombre, double costo) {
        super(nombre, costo);
        this.espesor = espesor;
    }
    
}

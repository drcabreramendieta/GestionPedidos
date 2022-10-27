/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidos;

import java.util.ArrayList;

/**
 *
 * @author hola
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Pizza> pizzas;
    private ArrayList<Extra> extras;
    private double costo;
    private int numero;
    private int estado;

    public Pedido(String nombre, int numero) {
        this.cliente = new Cliente(nombre);
        this.numero = numero;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void addExtra(Extra extra){
        this.extras.add(extra);
        this.calcularCosto();
    }
    
    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
        this.calcularCosto();
    }
    
    private void calcularCosto(){
        double costoPizzas = 0;
        for(Pizza pizza:this.pizzas){
            double costoSlides = 0;
            for(Slide slide:pizza.getSlides()){
                costoSlides += slide.getCosto();
            }
            double costoBorde = pizza.getBorde().getCosto();
            double costoPizza = costoSlides + costoBorde;
            
            costoPizzas += costoPizza;
        }
        
        double costoExtras = 0;
        for(Extra extra:extras){
            costoExtras += extra.getCosto();
        }
        this.costo = costoPizzas + costoExtras;
    }
    
    public void removePizza(Pizza pizza){
        pizzas.remove(pizza);
        this.calcularCosto();
    }
    
    public void removeExtra(Extra extra){
        extras.remove(extra);
        this.calcularCosto();
    }
}

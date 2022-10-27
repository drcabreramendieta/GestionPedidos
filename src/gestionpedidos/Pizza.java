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
public class Pizza {
    private ArrayList<Slide> slides;
    private Borde borde;

    public Pizza() {
        slides = new ArrayList<>();
    }
    
    public void addSlide(Slide slide){
        slides.add(slide);
    }
    
    public void addBorde(Borde borde){
        this.borde = borde;
    }
    
    public void removeSlide(Slide slide){
        slides.remove(slide);
    }
    
    public void removeBorde(){
        this.borde = null;
    }

    public ArrayList<Slide> getSlides() {
        return slides;
    }

    public Borde getBorde() {
        return borde;
    }
    
    
}

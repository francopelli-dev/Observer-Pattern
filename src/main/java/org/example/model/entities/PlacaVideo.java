package org.example.model.entities;

public class PlacaVideo implements Observador{

    private double precioEnDolar = 150;
    private Sujeto sujeto;
    public  PlacaVideo(Sujeto sujeto){
        this.sujeto= sujeto;
        this.sujeto.agregar(this);
    }
    public void actualizar() {
        System.out.println("El precio de "+ this.getClass().getSimpleName() +" actualizado es: "+ (sujeto.getEstado()*precioEnDolar));
    }
}

package org.example.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<Observador>();
    private Double dolarBlue;

    public void setEstado(Double precio){
        this.dolarBlue = precio;
        this.notificar();
    }
    public Double getEstado(){
        return this.dolarBlue;
    }
    public void agregar(Observador observador){
        this.observadores.add(observador);
    }
    public void notificar(){
        for(Observador observador: this.observadores){
            observador.actualizar();
        }
    }
}

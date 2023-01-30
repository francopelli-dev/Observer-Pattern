package org.example;

import org.example.model.entities.Observador;
import org.example.model.entities.PlacaVideo;
import org.example.model.entities.Sujeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Sujeto sujeto = new Sujeto();
        Observador placa = new PlacaVideo(sujeto);
        sujeto.setEstado(335d);
        sujeto.setEstado(400d);
    }


}
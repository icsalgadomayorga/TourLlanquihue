package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours("src/resources/tours.txt");

        System.out.println("==== LISTA COMPLETA DE TOURS ====");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n=== TOURS CON PRECIO MAYOR A $30.000 ===");

        for (Tour tour : tours) {

            if (tour.getPrecio() > 30000) {
                System.out.println(tour);
            }
        }
    }
}

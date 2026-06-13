package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Tour> listaTours;

    public GestorDatos() {
        listaTours = new ArrayList<>();
    }

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                double precio = Double.parseDouble(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);

                listaTours.add(tour);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}
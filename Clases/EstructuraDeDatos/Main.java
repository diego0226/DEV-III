package Clases.EstructuraDeDatos;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection <String> vehiculos = new ArrayList<String>();
        vehiculos.add("bicicleta");
        vehiculos.add("carro");
        vehiculos.add("helicoptero");
        vehiculos.add("tren");
        vehiculos.add("avion");

        vehiculos.forEach(vehiculo -> System.out.println(vehiculo));
    }
    
    
    
    
}

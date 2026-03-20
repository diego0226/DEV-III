package PracticasGuiadas.practica1;

import java.util.ArrayList;
import java.util.Collection;

public class PracticaGuiada1 {
    public static void main(String[] args) {
        Collection<String> vehiculos = new ArrayList<String>();
        System.out.println("<<<< Size/Empty >>>>>");
        System.out.println("Elementos dentro: " + vehiculos.size());
        System.out.println("Está vacio: " + vehiculos.isEmpty());

        System.out.println("<<<< Add >>>>>");
        System.out.println("Se agregó: " + vehiculos.add("camion"));
        System.out.println("Se agregó: " + vehiculos.add("carro"));

        vehiculos.forEach(vehiculo -> System.out.println("[" + vehiculo + "]"));

        System.out.println("Elementos dentro: " + vehiculos.size());
        System.out.println("Está vacio: " + vehiculos.isEmpty());
        System.out.println();

        System.out.println("<<<< AddAll >>>>>");
        Collection<String> carros = new ArrayList<>();
        carros.add("Corvette");
        carros.add("Camaro");
        carros.addAll(vehiculos);
        carros.forEach(carro -> System.out.println("[" + carro + "]"));
        System.out.println();

        System.out.println("<<<< Contains >>>>>");
        System.out.println("Esta el pontiac: " + carros.contains("pontiac"));
        System.out.println("Está corvette: " + carros.contains("Corvette"));
        System.out.println();

        System.out.println("<<<< ContainsAll >>>>>");
        System.out.println("Carros tiene todos los vehiculos: " + carros.containsAll(vehiculos));
        System.out.println("Vehiculos tiene todos los carros: " + vehiculos.containsAll(carros));
        System.out.println();

        System.out.println("<<<< Equals >>>>>");
        System.out.println("Lista vehiculos es igual a lista carros: " + vehiculos.equals(carros));
        System.out.println();

        System.out.println("<<<< Remove >>>>>");
        System.out.println("Se eliminó Camaro:" + carros.remove("Camaro"));
        System.out.println();

        System.out.println("<<<< RemoveAll>>>>>");
        System.out.println("Se borró la lista vehiculos: " + vehiculos.removeAll(vehiculos));
        System.out.println();        
    }
}

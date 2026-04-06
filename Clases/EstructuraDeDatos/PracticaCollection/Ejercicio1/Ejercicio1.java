package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(90);
        notas.add(95);
        notas.add(80);
        System.out.println("Promedio: " + getAverage(notas));
        
    }

    public static double getAverage(ArrayList<Integer> notas){
        int sum = 0;
        for (int i = 0; i < notas.size(); i++) {
            sum += notas.get(i);
        }
        return 1.0 * sum / notas.size();
    }
    
}

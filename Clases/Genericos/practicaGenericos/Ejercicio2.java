package practicaGenericos;

public class Ejercicio2 {
    public static void main(String[] args) {
        intercambiar(2, 3);
        intercambiar(2.5, 5.0);
        intercambiar("Rafa", "Fausto");
        
    }

    public static <T> void intercambiar(T value1, T value2) {
        System.out.println("Antes del cambio\n" + "valor 1: " + value1 + "\nvalor 2: " + value2);
        T temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.println("Despues del cambio\n" + "valor 1: " + value1 + "\nvalor 2: " + value2);
    }
}

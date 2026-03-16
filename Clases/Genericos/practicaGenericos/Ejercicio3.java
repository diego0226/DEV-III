package practicaGenericos;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(compararElementos(1, 1));
        System.out.println(compararElementos("Diego", "diego"));
        System.out.println(compararElementos(10, 1));
    }
    
    public static <T> boolean compararElementos(T element1, T element2){
        return element1 == element2;
    }
}

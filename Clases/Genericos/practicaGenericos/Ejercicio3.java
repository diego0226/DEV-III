package practicaGenericos;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(compararElementos(1, 1));
        String a = new String("Diego");
        System.out.println(compararElementos(a, "Diego"));
        System.out.println(compararElementos(10, 1));
        System.out.println(compararElementos(2.5, 2.5));
    }
    
    public static <T> boolean compararElementos(T element1, T element2){
        return element1.equals(element2);
    }
}

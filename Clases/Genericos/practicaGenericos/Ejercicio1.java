package practicaGenericos;

public class Ejercicio1 {
    public static void main(String[] args) {
        mostrar("Hello");
        mostrar(10);
        mostrar(10.1);
        
    }

    public static <T> void mostrar(T a){
        System.out.println(a);;
    }
}

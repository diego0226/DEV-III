package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Almacenlmpl<Electronica> almacen1 = new Almacenlmpl<>();
        almacen1.guardar(new Electronica("Celular", "Iphone", 1000));
        almacen1.guardar(new Electronica("Celular", "Xiaomi", 500));
        System.out.println(almacen1.obtener(0));
    }
}

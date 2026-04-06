package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio2;

public interface Almacen<T> {
    public void guardar(T element);
    public T obtener(int index);
    public int cantidad(T element);
}

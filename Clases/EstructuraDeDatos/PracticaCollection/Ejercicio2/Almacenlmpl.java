package Clases.EstructuraDeDatos.PracticaCollection.Ejercicio2;

import java.util.ArrayList;

public class Almacenlmpl <T> implements Almacen <T>{
    private ArrayList<T> products;

    public Almacenlmpl(){
        products = new ArrayList<>();   
    }

    @Override
    public void guardar(T element) {
        products.add(element);
    }

    @Override
    public T obtener(int index) {
        return products.get(index);
    }

    @Override
    public int cantidad(T element) {
        return products.size();
    }
    
}

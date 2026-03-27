package Clases.EstructuraDeDatos;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> marcasCarros = new LinkedList<>();
        marcasCarros.add("BMW");
        marcasCarros.add("Audi");
        marcasCarros.addFirst("Chevrolet");
        marcasCarros.addLast("Mclaren");

        System.out.println(marcasCarros.getLast());
        System.out.println(marcasCarros.getFirst());

        marcasCarros.removeFirst();
        marcasCarros.removeLast();

        int tamanoLista = 99999;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long inicioArrayList = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            arrayList.add(0, i);
        }

        long inicioArrayListGet = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            arrayList.get(i);
        }

        long finArrayList = System.nanoTime();
        System.out.println("ArrayList - tiempo de insercion al inicio: " +  (finArrayList - inicioArrayListGet) + " ns");

        long inicioLinkenList = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            linkedList.add(0, i);
        }

        long inicioLinkenListGet = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            linkedList.get(i);
        }

        long finLinkendList = System.nanoTime();
        System.out.println("linkendList - tiempo de insercion al inicio: " +  (finLinkendList - inicioLinkenListGet) + " ns");
    }
    

}

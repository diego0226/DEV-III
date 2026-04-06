package Clases.LibreriasEstructuras.Ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>(List.of(
            new Product("Creatina", 20000, 3),
            new Product("Proteina", 50000, 5),
            new Product("Pre entreno", 14000, 2)
        ));

        Collections.sort(products);
        printList(products);
        System.out.println();

        Collections.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        printList(products);
        System.out.println();
        
        Collections.sort(products, new ComparePrice());
        printList(products);
    }

    public static void printList(ArrayList<Product> list){
        for (Product product : list) {
            System.out.println(product);
        }
    }
    
}

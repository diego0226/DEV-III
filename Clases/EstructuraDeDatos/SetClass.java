package Clases.EstructuraDeDatos;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("Diego");
        set1.add("Fausto");
        set1.add("Rafa");
        set1.add("Anissa");


        for (String string : set1) 
            System.out.println(string);
        
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(10);
        cola.offer(20);
        System.out.println(cola.poll());
        System.out.println(cola.peek());

        PriorityQueue <String> cola2 = new PriorityQueue<>();
        cola2.offer("Carlos");
        cola2.offer("Ana");
        cola2.offer("Luis");
        while (!cola2.isEmpty()) {
            System.out.println(cola2.poll());
            
        }

    }
    
}

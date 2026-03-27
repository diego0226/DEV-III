package Clases.LibreriasEstructuras;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(2, 1, 5, 7, 8, 4, 3));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        List<Task> tasks = new LinkedList<>();
        tasks.add(new Task("task1", 1));
        tasks.add(new Task("task2", 2));

        Collections.sort(tasks);
        System.out.println(tasks.toString());
        
    }
    
    
}

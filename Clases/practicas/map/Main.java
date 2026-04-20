package Clases.practicas.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<String, Integer>();
        list.put("apple", 1);
        list.put("app", 2);
        list.put("banana", 3);

        buscar(list, "app");
    }

    public static void buscar(Map<String, Integer> list, String prefijo){
       int sum = 0;
        for (Map.Entry<String, Integer> a : list.entrySet()) {
            if (a.getKey().contains(prefijo)) {
                sum += a.getValue();
                System.out.println(a.getKey());
            }
        }
        System.out.println("Suma: " + sum);
    }
}

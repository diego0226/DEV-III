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
        list.forEach((key, value) -> {
            if (key.contains(prefijo)) {
                System.out.println(key);
            }
        });
    }
    
}

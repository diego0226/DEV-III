package Clases.EstructuraDeDatos;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empsIds = new HashMap<>();
        empsIds.put("Diego", 12345);
        empsIds.put("Rafa", 54321);

        System.out.println(empsIds);

        System.out.println(empsIds.get("Rafa"));
        System.out.println(empsIds.containsKey("Diego"));
        System.out.println(empsIds.containsValue(12345));
        empsIds.put("Diego", 1);
        System.out.println(empsIds);
        System.out.println(empsIds.putIfAbsent("pablo", 2));
        System.out.println(empsIds);
    }
    
}

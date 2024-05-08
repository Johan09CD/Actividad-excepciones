package Excepciones;

import java.util.HashMap;
import java.util.Map;


public class excepcion_17 {
 
    public static void main(String[] args) {
          
        try {
            Map<String, Integer> map = new HashMap<>();
            map.put("One", 1);
            map = java.util.Collections.unmodifiableMap(map);
            map.put("Two", 2); // Intentando agregar un par clave-valor a un mapa no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }         
      }
}

package Excepciones;

import java.util.Collections;
import java.util.List;


public class excepcion_15 {
    
    public static void main(String[] args) {
          
        try {
            List<String> list = Collections.singletonList("Hello");
            list.add("World"); // Intentando agregar un elemento a una lista no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }        
    }
}

package Excepciones;

import java.util.List;
import java.util.Collections;

public class excepcion_11 {
    
    public static void main(String[] args) {
          
       try {
            List<String> list = Collections.emptyList();
            String element = list.get(0); // Accediendo a un índice fuera de los límites de la lista vacía
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }           
    }
}

package Excepciones;

import java.util.ArrayList;
import java.util.List;


public class excepcion_13 {
 
    public static void main(String[] args) {
         
       try {
            List<String> list = new ArrayList<>();
            list.add("One");
            for (String item : list) {
                list.remove(0); // Modificando la lista mientras se itera sobre ella
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: " + e.getMessage());
        }              
    }
}

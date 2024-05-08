package Excepciones;


public class excepcion_20 {
    
    public static void main(String[] args) {
         
        try {
            java.util.Iterator<String> iterator = java.util.Collections.emptyIterator();
            String element = iterator.next(); // Intentando obtener el siguiente elemento de un iterador vacío
        } catch (java.util.NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.getMessage());
        }             
      }
}

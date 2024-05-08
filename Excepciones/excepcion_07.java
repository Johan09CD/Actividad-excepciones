package Excepciones;


public class excepcion_07 {
   
    public static void main(String[] args) {
          
        try {
            Object[] objects = new Object[Integer.MAX_VALUE]; // Intentando crear un array con tamaño excesivo
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }           
    }
}

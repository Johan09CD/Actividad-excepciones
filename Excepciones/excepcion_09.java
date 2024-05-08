package Excepciones;


public class excepcion_09 {
    
    public static void main(String[] args) {
          
        try {
            int number = Integer.parseInt("abc"); // Intentando convertir una cadena no numérica a un entero
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }            
      }
}

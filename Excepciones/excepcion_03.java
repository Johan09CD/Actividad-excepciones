package Excepciones;


public class excepcion_03 {
    
    public static void main(String[] args) {
          
        try {
            Integer.parseInt("abc"); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }          
      }
}

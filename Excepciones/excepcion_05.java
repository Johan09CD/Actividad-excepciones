package Excepciones;


public class excepcion_05 {
    
    public static void main(String[] args) {
          
        try {
            Object.class.getDeclaredField("nonExistentField"); // Accediendo a un campo que no existe
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException: " + e.getMessage());
        }               
      }
}

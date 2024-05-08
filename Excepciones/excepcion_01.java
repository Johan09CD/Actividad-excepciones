package Excepciones;


public class excepcion_01 {
    
   public static void main(String[] args) {
      
        Object obj = null;
        try {
            obj.toString(); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}

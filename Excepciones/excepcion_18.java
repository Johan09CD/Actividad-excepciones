package Excepciones;


public class excepcion_18 {
    
    public static void main(String[] args) {
          
         String str = null;
        try {
            System.out.println(str.length());
        } catch (Throwable e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }         
      }
}

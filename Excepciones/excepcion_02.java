
package Excepciones;


public class excepcion_02 {
    
      public static void main(String[] args) {
          
        try {
            Object x = new Integer(0);
            System.out.println((String) x); // Intentando castear un Integer a String
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }         
      }
}

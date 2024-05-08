package Excepciones;


public class excepcion_04 {
    
    public static void main(String[] args) {
          
        try {
            int result = 5 / 0; // División por cero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }         
      }
}

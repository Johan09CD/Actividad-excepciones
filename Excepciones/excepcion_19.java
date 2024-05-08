package Excepciones;


public class excepcion_19 {
    
    public static void main(String[] args) {
          
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (Throwable e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }               
      }
}

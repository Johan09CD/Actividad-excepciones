package Excepciones;


public class excepcion_14 {
 
    public static void main(String[] args) {
          
        try {
            int[] array = new int[-5]; // Creando un arreglo con tamaño negativo
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: " + e.getMessage());
        }               
    }
}

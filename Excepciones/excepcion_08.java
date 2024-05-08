package Excepciones;


public class excepcion_08 {
    
    public static void main(String[] args) {
          
        try {
            int[] array = new int[5];
            int value = array[10]; // Accediendo a un índice fuera de los límites de la matriz
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }          
    }
}

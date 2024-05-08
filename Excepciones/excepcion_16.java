package Excepciones;


public class excepcion_16 {
    
    public static void main(String[] args) {
         
        try {
            Object[] objects = new Integer[5];
            objects[0] = "Hello"; // Intentando almacenar un tipo de objeto incompatible en un arreglo de tipos específicos
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
        }          
    }
}

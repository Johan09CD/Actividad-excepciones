package Excepciones;


public class excepcion_06 {
    
    public static void main(String[] args) {
         
        try {
            Object.class.getDeclaredMethod("nonExistentMethod"); // Accediendo a un método que no existe
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException: " + e.getMessage());
        }           
    }
}

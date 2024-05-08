package Excepciones;


public class excepcion_45 {
    
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Esto es una excepción de tiempo de ejecución");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

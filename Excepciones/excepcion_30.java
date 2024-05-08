package Excepciones;


public class excepcion_30 {
   
    public static void main(String[] args) {
        try {
            throw new InterruptedException("Hilo interrumpido");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

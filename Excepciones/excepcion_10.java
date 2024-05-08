package Excepciones;


public class excepcion_10 {
    
    public static void main(String[] args) {
          
        try {
            Object obj = new Object();
            obj.wait(); // Esperando en un objeto sin tener el bloqueo
        } catch (InterruptedException | IllegalMonitorStateException e) {
            System.out.println("IllegalMonitorStateException: " + e.getMessage());
        }               
    }
}

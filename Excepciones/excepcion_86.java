package Excepciones;

import java.nio.channels.InterruptedByTimeoutException;


public class excepcion_86 {
    
    public static void main(String[] args) {
        try {
            throw new InterruptedByTimeoutException();
        } catch (InterruptedByTimeoutException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.io.InterruptedIOException;


public class excepcion_87 {
    
    public static void main(String[] args) {
        try {
            throw new InterruptedIOException();
        } catch (InterruptedIOException e) {
            e.printStackTrace();
        }
    }
}

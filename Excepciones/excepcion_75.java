package Excepciones;

import javax.crypto.ShortBufferException;


public class excepcion_75 {
    
    public static void main(String[] args) {
        try {
            throw new ShortBufferException("Buffer demasiado corto");
        } catch (ShortBufferException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.io.EOFException;


public class excepcion_80 {
    
    public static void main(String[] args) {
        try {
            throw new EOFException();
        } catch (EOFException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.nio.BufferOverflowException;


public class excepcion_103 {
    
     public static void main(String[] args) {
        try {
            throw new BufferOverflowException();
        } catch (BufferOverflowException e) {
            e.printStackTrace();
        }
    }
}

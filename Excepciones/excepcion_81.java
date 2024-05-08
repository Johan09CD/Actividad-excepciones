package Excepciones;

import java.nio.channels.FileLockInterruptionException;


public class excepcion_81 {
    
     public static void main(String[] args) {
        try {
            throw new FileLockInterruptionException();
        } catch (FileLockInterruptionException e) {
            e.printStackTrace();
        }
    }
}

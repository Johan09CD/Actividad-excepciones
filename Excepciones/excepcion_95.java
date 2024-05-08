package Excepciones;

import java.io.SyncFailedException;


public class excepcion_95 {
    
    public static void main(String[] args) {
        try {
            throw new SyncFailedException("Error en la sincronización del archivo");
        } catch (SyncFailedException e) {
            e.printStackTrace();
        }
    }
}

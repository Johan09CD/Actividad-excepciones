package Excepciones;

import java.util.prefs.BackingStoreException;


public class excepcion_22 {
    
    public static void main(String[] args) {
        try {
            throw new BackingStoreException("Error en el almacenamiento de respaldo");
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }
}

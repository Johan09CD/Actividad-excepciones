package Excepciones;

import java.security.DigestException;


public class excepcion_71 {
    
    public static void main(String[] args) {
        try {
            throw new DigestException("Error en la función de hash (Digest)");
        } catch (DigestException e) {
            e.printStackTrace();
        }
    }
}

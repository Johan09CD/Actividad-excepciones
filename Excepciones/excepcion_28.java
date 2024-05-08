package Excepciones;

import java.security.GeneralSecurityException;


public class excepcion_28 {
    
    public static void main(String[] args) {
        try {
            throw new GeneralSecurityException("Error de seguridad general");
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}

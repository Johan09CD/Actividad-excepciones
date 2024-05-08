package Excepciones;

import java.security.cert.CertPathBuilderException;


public class excepcion_68 {
    
    public static void main(String[] args) {
        try {
            throw new CertPathBuilderException("Error en la construcción del CertPath");
        } catch (CertPathBuilderException e) {
            e.printStackTrace();
        }
    }
}

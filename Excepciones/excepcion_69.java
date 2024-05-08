package Excepciones;

import java.security.cert.CertPathValidatorException;


public class excepcion_69 {
    
    public static void main(String[] args) {
        try {
            throw new CertPathValidatorException("Error en la validación del CertPath");
        } catch (CertPathValidatorException e) {
            e.printStackTrace();
        }
    }
}

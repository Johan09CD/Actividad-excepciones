package Excepciones;

import java.security.cert.CertificateException;


public class excepcion_26 {
    
    public static void main(String[] args) {
        try {
            throw new CertificateException("Error en el certificado");
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}

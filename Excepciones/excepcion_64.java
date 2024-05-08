package Excepciones;

import java.security.cert.CertificateExpiredException;


public class excepcion_64 {
    
    public static void main(String[] args) {
        try {
            // Simulación de un certificado vencido
            throw new CertificateExpiredException("El certificado ha caducado");
        } catch (CertificateExpiredException e) {
            e.printStackTrace();
        }
    }
}

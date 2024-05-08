package Excepciones;

import javax.security.cert.CertificateNotYetValidException;


public class excepcion_65 {
    
    public static void main(String[] args) {
        try {
            // Simulación de un certificado aún no válido
            throw new CertificateNotYetValidException("El certificado aún no es válido");
        } catch (CertificateNotYetValidException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.security.cert.CertificateException;


public class excepcion_67 {
    
    public static void main(String[] args) {
        try {
            throw new CertificateException("Excepción relacionada con el certificado");
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}

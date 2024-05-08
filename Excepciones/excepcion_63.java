package Excepciones;

import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;


public class excepcion_63 {
    
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            // Aquí se puede lanzar la excepción si hay problemas al codificar el certificado
            X509Certificate cert = (X509Certificate) cf.generateCertificate(null);
        } catch (CertificateEncodingException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

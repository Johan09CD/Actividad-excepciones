package Excepciones;

import java.security.cert.CertStoreException;


public class excepcion_70 {
    
    public static void main(String[] args) {
        try {
            throw new CertStoreException("Excepción relacionada con el almacén de certificados");
        } catch (CertStoreException e) {
            e.printStackTrace();
        }
    }
}

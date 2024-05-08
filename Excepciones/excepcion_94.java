package Excepciones;

import javax.net.ssl.SSLException;


public class excepcion_94 {
    
    public static void main(String[] args) {
        try {
            throw new SSLException("Excepción SSL");
        } catch (SSLException e) {
            e.printStackTrace();
        }
    }
}

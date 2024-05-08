package Excepciones;

import javax.management.remote.JMXProviderException;


public class excepcion_89 {
    
    public static void main(String[] args) {
        try {
            throw new JMXProviderException("Excepción del proveedor JMX");
        } catch (JMXProviderException e) {
            e.printStackTrace();
        }
    }
}

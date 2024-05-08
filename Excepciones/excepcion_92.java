package Excepciones;

import java.net.ProtocolException;


public class excepcion_92 {
    
    public static void main(String[] args) {
        try {
            throw new ProtocolException("Excepción del protocolo de red");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }
}

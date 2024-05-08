package Excepciones;

import java.net.UnknownHostException;


public class excepcion_96 {
    
    public static void main(String[] args) {
        try {
            throw new UnknownHostException("Host desconocido");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

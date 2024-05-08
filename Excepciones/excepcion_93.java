package Excepciones;

import java.net.SocketException;


public class excepcion_93 {
    
    public static void main(String[] args) {
        try {
            throw new SocketException("Excepción de socket");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

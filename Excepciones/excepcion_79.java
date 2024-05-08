package Excepciones;

import java.nio.channels.ClosedChannelException;


public class excepcion_79 {
    
    public static void main(String[] args) {
        try {
            throw new ClosedChannelException();
        } catch (ClosedChannelException e) {
            e.printStackTrace();
        }
    }
}

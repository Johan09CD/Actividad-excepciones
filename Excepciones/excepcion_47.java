package Excepciones;

import java.util.concurrent.TimeoutException;


public class excepcion_47 {
    
    public static void main(String[] args) {
        try {
            throw new TimeoutException("Se ha excedido el tiempo de espera");
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.util.TooManyListenersException;


public class excepcion_48 {
    
    public static void main(String[] args) {
        try {
            throw new TooManyListenersException("Demasiados escuchadores registrados");
        } catch (TooManyListenersException e) {
            e.printStackTrace();
        }
    }
}

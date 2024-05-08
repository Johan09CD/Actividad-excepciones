package Excepciones;

import java.net.HttpRetryException;


public class excepcion_84 {
    
    public static void main(String[] args) {
        try {
            throw new HttpRetryException("", 0);
        } catch (HttpRetryException e) {
            e.printStackTrace();
        }
    }
}

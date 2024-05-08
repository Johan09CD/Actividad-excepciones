package Excepciones;

import java.util.concurrent.CompletionException;


public class excepcion_105 {
    
     public static void main(String[] args) {
        try {
            throw new CompletionException(new RuntimeException("Excepción de completitud"));
        } catch (CompletionException e) {
            e.printStackTrace();
        }
    }
}

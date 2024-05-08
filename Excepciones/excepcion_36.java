package Excepciones;

import java.io.IOException;


public class excepcion_36 {
   
     public static void main(String[] args) {
        try {
            throw new IOException("Error de entrada/salida");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

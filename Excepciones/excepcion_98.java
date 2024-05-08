package Excepciones;

import java.io.UnsupportedEncodingException;


public class excepcion_98 {
    
    public static void main(String[] args) {
        try {
            throw new UnsupportedEncodingException("Codificación no soportada");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import javax.crypto.BadPaddingException;


public class excepcion_66 {
    
    public static void main(String[] args) {
        try {
            throw new BadPaddingException("Relleno incorrecto");
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
    }
}

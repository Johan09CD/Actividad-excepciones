package Excepciones;

import java.io.CharConversionException;


public class excepcion_78 {
    
    public static void main(String[] args) {
        try {
            throw new CharConversionException();
        } catch (CharConversionException e) {
            e.printStackTrace();
        }
    }
}

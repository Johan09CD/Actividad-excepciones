package Excepciones;

import java.util.InvalidPropertiesFormatException;


public class excepcion_88 {

     public static void main(String[] args) {
        try {
            throw new InvalidPropertiesFormatException("Formato de propiedades no válido");
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        }
    }
}

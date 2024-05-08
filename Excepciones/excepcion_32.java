package Excepciones;

import javax.management.InvalidApplicationException;


public class excepcion_32 {
 
     public static void main(String[] args) {
        try {
            throw new InvalidApplicationException("Aplicación inválida");
        } catch (InvalidApplicationException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import javax.management.BadStringOperationException;


public class excepcion_25 {
    
    public static void main(String[] args) {
        try {
            throw new BadStringOperationException("Operación de cadena no válida");
        } catch (BadStringOperationException e) {
            e.printStackTrace();
        }
    }
}

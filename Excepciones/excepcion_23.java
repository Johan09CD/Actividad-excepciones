package Excepciones;

import javax.management.BadAttributeValueExpException;


public class excepcion_23 {
    
    public static void main(String[] args) {
        try {
            throw new BadAttributeValueExpException("Valor de atributo no válido");
        } catch (BadAttributeValueExpException e) {
            e.printStackTrace();
        }
    }
}

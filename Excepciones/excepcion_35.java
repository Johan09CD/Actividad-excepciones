
package Excepciones;

import javax.management.modelmbean.InvalidTargetObjectTypeException;


public class excepcion_35 {
    
    public static void main(String[] args) {
        try {
            throw new InvalidTargetObjectTypeException("Tipo de objeto de destino inválido");
        } catch (InvalidTargetObjectTypeException e) {
            e.printStackTrace();
        }
    }
}

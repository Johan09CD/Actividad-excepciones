package Excepciones;

import javax.crypto.ExemptionMechanismException;


public class excepcion_72 {
    
    public static void main(String[] args) {
        try {
            throw new ExemptionMechanismException("Error en el mecanismo de exención");
        } catch (ExemptionMechanismException e) {
            e.printStackTrace();
        }
    }
}

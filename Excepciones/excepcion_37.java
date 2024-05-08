package Excepciones;

import javax.management.JMException;


public class excepcion_37 {
    
    public static void main(String[] args) {
        try {
            throw new JMException("Error en la gestión JMX");
        } catch (JMException e) {
            e.printStackTrace();
        }
    }
}

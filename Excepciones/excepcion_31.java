package Excepciones;

import javax.management.IntrospectionException;


public class excepcion_31 {
 
    public static void main(String[] args) {
        try {
            throw new IntrospectionException("Error de introspección");
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}

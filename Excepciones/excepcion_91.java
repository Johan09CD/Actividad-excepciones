package Excepciones;

import java.io.ObjectStreamException;


public class excepcion_91 {
    
    public static void main(String[] args) {
        try {
            throw new ObjectStreamException("Excepción en el flujo de objetos") {};
        } catch (ObjectStreamException e) {
            e.printStackTrace();
        }
    }
}

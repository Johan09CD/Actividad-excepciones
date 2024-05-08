package Excepciones;

import javax.xml.stream.XMLStreamException;


public class excepcion_54 {
    
     public static void main(String[] args) {
        try {
            throw new XMLStreamException("Error en el flujo XML");
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}

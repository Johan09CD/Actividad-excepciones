package Excepciones;

import org.xml.sax.SAXException;


public class excepcion_46 {
    
    public static void main(String[] args) {
        try {
            throw new SAXException("Error en el análisis SAX");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}

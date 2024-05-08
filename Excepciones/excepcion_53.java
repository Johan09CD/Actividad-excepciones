package Excepciones;

import org.xml.sax.SAXParseException;


public class excepcion_53 {
    
    public static void main(String[] args) {
        try {
            throw new SAXParseException("Error en el análisis XML", null);
        } catch (SAXParseException e) {
            e.printStackTrace();
        }
    }
}

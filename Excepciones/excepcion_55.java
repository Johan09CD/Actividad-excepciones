package Excepciones;

import javax.xml.xpath.XPathException;


public class excepcion_55 {
    
    public static void main(String[] args) {
        try {
            throw new XPathException("Error en la expresión XPath");
        } catch (XPathException e) {
            e.printStackTrace();
        }
    }
}

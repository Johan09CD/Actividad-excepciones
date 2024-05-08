package Excepciones;

import java.net.URI;
import java.net.URISyntaxException;


public class excepcion_52 {
    
    public static void main(String[] args) {
        try {
            URI uri = new URI("esto no es una URI válida");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

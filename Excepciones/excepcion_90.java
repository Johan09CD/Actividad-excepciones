package Excepciones;

import java.net.MalformedURLException;


public class excepcion_90 {
    
    public static void main(String[] args) {
        try {
            throw new MalformedURLException("URL mal formada");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

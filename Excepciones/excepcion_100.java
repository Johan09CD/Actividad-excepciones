package Excepciones;

import java.util.zip.ZipException;


public class excepcion_100 {
    
    public static void main(String[] args) {
        try {
            throw new ZipException("Excepción de compresión ZIP");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}

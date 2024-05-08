package Excepciones;

import java.awt.datatransfer.MimeTypeParseException;


public class excepcion_40 {
    
    public static void main(String[] args) {
        try {
            throw new MimeTypeParseException("Error al analizar el tipo MIME");
        } catch (MimeTypeParseException e) {
            e.printStackTrace();
        }
    }
}

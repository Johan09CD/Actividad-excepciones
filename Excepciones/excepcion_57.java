package Excepciones;

import java.lang.annotation.AnnotationFormatError;


public class excepcion_57 {
    public static void main(String[] args) {
        try {
            throw new AnnotationFormatError("Error en el formato de la anotación");
        } catch (AnnotationFormatError e) {
            e.printStackTrace();
        }
    }
}

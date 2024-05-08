package Excepciones;

import java.lang.annotation.AnnotationTypeMismatchException;


public class excepcion_101 {
    
    public static void main(String[] args) {
        try {
            throw new AnnotationTypeMismatchException(null, "Mensaje de excepción");
        } catch (AnnotationTypeMismatchException e) {
            e.printStackTrace();
        }
    }
}

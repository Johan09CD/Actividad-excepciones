package Excepciones;

import java.nio.charset.CoderMalfunctionError;


public class excepcion_59 {
    
    public static void main(String[] args) {
        try {
            throw new CoderMalfunctionError(new RuntimeException("Malfunción del codificador"));
        } catch (CoderMalfunctionError e) {
            e.printStackTrace();
        }
    }
}

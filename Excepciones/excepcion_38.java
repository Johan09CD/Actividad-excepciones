package Excepciones;

import javax.sound.sampled.LineUnavailableException;


public class excepcion_38 {
    
    public static void main(String[] args) {
        try {
            throw new LineUnavailableException("La línea de audio no está disponible");
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import javax.sound.sampled.UnsupportedAudioFileException;


public class excepcion_49 {
    
    public static void main(String[] args) {
        try {
            throw new UnsupportedAudioFileException("Formato de archivo de audio no compatible");
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
}

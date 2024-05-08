package Excepciones;

import javax.sound.midi.InvalidMidiDataException;


public class excepcion_33 {
   
    public static void main(String[] args) {
        try {
            throw new InvalidMidiDataException("Datos MIDI inválidos");
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}

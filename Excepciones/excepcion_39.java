package Excepciones;

import javax.sound.midi.MidiUnavailableException;


public class excepcion_39 {

     public static void main(String[] args) {
        try {
            throw new MidiUnavailableException("Dispositivo MIDI no disponible");
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}

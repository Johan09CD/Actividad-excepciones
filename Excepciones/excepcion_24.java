package Excepciones;

import javax.swing.text.BadLocationException;


public class excepcion_24 {
    
    public static void main(String[] args) {
        try {
            throw new BadLocationException("Ubicación no válida", 0);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import javax.swing.undo.CannotUndoException;


public class excepcion_104 {
    
     public static void main(String[] args) {
        try {
            throw new CannotUndoException();
        } catch (CannotUndoException e) {
            e.printStackTrace();
        }
    }
}

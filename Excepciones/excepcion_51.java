package Excepciones;

import javax.swing.UnsupportedLookAndFeelException;


public class excepcion_51 {
    
    public static void main(String[] args) {
        try {
            throw new UnsupportedLookAndFeelException("Estilo de apariencia no compatible");
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}

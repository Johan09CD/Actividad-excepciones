package Excepciones;

import java.awt.AWTError;


public class excepcion_58 {
    
    public static void main(String[] args) {
        try {
            throw new AWTError("Error en la Abstract Window Toolkit (AWT)");
        } catch (AWTError e) {
            e.printStackTrace();
        }
    }
}

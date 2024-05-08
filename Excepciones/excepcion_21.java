package Excepciones;

import java.awt.AWTException;


public class excepcion_21 {
    
     public static void main(String[] args) {
        try {
            throw new AWTException("Excepción de AWT");
        } catch (AWTException e) {
          e.printStackTrace();
        }
    }
}

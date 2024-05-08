package Excepciones;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;


public class excepcion_27 {
    
    public static void main(String[] args) {
        try {
            // Supongamos que cargamos una fuente desde un archivo
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("CustomFont.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}

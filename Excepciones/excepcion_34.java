
package Excepciones;

import java.util.prefs.InvalidPreferencesFormatException;


public class excepcion_34 {
    
    public static void main(String[] args) {
        try {
            throw new InvalidPreferencesFormatException("Formato de preferencias inválido");
        } catch (InvalidPreferencesFormatException e) {
            e.printStackTrace();
        }
    }
}

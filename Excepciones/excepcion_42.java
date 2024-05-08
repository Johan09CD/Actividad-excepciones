package Excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class excepcion_42 {
    
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateFormat.parse("texto no válido");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

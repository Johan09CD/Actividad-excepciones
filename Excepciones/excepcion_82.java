package Excepciones;

import java.io.FileNotFoundException;


public class excepcion_82 {
    
     public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

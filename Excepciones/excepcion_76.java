package Excepciones;

import java.nio.charset.CharacterCodingException;


public class excepcion_76 {

     public static void main(String[] args) {
        try {
            throw new CharacterCodingException();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
    }
}

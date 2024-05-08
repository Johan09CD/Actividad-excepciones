package Excepciones;

import java.security.NoSuchAlgorithmException;


public class excepcion_74 {
    
     public static void main(String[] args) {
        try {
            throw new NoSuchAlgorithmException("Algoritmo no encontrado");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;

import java.security.NoSuchProviderException;


public class excepcion_73 {
    public static void main(String[] args) {
        try {
            throw new NoSuchProviderException("Proveedor no encontrado");
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}

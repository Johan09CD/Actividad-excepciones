package Excepciones;

import java.net.UnknownServiceException;


public class excepcion_97 {
    
    public static void main(String[] args) {
        try {
            throw new UnknownServiceException("Servicio desconocido");
        } catch (UnknownServiceException e) {
            e.printStackTrace();
        }
    }
}

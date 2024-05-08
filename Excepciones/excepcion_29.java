package Excepciones;

import org.ietf.jgss.GSSException;


public class excepcion_29 {
    public static void main(String[] args) {
        try {
            throw new GSSException(GSSException.FAILURE, 1, "Error en el servicio de seguridad genérica");
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}

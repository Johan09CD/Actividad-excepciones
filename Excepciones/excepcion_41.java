package Excepciones;

import javax.naming.NamingException;


public class excepcion_41 {

    public static void main(String[] args) {
        try {
            throw new NamingException("Error en el contexto de nombres");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}

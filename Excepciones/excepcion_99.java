package Excepciones;

import java.nio.file.attribute.UserPrincipalNotFoundException;


public class excepcion_99 {
    
    public static void main(String[] args) {
        try {
            throw new UserPrincipalNotFoundException("Usuario principal no encontrado");
        } catch (UserPrincipalNotFoundException e) {
            e.printStackTrace();
        }
    }
}

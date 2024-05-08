package Excepciones;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;


public class excepcion_50 {
    
    public static void main(String[] args) {
        try {
            throw new UnsupportedCallbackException((Callback) null, "Operación de callback no soportada");
        } catch (UnsupportedCallbackException e) {
            e.printStackTrace();
        }
    }
}

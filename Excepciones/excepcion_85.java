package Excepciones;

import javax.imageio.IIOException;


public class excepcion_85 {
    
    public static void main(String[] args) {
        try {
            throw new IIOException("");
        } catch (IIOException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;


public class excepcion_60 {
    
    public static void main(String[] args) {
        try {
            throw new LinkageError("Error de vinculación");
        } catch (LinkageError e) {
            e.printStackTrace();
        }
    }
}

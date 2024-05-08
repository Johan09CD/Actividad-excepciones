package Excepciones;


public class excepcion_56 {
    
    public static void main(String[] args) {
        try {
            throw new Error("Esto es un error");
        } catch (Error e) {
            e.printStackTrace();
        }
    }
}

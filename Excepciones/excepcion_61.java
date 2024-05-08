package Excepciones;


public class excepcion_61 {
    
    public static void main(String[] args) {
        try {
            throw new ThreadDeath();
        } catch (ThreadDeath e) {
            e.printStackTrace();
        }
    }
}

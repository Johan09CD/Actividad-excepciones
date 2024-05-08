package Excepciones;


public class excepcion_44 {
    
     public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("NombreDeClase");
            clazz.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}

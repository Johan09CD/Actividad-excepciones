package Excepciones;


public class excepcion_102 {
    
    public static void main(String[] args) {
        try {
            throw new ArrayStoreException("Error de almacenamiento en arreglo");
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }
}

package Excepciones;


public class excepcion_12 {
    
    public static void main(String[] args) {
      
        try {
            String str = "Hello";
            char ch = str.charAt(10); // Accediendo a un índice fuera de los límites de la cadena
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }            
    }
}

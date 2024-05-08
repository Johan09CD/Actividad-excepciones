package Excepciones;

import java.nio.file.FileSystemException;


public class excepcion_83 {
    
    public static void main(String[] args) {
        try {
            throw new FileSystemException("");
        } catch (FileSystemException e) {
            e.printStackTrace();
        }
    }
}

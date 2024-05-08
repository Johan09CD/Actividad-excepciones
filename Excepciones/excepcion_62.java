package Excepciones;


public class excepcion_62 {

   public static void main(String[] args) {
        try {
            throw new VirtualMachineError("Error de la máquina virtual") {};
        } catch (VirtualMachineError e) {
            e.printStackTrace();
        }
    }   
}

package Excepciones;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;


public class excepcion_43 {
    
    public static void main(String[] args) {
        try {
            PropertyChangeListener listener = new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    try {
                        throw new PropertyVetoException("Veto de propiedad", evt);
                    } catch (PropertyVetoException e) {
                        e.printStackTrace();
                    }
                }
            };
            // Simulando un cambio de propiedad
            listener.propertyChange(new PropertyChangeEvent(new Object(), "propiedad", null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

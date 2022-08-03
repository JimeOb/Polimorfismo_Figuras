
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Controlador implements ActionListener {
    
    
    private Modelo modelo;
    private final Ventana ventana;

     
      public Controlador(Ventana aThis){
            ventana = aThis;
            modelo = ventana.getModelo();
      }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == modelo.getVentana().getBtnGraficar()){
            
        }
        else if (e.getSource() == modelo.getVentana().getRbtCirculo()){
            modelo.Seleccion();
        }
        else if (e.getSource() == modelo.getVentana().getRbtPoligono()){
            modelo.Seleccion();
        }
    }
}

        
    




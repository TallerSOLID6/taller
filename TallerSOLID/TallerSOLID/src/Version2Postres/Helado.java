/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2Postres;

import Otros.Aderezo;
import ProcesoCorrecto.OperacionesAderezoCorrecto;

/**
 *
 * @author Administrador
 */
public class Helado extends Producto implements OperacionesAderezoCorrecto{
    
    public Helado(String sabor) {
        super(sabor);
    }


    @Override
    public void anadirAderezo(Aderezo aderezo) {
        aderezos.add(aderezo);
    }

    @Override
    public void quitarAderezo(Aderezo aderezo) {
        aderezos.remove(aderezo);
    }
    
    
    
}

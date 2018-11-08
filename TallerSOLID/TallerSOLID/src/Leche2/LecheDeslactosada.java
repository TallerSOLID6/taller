/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche2;

import Leche.*;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada implements Leche{

    @Override
    public void usar() {
        //UsandoLecheDeslactosada
    }
    
    @Override
    public void cambiar(){
        LecheDeslactosada ldeslac= new LecheDeslactosada();
        ldeslac.usar();
    }
    
}

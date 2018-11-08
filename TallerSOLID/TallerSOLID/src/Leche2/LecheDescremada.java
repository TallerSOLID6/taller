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
public class LecheDescremada implements Leche{

    
    @Override
    public void usar() {
        //Usando leche descremada
    }
    
    @Override
    public void cambiar(){
        LecheDescremada ldescrem= new LecheDescremada();
        ldescrem.usar();
    }
    
}

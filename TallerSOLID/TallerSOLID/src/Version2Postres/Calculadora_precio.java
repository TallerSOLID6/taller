/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2Postres;

/**
 *
 * @author Administrador
 */
public class Calculadora_precio {
    
    
    public double calcularPrecioFinal(Producto producto){
        double precioFinal;
        precioFinal=(producto.getPrecioParcial()+(producto.getPrecioParcial()*0.12))+(producto.getAderezos().size()*0.50);
        return precioFinal;
    }
    
}

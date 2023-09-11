/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzz;

/**
 *Clase que extiende de Beverage
 * @author JORGE
 */
public class HouseBlend extends Beverage{
    
    /**
     * Constructor que establece la descripcion de la bebida a su nombre "House Blend"
     */
    public HouseBlend(){
        descripcion ="Cafe House Blend";
    }
    
    /**
     * Metodo que devuelve el costo de la bebida
     * @return costo de la bebida
     */
    @Override
    public double costo(){
        return 38.00;
    }
}

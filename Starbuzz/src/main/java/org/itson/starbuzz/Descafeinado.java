/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzz;

/**
 *Clase que extiende de Beverage
 * @author JORGE
 */
public class Descafeinado extends Beverage{
    
    /**
     * Constructor que establece la descripcion de la bebida a su nombre "Descafeinado"
     */
    public Descafeinado(){
        descripcion ="Cafe Descafeinado";
    }
    
    /**
     * Metodo que devuelve el costo de la bebida
     * @return costo de la bebida
     */
    @Override
    public double costo(){
        return 30.00;
    }
}

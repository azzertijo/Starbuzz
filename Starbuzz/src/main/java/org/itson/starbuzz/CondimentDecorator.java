/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzz;

/**
 *Clase abstracta que funge como el decorador que agrega los condimentos a las bebidas
 * @author JORGE
 */
public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;
    
    /**
     * Método abstracto que es implementado por los condimentos para dar la descripcion de estos
     * @return descripcion de los condimentos
     */
    @Override
    public abstract String getDescripcion();
    
    
}

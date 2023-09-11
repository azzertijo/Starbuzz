/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzz;

/**
 *Clase que sirve como base para las demás bebidas
 * @author JORGE
 */
public abstract class Beverage { 
    String descripcion;

    /**
     * Devuelve un texto que descriptivo dependiendo de la bebida y los condimentos
     * @return descripcion de la bebida
     */
    public String getDescripcion(){
        return descripcion;
    }
    
    /**
     * Método abstracto que devuelve el costo dependiendo de la bebida y los condimentos
     * @return costo de la bebida
     */
    public abstract double costo();
}

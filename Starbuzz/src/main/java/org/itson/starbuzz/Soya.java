/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzz;

/**
 * Clase que representa un condimento y extiende de CondimentDecorator 
 * @author JORGE
 */
public class Soya extends CondimentDecorator{

    /**
     * Constructor que recibe una bebida y la guarda para poder modificarla
     * @param beverage bebida a modificar
     */
    public Soya(Beverage beverage){
        this.beverage = beverage;
    }
    
    /**
     * Metodo que regresa la descripción de la bebida y añade el condimento correspondiente a la clase
     * @return descripcion de la bebida junto con el condimento
     */
    @Override
    public String getDescripcion() {
       return beverage.getDescripcion()+ " + Soya";
    }
    
    /**
     * Metodo que regresa el costo de la bebida mas el añadido del  precio del condimento 
     * @return costo de la bebida junto con el del condimento
     */
    @Override
    public double costo(){
        double precio = beverage.costo();
        return precio += 15.00;
    }
}

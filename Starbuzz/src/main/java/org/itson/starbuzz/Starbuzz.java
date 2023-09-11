/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.starbuzz;

/**
 *
 * @author JORGE
 */
public class Starbuzz {

    public static void main(String[] args) {
         Beverage bebida = new DarkRoast();
        System.out.println(bebida.getDescripcion() + " $" + bebida.costo());
        
        Beverage bebida1 = new Descafeinado();
        bebida1 = new Soya(bebida1);
        bebida1 = new Chocolate(bebida1);
        bebida1 = new Leche(bebida1);
        System.out.println(bebida1.getDescripcion() + " $" + bebida1.costo());
        
        Beverage bebida2 = new Descafeinado();
        System.out.println(bebida2.getDescripcion() + " $" + bebida2.costo());
        
        Beverage bebida3 = new HouseBlend();
        bebida3 = new CremaBatida(bebida3);
        bebida3 = new Leche(bebida3);
        System.out.println(bebida3.getDescripcion() + " $" + bebida3.costo());
    }
}

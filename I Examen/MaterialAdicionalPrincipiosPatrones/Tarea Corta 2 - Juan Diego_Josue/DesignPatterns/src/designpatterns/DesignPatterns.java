/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import factorymethod.Creator;
import factorymethod.CircleCreator;
import factorymethod.RectangleCreator;
import factorymethod.Shape;
import singleton.Employees;
import singleton.Singleton;

/**
 *
 * @author Juan
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creator creator;
        creator = new CircleCreator();
        
        Shape shape1 = creator.factoryMethod(); //Circulo
        shape1.operation();
        
        creator = new RectangleCreator();
        Shape shape2 = creator.factoryMethod(); //Rectangulo
        shape2.operation();
        
        
        System.out.println("");
        
        
        Singleton singleton = Singleton.getInstance();
        
        Employees emp1 = new Employees("Fernando", 20);
        Employees emp2 = new Employees("Luis", 25);
        
        singleton.addToList(emp1);
        singleton.addToList(emp2);
        
        System.out.println(emp1);
        System.out.println(emp2);
    }
    
}

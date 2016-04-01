/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Singleton {
    private static Singleton instance = null;
    private ArrayList<Employees> list = new ArrayList<>(); //Puede o no ser estatica, ya que solo va a existir un objeto
    
    private Singleton() { //Constructor privado. No se pueden crear objetos de la clase
        
    }
    
    public static Singleton getInstance() {
        if (instance == null) { //Lazy instanciation: si la instancia no se necesita, no sera creada. Es creada cuando se llama al metodo
            instance = new Singleton();
        }
        return instance;
    }
    
    public void addToList(Employees emp) {
        list.add(emp);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

/**
 *
 * @author Jorge
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fair fair = new FruitStore();
        
        Apple apple1 = new Apple(400);
        
        Pear pear1 = new Pear(500);
        
        Watermelon watermelon1 = new Watermelon(1000);
        
        fair.addFruit(apple1);
        fair.addFruit(pear1);
        fair.addFruit(watermelon1);
        
        System.out.println("" + fair.getPrice());
        
    }
    
}

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

public interface Fair {
    
    public double getPrice();
    
    public void addFruit(Fair r);
    
    public void removeFruit(Fair r);
}

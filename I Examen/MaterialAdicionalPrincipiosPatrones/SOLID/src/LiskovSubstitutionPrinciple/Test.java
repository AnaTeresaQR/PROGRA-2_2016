/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Micku
 */
public class Test {

    public void comprobarArea(Rectangle rectangle) {
        
        rectangle.setBase(4);
        rectangle.setHeight(5);
        
        if (rectangle.area() != 20) {
            
        } else {

        }
    }
}

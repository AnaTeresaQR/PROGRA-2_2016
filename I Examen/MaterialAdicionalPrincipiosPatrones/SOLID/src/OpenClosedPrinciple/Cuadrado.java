/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosedPrinciple;

/**
 *
 * @author alelizmu
 */
public class Cuadrado implements Figura{

    int lado;
    
    public int calcularArea() {
       return lado*lado; 
    }

    public int calcularPerimetro() {
       return lado*4;
    }
    
}

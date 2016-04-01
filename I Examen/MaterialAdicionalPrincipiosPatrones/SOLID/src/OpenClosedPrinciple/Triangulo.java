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
public class Triangulo implements Figura{

    int lado;
    int altura;

    public int calcularArea() {
        return (lado*altura)/2;
    }


    public int calcularPerimetro() {
        return lado*3;
    }
    
}

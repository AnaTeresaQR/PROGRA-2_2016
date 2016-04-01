/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploPolimorfismo;

/**
 *
 * @author Edgardo Quirós
 */
public class PruebaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Vehiculo vehiculo = new Carro("Negro");
        vehiculo.mostrarVehiculo();
        System.out.println("*****************");
     Vehiculo vehiculo1 = new Motocicleta("blanco");
        vehiculo1.mostrarVehiculo();
        System.out.println("*****************");
    Vehiculo vehiculo2 = new Bus("verde");
    vehiculo2.mostrarVehiculo();
    }
    
}

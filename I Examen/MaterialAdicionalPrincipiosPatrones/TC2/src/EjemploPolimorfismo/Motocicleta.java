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
public class Motocicleta extends Vehiculo{

    public Motocicleta( String color) {
        super("motocicleta", color, 2);
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("vehiculo: "+super.getTipo()+"\ncolor: "+super.getColor()+"\nruedas: "+super.getRuedas());
    }
    
}

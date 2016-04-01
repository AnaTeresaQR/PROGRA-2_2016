/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author guiselleH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        ToyotaBuilder toyotaBuilder = new ToyotaBuilder();
        FordBuilder fordBuilder = new FordBuilder();
        
        director.setCarBuilder(toyotaBuilder);
        director.createCar();
        Car car = director.getCarBuilder();
        
        System.out.println(car);
        
        director.setCarBuilder(fordBuilder);
        director.createCar();
         car = director.getCarBuilder();
        System.out.println(car);
    }
    
}

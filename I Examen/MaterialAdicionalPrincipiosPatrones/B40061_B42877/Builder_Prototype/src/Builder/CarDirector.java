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
public class CarDirector {
    private CarBuilder carBuilder;
    
    void createCar() {
        carBuilder.create();
        carBuilder.buildTradeMark();
        carBuilder.buildModel();
        carBuilder.buildEngine();
        carBuilder.buildYear();
    }
    
    public void setCarBuilder(CarBuilder cb) {
        carBuilder = cb;
    }
    

    public Car getCarBuilder() {
        return carBuilder.getCar();
    }
}

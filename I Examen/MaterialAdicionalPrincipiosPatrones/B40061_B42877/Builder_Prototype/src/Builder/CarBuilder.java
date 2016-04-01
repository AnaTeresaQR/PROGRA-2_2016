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
public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }
    
    public void create() {
        car = new Car();
    }
    
    public abstract void buildEngine();
    public abstract void buildModel();
    public abstract void buildTradeMark();
    public abstract void buildYear();
    
}

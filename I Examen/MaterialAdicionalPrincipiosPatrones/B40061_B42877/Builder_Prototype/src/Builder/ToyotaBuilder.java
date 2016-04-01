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
public class ToyotaBuilder extends CarBuilder{

    
    public void buildEngine() {
        Engine eng = new Engine();
        eng.setCylinderCapacity(1800);
        eng.setNumberOfCylinders(6);
        car.setEngine(eng);
    }
    @Override
    public void buildModel() {
        car.setModel("corolla");
    }

    @Override
    public void buildTradeMark() {
        car.setTrademark("toyota");
    }

    @Override
    public void buildYear() {
        car.setYear(2000);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.logging.Logger;

/**
 *
 * @author guiselleH
 */
public class Car {
    private String model;
    private String trademark;
    private int year;
    private Engine engine;

    public Car() {
    }

    public Car(String model, String trademark, int year, Engine engine) {
        this.model = model;
        this.trademark = trademark;
        this.year = year;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", trademark=" + trademark + ", year=" + year + ", engine=" + engine + '}';
    }
    
    
}

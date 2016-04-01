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
public class Engine {
    private int cylinderCapacity;
    private int numberOfCylinders;

    public Engine() {
    }

    public Engine(int cylinderCapacity, int numberOfCylinders) {
        this.cylinderCapacity = cylinderCapacity;
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" + "cylinderCapacity=" + cylinderCapacity + ", numberOfCylinders=" + numberOfCylinders + '}';
    }
}

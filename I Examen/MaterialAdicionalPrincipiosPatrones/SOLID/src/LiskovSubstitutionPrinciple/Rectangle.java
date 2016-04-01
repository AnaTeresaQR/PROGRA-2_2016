/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutionPrinciple;

/**
 *
 * @author Micku
 */
public class Rectangle {

    int base;
    int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return base * height;
    }
}

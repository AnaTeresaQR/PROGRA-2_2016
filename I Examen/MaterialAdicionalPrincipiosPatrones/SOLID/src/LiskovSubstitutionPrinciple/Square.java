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
public class Square extends Rectangle {

    public void setHeight(int height) {
        this.height = height;
        this.base = this.height;
    }

    public void setBase(int base) {
        this.height = base;
        this.base = base;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Usuario
 */
public class Fairy extends Character{
    private int heals;

    public Fairy(String name) {
        super(name);
        this.heals = 0;
    }
    
    @Override
    public Character clone(String name) {
        Fairy clon = new Fairy(super.getName());
        clon.heals = this.heals;
        return clon;
    }

    @Override
    public String toString() {
        return super.getName();
    }
    
    
}

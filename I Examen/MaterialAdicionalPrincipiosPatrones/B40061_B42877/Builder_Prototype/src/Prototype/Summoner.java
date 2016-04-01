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
public class Summoner extends Character{
    private int invocation;

    public Summoner() {
    }
    
    
    public Summoner(String name) {
        super(name);
        this.invocation = 1;
    }
    
    @Override
    public Character clone(String name) {
        Summoner clon = new Summoner(super.getName());
        clon.invocation = this.invocation;
        return clon;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}

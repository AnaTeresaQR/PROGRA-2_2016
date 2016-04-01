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
public class SwordsMan extends Character{
    private int damages;

    public SwordsMan(String name) {
        super(name);
        this.damages = 0;
    }
    
    @Override
    public Character clone(String name) {
        SwordsMan clon = new SwordsMan(super.getName());
        clon.damages = this.damages;
        return clon;
    }

    @Override
    public String toString() {
        return super.getName();
    }
    
    
}

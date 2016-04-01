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
public abstract class Character implements CloneCharacter{
    
    private String name;
    private int vitality;
    private int sagase;
    private int force;
    private int inteligence;
    private int agility;

    public Character() {
    }
        
    public Character(String name) {
        this.name = name;
        this.vitality = 55;
        this.sagase = 0;
        this.force = 0;
        this.inteligence = 0;
        this.agility = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public abstract Character clone(String name);
}

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
public class Main {
    public static void main(String[] args) {
        
        /**
         * Fase de creacion de personajes predeterminados
         */
        Character ch1 = new Fairy("Fairy");
        Character ch2 = new SwordsMan("SwordsMan");
        Character ch3 = new Summoner("Summoner");
        
        /**
         * Crea un vector para que el jugador pueda agregar
         * hasta 5 personajes
         */
        Character[] playerVector = new Character[5];
        
        /**
         * Creacion de personajes
         */
        Character chP1 = new Summoner(); 
        Character chP2 = new Fairy("");
        Character chP3 = new SwordsMan("");
          
        chP1 = ch3; //Se crean los personajes a partir de los predeterminados
        chP2 = ch1;
        chP3 = ch2;
        
//        chP1 = ch3.clone(""); //Se copian los personajes a partir de los predeterminados
//        chP2 = ch1.clone("");
//        chP3 = ch2.clone("");
   
        /**
         * Se agregan los personajes creados al vector
         */
        playerVector[0] = chP1;
        playerVector[1] = chP2;
        playerVector[2] = chP3;
        
        /**
         * Imprime los personajes que posee el vector del jugador
         */
        System.out.println("Personajes del jugador");
        for (int i = 0; i < playerVector.length; i++) {
            if(playerVector[i] != null) {
                System.out.println("Personaje:" + playerVector[i].toString());
            }
        }
        
        
        System.out.println(" ");
        System.out.println("Se modifica el nombre del personaje.");
        chP1.setName("Tank"); //Se le modifica el nombre a uno de los personajes
        
        System.out.println("P1 del jugador: " + playerVector[0].toString());
        System.out.println("Predeterminado del sistema: " + ch3.toString());
        
    }
}

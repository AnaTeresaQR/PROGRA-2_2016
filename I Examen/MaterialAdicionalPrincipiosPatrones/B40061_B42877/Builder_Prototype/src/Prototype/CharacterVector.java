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
public class CharacterVector {

    private Character[] vector = new Character[3];
    int count = 0;

    public CharacterVector() {

    }

    public void addCharacter(Character character) {
        if (count < 100) {
            for (int index = 0; index < vector.length; index++) {
                if (vector[index] == null) {
                    count = index;

                    vector[index] = character;

                    count++;
                    break;
                }
            }
        }
    }

    public String printCharacters() {
        String listOfCharacters = "";

        for (int i = 0; i < count; i++) {
            listOfCharacters += "" +  (i+1) + ": " +  vector[i].toString() + "\n";
        }

        return listOfCharacters;
    }

}

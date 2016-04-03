package exercise1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class Test
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Main {

    static Random r = new Random();
    static int random = r.nextInt((10 - 5) + 1) + 5; // create a random value for the size of a set between 5 to 10

    public static void main(String[] args) {

        Sets sets = new Sets(createSetNumbers()); // class with the methods for sets
        Set< Integer> set2 = createSetNumbers(); // create the numbers of the test set

        try {
            // add to set
            sets.add(2);
            sets.add(3);
            sets.add(4);
            sets.add(9);

            // add to set2
            set2.add(7);
            set2.add(5);
            set2.add(2);
            set2.add(9);
        } catch (SetException ex) {
            System.out.println("" + ex.getMessage());
        }

        // PRINT SETS
        System.out.println("Conjunto de clase:\n" + sets.print() + "\n"); // print the principal set
        System.out.println("Conjunto 2:\n" + sets.print(set2)); // print the second(test) set

        // TEST METHODS
        System.out.println("Unión: " + sets.join(set2)); // join between two sets

        System.out.println("Intersección: " + sets.intersection(set2)); // intersection between two sets

        System.out.println("Diferencia entre Set - Set2: " + sets.difference(set2)); // difference between two sets

        try {
            System.out.println("\nSe elimina un número 9 del conjunto: " + sets.remove(9));
            System.out.println("Se verifica si un dato --> 2 se contiene en el conjunto: " + sets.contains(2));
            System.out.println("" + sets.contains(35));

        } catch (SetException ex) {
            System.out.println("\nSe causa excepción:\n" + ex.getMessage());
        }

        try {
            System.out.println("" + sets.remove(-5));
        } catch (SetException ex) {
            System.out.println("\nSe causa excepción:\n" + ex.getMessage());
        }

        try {
            System.out.println("" + sets.add(-10));
        } catch (SetException ex) {
            System.out.println("\nSe causa excepción:\n" + ex.getMessage());
        }

    }

    /**
     * Responsible for adding numbers to a Set or HashSet
     *
     * @return a set with random numbers in it
     */
    public static Set createSetNumbers() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < random; i++) {
            set.add(r.nextInt((20 - 1) + 1) + 1); // add numbers in sets, random values between 1 to 20
        }
        return set;
    }
}

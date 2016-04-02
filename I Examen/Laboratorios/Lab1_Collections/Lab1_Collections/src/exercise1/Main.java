package exercise1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

        //createSetNumbers(); // create the numbers for the main set
        //sets.add(2); sets.add(3); sets.add(4); sets.add(9);
        //set2.add(7); set2.add(5); set2.add(2); set2.add(9);
        // PRINT SETS
        System.out.println("Conjunto de clase:\n" + sets.print() + "\n"); // print the principal set
        System.out.println("Conjunto 2:\n" + sets.print(set2)); // print the second(test) set

        // TEST METHODS
        System.out.println("Uniòn: " + sets.join(set2)); // join between two sets

        System.out.println("Intersección: " + sets.intersection(set2)); // intersection between two sets

        System.out.println("Diferencia entre Set - Set2: " + sets.difference(set2)); // difference between two setsF
    }

    /**
     * Responsible for adding numbers to a Set or HashSet
     *
     * @param set, the set where numbers are added
     */
    public static Set createSetNumbers() {
        Set< Integer> set = new HashSet<>();
        for (int i = 0; i < random; i++) {
            set.add(r.nextInt((20 - 1) + 1) + 1); // add numbers in sets, random values between 1 to 20
        }
        return set;
    }
}

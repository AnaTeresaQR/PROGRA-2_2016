package exercise1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sets sets = new Sets();
        Random r = new Random();
        int random = r.nextInt((10 - 5) + 1) + 5;

        for (int i = 0; i < random; i++) {
            sets.add(r.nextInt((20 - 1) + 1) + 1);

        }
        System.out.println("Conjunto de clase:\n" + sets.print() + "\n");

        Set< Integer> set2 = new HashSet<>();

        for (int i = 0; i < random; i++) {
            set2.add(r.nextInt((20 - 1) + 1) + 1);
        }

        System.out.println("Conjunto 2:\n" + sets.print(set2));

        System.out.println("Join: " + sets.join(set2));

        System.out.println("Intersección: " + sets.intersection(set2));
    }
}

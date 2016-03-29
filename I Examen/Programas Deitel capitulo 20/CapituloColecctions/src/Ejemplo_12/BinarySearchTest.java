package Ejemplo_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class BinarySearchTest {

    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "black", "yellow",
            "purple", "tan", "pink"};

        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); // ordena el ArrayList
        System.out.printf("Ordena el ArrayList: %s\n", list);

        // busca la lista por varios valores
        printSearchResults(list, colors[3]); // primer elemento
        printSearchResults(list, colors[0]); // medio 
        printSearchResults(list, colors[7]); // último elemento
        printSearchResults(list, "aqua"); // de más abajo
        printSearchResults(list, "gray"); // no existe
        printSearchResults(list, "teal"); // no existe

    }

    // búsqueda y desplega resultado
    private static void printSearchResults(List<String> list, String key) {

        int result = 0;
        System.out.printf("\nSearching for: %s\n", key);
        // la búsqueda solo se puede realizar con una lista ordenada
        result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d\n", result);
        } else {
            System.out.printf("Not found (%d)\n", result);
        }
    }

}

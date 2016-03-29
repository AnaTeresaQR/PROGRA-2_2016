package Ejemplo_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * métodos de collections, addAll, frequency and disjoint
 *
 * @author
 */
public class Algorithms2 {

    public static void main(String[] args) {

        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black"); // se añade "black" al final de la lista2
        list2.add("gred"); // se añade "red" al final de la lista2
        list2.add("green"); // se añade "green" al final de la lista2

        System.out.println("Antes de addAll, list2 contiene: ");

        // despliega elementos en lista2
        for (String s : list2) {
            System.out.printf("%s  ", s);
        }

        // verifica si list1 y list2 tienen elementos en común
        boolean disjoint = Collections.disjoint(list1, list2);
        System.out.printf("list1 y list2 %s elementos en común\n", disjoint ? "no  tiene" : "tiene");

        Collections.addAll(list2, colors); // agrega colores Strings a la lista2
        System.out.println("\nDespués de addAll, list2 contiene: ");

        // despliega elementos en lista2
        for (String s : list2) {
            System.out.printf("%s  ", s);
        }

        // obtener la frecuencia del rojo en la lista
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("\nFrecuencia del rojo en la lista2 cantidad: %d\n", frequency);

    }
}

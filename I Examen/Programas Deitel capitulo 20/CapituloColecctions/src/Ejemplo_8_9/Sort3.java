package Ejemplo_8_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class Sort3 {

    public static void main(String[] args) {

        List<Time2> list = new ArrayList<>(); // se crea la lista

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.printf("Elementos sin ordenar:\n%s\n", list);

        // ordena en orden usando un comparator
        Collections.sort(list, new ComparadorTiempo());

        // imprime la lista de elementos
        System.out.printf("Elementos de la lista ordenados:\n%s\n", list);
    }

}

package Ejemplo_7;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author
 */
public class Ordenamiento2 {

    private static final String conjuntos[]
            = {"Corazones", "Diamantes", "Trebol", "Espadas"};

    // imprime los elementos del objeto list
    public void imprimirElementos() {
// se crea y desplega una lista que contiene los conjuntos de los elementos del arreglo
        List< String> lista = Arrays.asList(conjuntos);

        // imprime los elementos del objeto List
        System.out.printf("Elementos del arreglo desordenados: \n%s\n", lista);

        // ordena en forma descendente, utilizando un objeto comparator
        Collections.sort(lista, Collections.reverseOrder());

        // imprime los elementos del objeto list
        System.out.printf("Elemento de lista ordenados: \n%s\n", lista);
    } // fin del metodo imprimir elementos

    public static void main(String[] args) {

        Ordenamiento2 ordenamiento = new Ordenamiento2();
        ordenamiento.imprimirElementos();

    }

}

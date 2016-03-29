package Ejemplo_6;

/**
 *
 * @author
 */
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento1 {

    private static final String conjuntos[] = {"Corazones", "Diamantes", "Trebol", "Espadas"};

    //muestra los elementos del arreglo
    public void imprimirElementos() {
        // se crea y desplega una lista que contiene los conjuntos de los elementos del arreglo
        List<String> lista = Arrays.asList(conjuntos); // crea objeto list
        // imprime lista
        System.out.printf("Elementos del arreglo desordenados:\n%s\n", lista);
        Collections.sort(lista); // ordena ArrayList
        // imprime lista
        System.out.printf("Elementos del arreglo ordenados:\n%s\n", lista);
    } // fin del método imprimirElementos

    public static void main(String[] args) {
        Ordenamiento1 orden1 = new Ordenamiento1();
        orden1.imprimirElementos();
    } // fin del main
} //fin de clase

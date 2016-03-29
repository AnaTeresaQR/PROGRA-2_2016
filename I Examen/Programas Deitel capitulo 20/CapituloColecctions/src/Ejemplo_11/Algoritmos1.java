package Ejemplo_11;

/**
 *
 * @author
 */
// uso de los algoritmos reverse, fill, copy, min y max
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Algoritmos1 {

    private Character[] letras = {'P', 'C', 'M'};
    private Character[] copiaLetras;
    private List<Character> lista;
    private List<Character> copiaLista;

    // crea un objeto List y lo manipula con los métodos de Collections
    public Algoritmos1() {
        lista = Arrays.asList(letras); // obtiene el objeto List

        // crea una copia de la lista de un array de 3 elementos
        copiaLetras = new Character[3];
        copiaLista = Arrays.asList(copiaLetras); // vista List de copiaLetras

        System.out.println("Lista inicial: ");
        imprimir(lista);

        Collections.reverse(lista); // invierte el orden
        System.out.println("\nDespués de llamar a reversa: ");
        imprimir(lista);

        // copia el contenido de lista en una copia de la lista
        Collections.copy(copiaLista, lista); // copia el objeto List
        System.out.println("\nDespués de copy: ");
        imprimir(copiaLista);

        // llena la lista con R´s
        Collections.fill(lista, 'R'); // llena la lista con Rs
        System.out.println("\nDespués de llamar a fill: ");
        imprimir(lista);
    } //fin constructor
    // imprime la información del objeto List

    private void imprimir(List<Character> refLista) {
        System.out.print("La lista es: ");
        for (Character elemento : refLista) {
            System.out.printf("%s ", elemento);
        }
        System.out.printf("\nMax: %s", Collections.max(refLista));
        System.out.printf("  Min: %s\n", Collections.min(refLista));
    } // Fin de imprimir

    public static void main(String[] args) {
        new Algoritmos1();
    } // fin de main

} // fin de clase

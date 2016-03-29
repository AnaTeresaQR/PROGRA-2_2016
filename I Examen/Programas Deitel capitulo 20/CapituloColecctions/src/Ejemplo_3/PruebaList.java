package Ejemplo_3;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author
 */
public class PruebaList {

    // Por convencion todos los elementos final son con mayuscula
    //se agregan elementos color a la lista 1
    private static final String colores[]
            = {"NEGRO", "AMARILLO", "VERDE", "AZUL", "VIOLETA", "PLATEADO"};

    // se agregan elementos color 2 a la lista 2
    private static final String colores2[]
            = {"DORADO", "BLANCO", "CAFE", "AZUL", "GRIS", "PLATEADO"};

    // Establece y manipula objetos LinkedList
    public PruebaList() {

        List< String> lista1 = new LinkedList<>();
        List< String> lista2 = new LinkedList<>();

        // Agrega elementos a la lista enlace
        for (String color : colores) {
            lista1.add(color);
        }

        for (String color : colores2) {
            lista2.add(color);
        }

        // Concatena o une las listas
        lista1.addAll(lista2);

        // Libera recursos
        lista2 = null;

        // Imprime los elementos de lista1
        imprimirLista(lista1);

        converToLowercaseStrings(lista1);// convierte la cadena a minúsculas
        imprimirLista(lista1);

        System.out.print("\nEliminado elementos 4 a 6...");
        eliminarElementos(lista1, 4, 7);// remueve elementos 4-6 de la lista
        imprimirLista(lista1);
        imprimirListaInversa(lista1); // imprime la lista en orden reversa
    }

    public void imprimirLista(List< String> lista) {
        System.out.println("\nLista: ");

        for (String color : lista) {
            System.out.printf("%s ", color);

        }

        System.out.println();
    }

    // localizar los objs Strings y convertirlos en lowercase
    private void converToLowercaseStrings(List< String> lista) {

        ListIterator< String> iterador = lista.listIterator();

        while (iterador.hasNext()) {

            String color = iterador.next(); // obtiene el elemento
            iterador.set(color.toLowerCase()); // convierte en minúsculas

        }
    }

    // obtiene la sublista y usa el método clear para eliminar elementos de la sublista
    private void eliminarElementos(List< String> lista, int inicio, int fin) {

        // Elimina los elementos
        lista.subList(inicio, fin).clear();
    }

    // imprime la lista al reverso
    private void imprimirListaInversa(List< String> lista) {

        ListIterator< String> iterador = lista.listIterator(lista.size());

        System.out.println("\nLista inversa: ");

        // imprime la lista en orden inverso
        while (iterador.hasPrevious()) {
            System.out.printf("%s ", iterador.previous());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new PruebaList();
    }

}

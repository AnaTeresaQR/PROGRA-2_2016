package Ejemplo_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author
 */
public class PruebaCollection {

    private static final String[] colors
            = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};

    private static final String[] removeColors
            = {"ROJO", "BLANCO", "AZUL"};

    public PruebaCollection() {

        List< String> lista = new ArrayList<>();
        List< String> eliminarLista = new ArrayList<>();

        // Los dos siguientes ciclos son exactamente iguales
        // Su sintaxis cambia
        // Porque cuando el for solo tiene una instruccion se puede manejar sin llaves
        // Agrega los elementos en el arreglo colores a la lista
        for (String color : colors) {
            lista.add(color);// agrega colores al final de la lista
        }

        // Agrega los elementos en eliminarColores a eliminarLista
        for (String color : removeColors) {
            eliminarLista.add(color);
        }

        System.out.println("ArrayList: ");

        // Imprime en pantalla el contenido de la lista
        for (int cuenta = 0; cuenta < lista.size(); cuenta++) {
            System.out.printf("%s ", lista.get(cuenta));
        }

        // Elimina los colores contenidos en eliminarLista
        eliminarColores(lista, eliminarLista);

        System.out.println("\n\nArrayList despues de llamar a eliminarColores: ");

        // imprime en pantalla el contenido de la lista
        for (String color : lista) {
            System.out.printf("%s ", color);

        }
    } // Fin del constructor

    // Elimina  de colecccion1 los colores especificados en coleccion2
    private static void eliminarColores(Collection< String> coleccion1, Collection< String> coleccion2) {

        // Obtiene el iterador, que sirve para iterar en el contenido
        Iterator< String> iterador = coleccion1.iterator();

        // itera mientras la coleccion tenga elementos
        while (iterador.hasNext()) {

            if (coleccion2.contains(iterador.next())) {
                iterador.remove(); // Elimina el color actual

            }

        }

    } // Fin del m'etodo eliminarColores

    public static void main(String[] args) {

        // Esto significa que se ejecuta nada m'as el constructor de la clase
        new PruebaCollection();
    }

}

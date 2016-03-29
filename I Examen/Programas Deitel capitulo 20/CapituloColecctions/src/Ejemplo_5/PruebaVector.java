package Ejemplo_5;

import java.util.Vector;
import java.util.NoSuchElementException;

public class PruebaVector {

    private static final String colores[] = {"rojo", "blanco", "azul"};

    public PruebaVector() {
        Vector<String> vector = new Vector<String>();
        imprimirVector(vector); // imprime el vector

        // agrega elementos  al vector
        for (String color : colores) {
            vector.add(color);
        }
        imprimirVector(vector); // imprime el vector
        //imprime los elementos primero y último
        try {
            System.out.printf("Primer elemento: %s\n", vector.firstElement());
            System.out.printf("último elemento: %s\n", vector.lastElement());
        } // fin try
        // atrapa la excepción si el vector está vacío
        catch (NoSuchElementException excepcion) {
            excepcion.printStackTrace();
        } // fin catch
        // ¿el vector contiene "rojo"?
        if (vector.contains("rojo")) {
            System.out.printf("se encontró \"rojo\"en el índice %d\n\n", vector.indexOf("rojo"));
        } else {
            System.out.println("no se encontró \"rojo\"\n");
        }

        vector.remove("rojo"); // elimina la cadena "rojo"
        System.out.println("se eliminó \"rojo\"");
        imprimirVector(vector); // imprime el vector
        // ¿el vector contiene "rojo" después de la operación de eliminación?
        if (vector.contains("rojo")) {
            System.out.printf("se encontró \"rojo\"en el índice %d\n", vector.indexOf("rojo"));
        } else {
            System.out.println("no se encontró \"rojo\"");
        }
        // imprime el tamaño y la capacidad del vector
        System.out.printf("\nTamaño: %d\nCapacidad: %d\n", vector.size(), vector.capacity());

    } // fin del constructor

    private void imprimirVector(Vector<String> vectorAImprimir) {
        if (vectorAImprimir.isEmpty()) {
            System.out.print("el vector está vacío"); // vectorAImprimir está vacío
        } else // itera a través de los elementos 
        {
            System.out.print("el vector contiene: ");

            //imprime los elementos
            for (String elemento : vectorAImprimir) {
                System.out.printf("%s ", elemento);
            }
        } // fin else
        System.out.println("\n");
    } // fin del método imprimirVector

    public static void main(String[] args) {
        new PruebaVector(); // crea obejto y llama a su constructor
    } // fin main
} // fin de la clase

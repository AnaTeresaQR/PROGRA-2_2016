package Ejemplo_4;

import java.util.LinkedList;
import java.util.Arrays;

public class UsoToArray {
// el constructor crea objeto LinkedList, le agrega elementos y lo convierte en arreglo

    public UsoToArray() {
        String colors[] = {"negro", "azul", "amarillo"};

        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colors));

        enlaces.addLast("rojo"); // lo agrega como último elemento
        enlaces.add("rosa"); // lo agrega al final
        enlaces.add(3, "verde"); // lo agrega en el tercer índice
        enlaces.addFirst("cyan"); // lo agrega como primer elemento

        // obtiene los elementos de linkedList como un arreglo
        colors = enlaces.toArray(new String[enlaces.size()]);
        System.out.println("colores: ");

        for (String color : colors) {
            System.out.println(color);
        }
    } // fin del constructor

    public static void main(String[] args) {
        new UsoToArray();
    } // fin del main

} // fin de la clase

package Ejemplo_1;

import java.util.Arrays;

/**
 *
 * @author
 */
public class UsoArrays {

    private int arregloInt[] = {1, 2, 3, 4, 5, 6};
    private double arregloDouble[] = {8.4, 9.3, 0.2, 7.9, 3.4};
    private int arregloIntLleno[], copiaArregloInt[];

    public UsoArrays() {

        arregloIntLleno = new int[10];
        copiaArregloInt = new int[arregloInt.length];

        Arrays.fill(arregloIntLleno, 7); // Llena todo con 7s
        Arrays.sort(arregloDouble); // Ordena el arreglo double en forma ascendente

        // Copia el arreglo arregloInt en el arreglo copiaArregloInt
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);

    } // Fin del constructor

    // Imprime los valores en cada arreglo
    public void imprimirArreglos() {

        System.out.print("arregloDouble: ");
        for (double valorDouble : arregloDouble) {
            System.out.printf("%.1f ", valorDouble);
        }

        System.out.print("\narregloInt: ");
        for (int valorInt : arregloInt) {
            System.out.printf("%d ", valorInt);

        }

        System.out.print("\narregloIntLleno: ");
        for (int valorInt : arregloIntLleno) {
            System.out.printf("%d ", valorInt);

        }

        System.out.print("\ncopiaArregloInt: ");
        for (int valorInt : copiaArregloInt) {
            System.out.printf("%d ", valorInt);

        }

        System.out.println("\n");
    } // Fin del m'etodo imprimirArreglos

    // Busca un valor en el arreglo arregloInt
    public int buscarInt(int valor) {

        return Arrays.binarySearch(arregloInt, valor);
    }

    // comparar el contenido del arreglo
    public void imprimirIgual() {

        boolean b = Arrays.equals(arregloInt, copiaArregloInt);

        System.out.printf("arregloInt %s arregloIntLleno\n", (b ? "==" : "!="));

    } // fin del m'etodo imprimirIgualdad

    public static void main(String[] args) {

        UsoArrays usoArrays = new UsoArrays();

        usoArrays.imprimirArreglos();
        usoArrays.imprimirIgual();

        int consulta = 5;
        int ubicacion = usoArrays.buscarInt(consulta);

        if (ubicacion >= 0) {
            System.out.printf("Se encontro el %d en el elemento %d de arregloInt\n", consulta, ubicacion);

        } else {

            System.out.printf("No se encontro el %d en el arregloInt", consulta);

        }

        consulta = 8763;
        ubicacion = usoArrays.buscarInt(consulta);

        if (ubicacion >= 0) {

            System.out.printf("Se encontro el %d en el elemento %d en arregloInt\n", consulta, ubicacion);
        } else {

            System.out.printf("No se encontro el %d en arregloInt\n", consulta);

        }
    }

} // Fin de la clase

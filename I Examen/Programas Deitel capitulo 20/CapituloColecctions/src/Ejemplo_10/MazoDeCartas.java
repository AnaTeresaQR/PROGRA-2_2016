package Ejemplo_10;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author
 */
// clase para representar una tarjeta de una baraja de cartas
class Carta {

    public static enum Cara {

        As, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Diez, Jota, Quina, Rey
    };

    public static enum Conjunto {

        trebol, Diamantes, Corazones, Espadas
    };

    private final Cara cara; // cara de la carta
    private final Conjunto conjunto;// simbolo de la carta

    public Carta(Cara caraCarta, Conjunto simboloCarta) {

        cara = caraCarta;
        conjunto = simboloCarta;

    }

    public Cara obtenerCara() {
        return cara;
    }

    public Conjunto obtenerSimbolo() {
        return conjunto;
    }
// retorna una representación de la carta en formato String

    @Override
    public String toString() {
        return String.format("%s de %s", cara, conjunto);
    }
}

public class MazoDeCartas {

    private List< Carta> lista; // declara una lista que almacenará cartas

    // Establece mazo de objetos carta y baraja y revuelve
    public MazoDeCartas() {

        Carta[] mazo = new Carta[52];
        int contador = 0; // numero de cartas

        // Llena el mazo con objetos Carta
        for (Carta.Conjunto suit : Carta.Conjunto.values()) {

            for (Carta.Cara cara : Carta.Cara.values()) {

                mazo[contador] = new Carta(cara, suit);
                contador++;
            }
        } // Fin for

        // Obtiene objeto list
        lista = Arrays.asList(mazo); // maneja el vector Carta como una lista

        // Baraja el mazo
        Collections.shuffle(lista);
    } // Fin del constructor

    // imprime el mazo
    public void imprimirCartas() {

        // Muestra las 52 cartas en dos columnas
        for (int i = 0; i < lista.size(); i++) {

            System.out.printf("%-19s%s", lista.get(i),
                    ((i + 1) % 4 == 0) ? "\n" : "\t");
        }
    }

    public static void main(String[] args) {
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
    }

}

package Ejemplo_8_9;

/**
 * Comparator personalizado que compara 2 objetos de la clase tiempo2
 *
 * @author
 */
import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Time2> {

    @Override
    public int compare(Time2 tiempo1, Time2 tiempo2) {
        int compararHora = tiempo1.obtenerHora() - tiempo2.obtenerHora(); // compara la hora

        //evalua la hora primero
        if (compararHora != 0) {
            return compararHora;
        }

        int comparaMinuto = tiempo1.obtenerMinuto() - tiempo2.obtenerMinuto(); // compara el minuto

        // después evalúa el minuto
        if (comparaMinuto != 0) {
            return comparaMinuto;
        }

        int compararSegundo = tiempo1.obtenerSegundo() - tiempo2.obtenerSegundo(); // compara el segundo

        return compararSegundo; // devuelve el resultado de comparar los segundos
    } // fin del método compare

    public static void main(String[] args) {

        ComparadorTiempo ct = new ComparadorTiempo();

        int resultado = ct.compare(new Time2(6, 20, 54), new Time2(9, 20, 54));

        System.out.println("*  0 = tiempo igual *"
                + "\n* -1 = tiempo1 < tiempo2 *"
                + "\n* >1 = tiempo1 > tiempo2 *"
                + "\n\nEl resultado de comparar 2 tiempos: \n" + resultado);
    }

} // fin de la clase

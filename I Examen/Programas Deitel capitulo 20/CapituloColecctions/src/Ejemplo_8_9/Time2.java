package Ejemplo_8_9;

import java.sql.Time;

/**
 *
 * @author Ana Teresa
 */
public class Time2 {

    private Time time;

    public Time2(int hora, int minuto, int segundo) {
        time = new Time(hora, minuto, segundo);
    }

    public int obtenerHora() {
        return time.getHours();
    }

    public int obtenerMinuto() {
        return time.getMinutes();
    }

    public int obtenerSegundo() {
        return time.getSeconds();
    }

    public String crearTiempo() {
        String s = " AM";
        if (time.getHours() >= 12) {
            s = " PM";
        }
        return time.toString() + s;
    }

    @Override
    public String toString() {
        return " " + crearTiempo();
    }

}

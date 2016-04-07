package exercise2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        try {
            AbstractBuilder ab = new ConcreteBuilder();
            Director director = new Director();

            BossProyect boss = new BossProyect("Tere", "Quesada", "207410170");

            Date d1 = createDate(2010, 7, 29);

            ArrayList<Date> array = new ArrayList<>();
            array.add(d1);

            Proyect p1 = director.createProyect(ab, "Proyecto 1", boss, 2, array);
        } catch (ProyectException ex) {
            System.out.println("" + ex.getMessage());
        }

    }

    public static Date createDate(int year, int month, int date) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, date);
        return c.getTime();
    }
}

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
//----------------------------------------------------------------------------------------------------------
            BossProyect boss = new BossProyect("Tere", "Quesada", "207410170");

            Date d1 = createDate(2010, 7, 29);
            ArrayList<Date> array = new ArrayList<>();
            array.add(d1);

            Proyect p1 = director.createProyect(ab, "Proyecto 1", boss, 2, array);
            System.out.println("" + p1.toString());

            //--------------------------------------------------------------------------------------------------
            Date d2 = createDate(2011, 6, 9);
            Date d2_1 = createDate(2011, 6, 17);
            Date d2_2 = createDate(2011, 6, 20);
            
            ArrayList<Date> array2 = new ArrayList<>();
            array2.add(d2);
            array2.add(d2_1);
            array2.add(d2_2);

            BossProyect boss2 = new BossProyect("Tere2", "Quesada2", "20202222");
            Proyect p2 = director.createProyect(ab, "Proyecto 2", boss2, 4, array2);
            System.out.println("" + p2.toString());

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

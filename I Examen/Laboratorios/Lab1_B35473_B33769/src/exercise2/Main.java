package exercise2;

import java.util.Calendar;
import java.util.Date;

/**
 * Test the exercise
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {

        PrinterQueue printer = new PrinterQueue();

        //String name, Date date, int type
        Document d1 = new Document("Doc1", createDate(29, 6, 2010, 13, 56), DocumentPriority.LOCAL.getPriority());
        Document d2 = new Document("Doc2", createDate(27, 5, 2011, 8, 25), DocumentPriority.NETWORK.getPriority());
        Document d3 = new Document("Doc3", createDate(15, 3, 2013, 10, 45), DocumentPriority.TEST.getPriority());
        Document d4 = new Document("Doc4", createDate(8, 2, 2012, 6, 30), DocumentPriority.LOCAL.getPriority());

        Document d5 = new Document("Doc5", createDate(4, 9, 2010, 17, 15), DocumentPriority.TEST.getPriority());
        Document d6 = new Document("Doc6", createDate(9, 9, 2009, 11, 25), DocumentPriority.NETWORK.getPriority());
        Document d7 = new Document("Doc7", createDate(2, 9, 2012, 13, 55), DocumentPriority.LOCAL.getPriority());

        Document d8 = new Document("Doc8", createDate(25, 9, 2010, 12, 35), DocumentPriority.TEST.getPriority());
        Document d9 = new Document("Doc9", createDate(16, 9, 2011, 17, 27), DocumentPriority.NETWORK.getPriority());
        Document d10 = new Document("Doc10", createDate(24, 9, 2015, 19, 20), DocumentPriority.TEST.getPriority());

        System.out.println("Se añaden 4 a la cola......\n");
        printer.offer(d1);
        printer.offer(d2);
        printer.offer(d3);
        printer.offer(d4);

        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");

        System.out.println("Se añaden 3 a la cola......\n");
        printer.offer(d5);
        printer.offer(d6);
        printer.offer(d7);

        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");

        System.out.println("Se añaden 3 a la cola......\n");
        printer.offer(d8);
        printer.offer(d9);
        printer.offer(d10);

        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
        System.out.println("Imprimiendo : -> " + printer.poll() + "\n");
    }

    /**
     * It is responsible for creating a date with day, month and year
     *
     * @param date,the date to be created
     * @param month, the month to be created
     * @param year, the year to be created
     * @param hour, the hour to be created
     * @param minute, the minute to be created
     * @return a date
     */
    public static Date createDate(int date, int month, int year, int hour, int minute) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, date, hour, minute);
        return c.getTime();
    }

}

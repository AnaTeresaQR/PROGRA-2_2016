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

        Printer printer = new Printer();

        //int id, String name, Date date, int type
        Document d1 = createDocument(1, "Doc1", createDate(29, 6, 2010, 13, 56), DocumentPriority.LOCAL.getPriority());
        Document d2 = createDocument(2, "Doc2", createDate(27, 5, 2011, 8, 25), DocumentPriority.NETWORK.getPriority());
        Document d3 = createDocument(3, "Doc3", createDate(15, 3, 2013, 10, 45), DocumentPriority.TEST.getPriority());
        Document d4 = createDocument(4, "Doc4", createDate(8, 2, 2012, 6, 30), DocumentPriority.LOCAL.getPriority());
        Document d5 = createDocument(5, "Doc5", createDate(4, 9, 2010, 17, 15), DocumentPriority.TEST.getPriority());

        // 1(1)-2(2)-3(3)-4(4)-5(5)
        // 3-5-1-4-2
        // 3-5-4-1-2
        // 1
        // 1-2
        // 3-1-2 // 1-2-3
        // 3-4-1-2
        // 3-5-4-1-2
        
        // ADDS DOCUMENTS IN THE QUEUE
        printer.offerDocument(d1);
        printer.offerDocument(d2);
        printer.offerDocument(d3);
        printer.offerDocument(d4);
        printer.offerDocument(d5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Imprimiendo : -> " + printer.despatch() + "\n");
        }

    }

    public static Document createDocument(int id, String name, Date date, int type) {
        Document doc;
        return doc = new Document(id, name, date, type);
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

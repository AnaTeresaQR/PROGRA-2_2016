package exercise2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
    }

    public static Date createDate(int year, int month, int date) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, date);
        return c.getTime();
    }
}

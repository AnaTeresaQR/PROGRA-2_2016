package exercise3;

import java.util.Comparator;

/**
 * Compare the items by salary order falling
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class ComparatorEmployeeSalary implements Comparator<Employee> {

    /**
     * According to the salary order falling compares its two arguments for
     * order. Returns a negative integer if this {@code String} object
     * lexicographically precedes the argument string. The result is a positive
     * integer if this {@code String} object lexicographically follows the
     * argument string. The result is zero if the strings are equal
     *
     * @param e1, employee number 1 (e1) to be compared
     * @param e2, employee number 2 (e2)
     */
    @Override
    public int compare(Employee e1, Employee e2) {
        //Return the result of the compare
        return new Integer(e2.getSalary()).compareTo(e1.getSalary());
    }
}

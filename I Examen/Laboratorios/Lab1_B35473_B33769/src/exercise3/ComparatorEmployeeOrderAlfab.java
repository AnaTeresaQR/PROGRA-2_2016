package exercise3;

import java.util.Comparator;

/**
 * Compare the items by alphabetical order
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class ComparatorEmployeeOrderAlfab implements Comparator<Employee> {

    /**
     * According to the alphabetical order compares its two arguments for order.
     * Returns a negative integer if this {@code String} object
     * lexicographically precedes the argument string. The result is a positive
     * integer if this {@code String} object lexicographically follows the
     * argument string. The result is zero if the strings are equal
     *
     * @param e1, employee number 1 (e1) to be compared
     * @param e2, employee number 2 (e2)
     */
    @Override
    public int compare(Employee e1, Employee e2) {

        //Concat the names of the employes to work with the full name
        String completeNameE1 = e1.getLastName().concat(e1.getSecondLastName()).concat(e1.getFirstName()).concat(e1.getSecondName());
        String completeNameE2 = e2.getLastName().concat(e2.getSecondLastName()).concat(e2.getFirstName()).concat(e2.getSecondName());

        //Return a value positive or negative with the full names
        return completeNameE1.compareTo(completeNameE2);
    }
}

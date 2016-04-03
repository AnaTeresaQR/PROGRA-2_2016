/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Comparator;

/**
 * Compare the items by Social Securuty
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class ComparatorEmployeeSocialSecurity implements Comparator<Employee> {

    /**
     * According to the Social Security compares its two arguments for order.
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
        //Return the result of the compare
        return e1.getSocialSecurity().compareTo(e2.getSocialSecurity());
    }
}

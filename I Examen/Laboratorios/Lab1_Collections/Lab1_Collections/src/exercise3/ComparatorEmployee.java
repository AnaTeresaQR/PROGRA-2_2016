/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Comparator;

/**
 *
 * @author Ana Teresa
 */
public class ComparatorEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return new Integer(e2.getSalary()).compareTo(e1.getSalary());
    }
}

package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Class that contains methods of the program
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class TreeMapManager {

    private Map<String, Employee> treeMap;

    public TreeMapManager(TreeMap<String, Employee> tmap) {
        this.treeMap = new TreeMap<>();
    }

    /**
     * Method that adds items to the Map
     *
     * @param employee, receives the emplyee to add
     */
    public void add(Employee employee) {
        if (!search(employee.getSocialSecurity()) && !treeMap.containsKey(employee.getId())) { //Social Security and Id must be different to add
            treeMap.put(employee.getId(), employee);
        }
    }

    /**
     * Method that eliminate items to the queue
     *
     * @param id, receives the id to eliminate the key and the full employee
     */
    public void eliminate(String id) {
        treeMap.remove(id);
    }

    /**
     * Method that print the queue
     *
     * @return a String with the ArrayList
     */
    public String print() {
        String message = "";
        Iterator< Integer> iterator;
        List list = new ArrayList(treeMap.values());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    /**
     * Method that chech if the SocialSecurity is already in the queue
     *
     * @param number, receives the number
     * @return true if number of Social Security id already in queue
     */
    public boolean search(String number) {
        Iterator< String> iterator;
        Set<String> set = treeMap.keySet();
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee emp = treeMap.get(iterator.next());

            if (number.equals(emp.getSocialSecurity())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method that print the queue orderer by Salary falling
     *
     * @return a String with the ArrayList in order
     */
    public String orderSalary() {
        String message = "";
        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new ComparatorEmployeeSalary());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    /**
     * Method that print the queue orderer by Social Security
     *
     * @return a String with the ArrayList in order
     */
    public String orderSocialSecurity() {
        String message = "";
        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new ComparatorEmployeeSocialSecurity());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    /**
     * Method that print the queue in aphabetical order
     *
     * @return a String with the ArrayList in order
     */
    public String orderAlfab() {
        String message = "";
        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new ComparatorEmployeeOrderAlfab());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }
}

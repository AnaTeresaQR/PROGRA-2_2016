package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class TreeMapManager {

    private Map<String, Employee> treeMap;

    public TreeMapManager(TreeMap<String, Employee> tmap) {
        this.treeMap = new TreeMap<>();
    }

    public void add(Employee employee) {
        if (!search(employee.getSocialSecurity()) && !treeMap.containsKey(employee.getId())) {
            treeMap.put(employee.getId(), employee);
        }
    }

    public void eliminate(String id) {
        treeMap.remove(id);
    }
    
    

    public String print() {
        String message = "";
        Iterator< Integer> iterator;
        List list = new ArrayList(treeMap.values());
        //  Set set = treeMap.entrySet();
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    public boolean search(int number) {
        Iterator< String> iterator;
        Set<String> set = treeMap.keySet();

        iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee emp = treeMap.get(iterator.next());

            if (number == emp.getSocialSecurity()) {
                return true;
            }
        }
        return false;
    }

    public String orderSalary() {
        String message = "";

        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new ComparatorEmployee());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    public String orderSocialSecurity() {
        String message = "";

        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return new Integer(e1.getSocialSecurity()).compareTo(e2.getSocialSecurity());
            }
        });
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    public String orderAlfab() {
        String message = "";
        Iterator< Integer> iterator;

        List list = new ArrayList<>(treeMap.values());
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.getLastName().compareTo(e2.getLastName()) == 0) {
                    return e1.getSecondLastName().compareTo(e2.getSecondLastName());
                } else {
                    return e1.getLastName().compareTo(e2.getLastName());
                }

            }
        });
        iterator = list.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }
}

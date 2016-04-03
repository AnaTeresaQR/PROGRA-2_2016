package exercise1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * The class has the main methods for the set of numbers
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Sets {

    private Set< Integer> set; // set of numbers positive integers

    public Sets() {

        set = new HashSet<>(); // initialize the set of numbers

    }

    public Sets(Set<Integer> set) {
        this.set = set;
    }

    /**
     * Adds a number in the set if is bigger than 0 or equals
     *
     * @param value, number to add
     * @return, true if was added, false otherwise
     * @throws exercise1.SetException when it is not possible to add the number
     * to set
     */
    public boolean add(int value) throws SetException {

        if (value >= 0) {
            return set.add(value);
        }
        throw new SetException("Problemas al imprimir, la razón: "
                + "\nNo es posible añadir el número --> " + value + " al conjunto."
                + " Debe ser un número entero positivo");
    }

    /**
     * Remove a number in the set
     *
     * @param value, number to remove
     * @return, true if was remove, false otherwise
     * @throws exercise1.SetException when it is not possible to eliminate the
     * number of set, because there is not in the set or is not a permitted data
     */
    public boolean remove(int value) throws SetException {
        if (value >= 0 && contains(value)) {
            return set.remove(value);
        }
        throw new SetException("No es posible eliminar el número del conjunto, la razón: "
                + "\nPorque no está en el conjunto o no es un dato permitido");
    }

    /**
     * Search in the set a specified number
     *
     * @param value, the number to search
     * @return, true if the set contains the number to search
     * @throws exercise1.SetException when the number does not exist in the set
     */
    public boolean contains(int value) throws SetException {
        if (set.contains(value)) {
            return true;
        }
        throw new SetException("El elemento a encontrar en el conjunto no existe");
    }

    /**
     * Two sets joining handles
     *
     * @param newSet, receives a set to be joined to another
     * @return a third set with the two existing sets together
     */
    public Set join(Set newSet) {
        Set< Integer> setJoin = new HashSet<>(set);

        setJoin.addAll(newSet); // adds the newSet with the main set to another new Set

        return setJoin;

    }

    /**
     * It is responsible for the intersection of two sets
     *
     * @param newSet, receives a set to find the intersection with another
     * @return a third set with the intersection between two sets
     */
    public Set intersection(Set newSet) {
        Set< Integer> setEqual = new HashSet<>();
        Iterator it = set.iterator();

        while (it.hasNext()) { // iterate a set located in the class
            Object temp = it.next(); // get element referenced by iterator
            if (newSet.contains(temp)) { // if the item is in new set
                setEqual.add((Integer) temp); // the number is added to the new set
            }
        }

        return setEqual;
    }

    /**
     * It is responsible for the difference of two sets
     *
     * @param newSet, receives a set to find the difference with another
     * @return the set that contains the difference between Set (in this class)
     * with the set of the parameter
     */
    public Set difference(Set newSet) {
        Set<Integer> setDifference = new HashSet<>(set); // create a new Set equal to the set of the class
        setDifference.removeAll(newSet); //  remove the elements that are in set2
        return setDifference;
    }

    /**
     * Print the set in class
     *
     * @return a set of numbers positive integers
     */
    public String print() {
        String message = "";
        Iterator< Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    /**
     * Print the set to be required
     *
     * @param set, set to be printed
     * @return a set of numbers positive integers
     */
    public String print(Set set) {
        String message = "";
        Iterator< Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

}

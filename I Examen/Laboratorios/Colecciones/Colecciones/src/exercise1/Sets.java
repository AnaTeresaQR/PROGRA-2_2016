package exercise1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author
 */
public class Sets {

    Set< Integer> set;

    public Sets() {

        set = new HashSet<>();

    }

    public boolean add(int value) {

        if (value >= 0) {
            return set.add(value);
        }
        return false;
    }

    public boolean remove(int value) {
        return set.remove(value);
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public Set join(Set newSet) {
        Set< Integer> setJoin = new HashSet<>();

        setJoin.addAll(set);
        setJoin.addAll(newSet);

        return setJoin;

    }

    public Set intersection
        
        (Set newSet) {
        Set< Integer> setEqual = new HashSet<>();
        Iterator< Integer> iterator = newSet.iterator();
        if (set.contains(iterator.next())) {
            setEqual.add(iterator.next());
        }
        return setEqual;
    }

    public String print() {
        String message = "";
        Iterator< Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }

    public String print(Set set) {
        String message = "";
        Iterator< Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            message += iterator.next() + "\n";
        }
        return message;
    }
}

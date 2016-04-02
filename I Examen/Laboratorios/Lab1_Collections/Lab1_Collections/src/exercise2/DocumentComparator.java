package exercise2;

import java.util.Comparator;

/**
 * Compare the items by type of priority
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class DocumentComparator implements Comparator {

    /**
     * According to priority compares its two arguments for order. Returns a
     * negative integer if is less than the second, zero = equals, or a positive
     * integer as the first argument is greater than the second.
     *
     * @param doc1, document number 1 to be compared
     * @param doc2, second document
     */
    @Override
    public int compare(Object doc1, Object doc2) {
        // First: Compare by the type
        int result = (int) (((Document) doc1).getType()
                - ((Document) doc2).getType());

        // If result = 0; we need to order by the counter
        if (result == 0) {
            return (int) (((Document) doc1).getId()
                    - ((Document) doc2).getId());
        } else {
            // If not, return the result
            return result;
        }

    }

}

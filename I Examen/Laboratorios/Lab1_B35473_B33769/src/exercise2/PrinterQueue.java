package exercise2;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class that handles the priority queue with their methods
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class PrinterQueue {

    // The order can vary. 
    private Queue<Document> queue;

    public PrinterQueue() {
        queue = new PriorityQueue<>(new DocumentComparator());
    }

    /**
     * Method that adds items to the queue
     *
     * @param doc, receives the document to add
     * @return true if was added, false otherwise
     */
    public boolean offer(Document doc) {
        return queue.offer(doc);
    }

    /**
     * Method that remove items to the queue, first in first out
     *
     * @return the document removed
     */
    public Document poll() {
        return queue.poll();
    }
}

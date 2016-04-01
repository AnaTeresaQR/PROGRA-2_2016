package exercise2;

/**
 *
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Printer {

    PrinterQueue queue;

    public Printer() {
        queue = new PrinterQueue();
    }

    
    public boolean offerDocument(Document doc) {
        return queue.offer(doc);
    }

    public String despatch() {
        return queue.poll().toString();
    }

}

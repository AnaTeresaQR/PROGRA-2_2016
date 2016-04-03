package exercise2;

/**
 * Class that sets the order of priority
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public enum DocumentPriority {

    TEST(1),
    LOCAL(2),
    NETWORK(3);
    /**
     * Is the number priority of the queue
     */
    private final int priority;

    private DocumentPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }
}

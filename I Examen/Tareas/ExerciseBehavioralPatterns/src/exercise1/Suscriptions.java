package exercise1;

/**
 *
 * @author Ana Teresa
 */
public enum Suscriptions {

    EMAIL(1), SMS(2), BOTH(3);
    private final int value;

    Suscriptions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

package exercise5.product;

/**
 *
 * @author Ana Teresa
 */
public class Adv_AlDia {

    private final String description = " periódico: Al Día ";
    private final double amount = 100;
    private String advMessage;

    // to inherit
    public String getDescription() {
        return description;
    }

    // to inherit
    public double getAmount() {
        return amount;
    }

    // to inherit
    public String getFullDescription() {
        return " " + advMessage;
    }

    public String getAdvMessage() {
        return advMessage;
    }

    public void setAdvMessage(String advMessage) {
        this.advMessage = advMessage;
    }

}

package exercise5.product;

/**
 *
 * @author Ana Teresa
 */
public class Adv_LaTeja {

    private final String description = " periódico: La Teja";
    private final double amount = 50;
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

package exercise4;

/**
 *
 * @author Ana Teresa
 */
public class Basic_Coverage {

    private final String description = " Básico ";
    private String scheduleOwner;
    private final double amount = 10000;
    private String validity;

    // to inherit
    public String getDescription() {
        return description;
    }

    // to inherit
    public double getAmount() {
        return amount;
    }

    public String getScheduleOwner() {
        return scheduleOwner;
    }

    public String getValidity() {
        return validity;
    }

    public void setScheduleOwner(String scheduleOwner) {
        this.scheduleOwner = scheduleOwner;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

}

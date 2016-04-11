package exercise4.concreteProduct.personal;

import exercise4.product.Complete_Coverage;

/**
 *
 * @author Ana Teresa
 */
public class Personal_CompleteCoverage extends Complete_Coverage {

    private final String description = " Cobertura: Personal ";
    private final double amount = 20000;

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public double getAmount() {
        return super.getAmount() + this.amount;
    }

    public String getFullDescription() {
        return this.getDescription() + " ,cédulaPropietario: " + getScheduleOwner() + " ,vigencia: " + getValidity() + " ,total: " + getAmount();
    }
}

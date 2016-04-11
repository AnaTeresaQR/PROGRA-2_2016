package exercise4.concreteProduct.home;

import exercise4.product.Standard_Coverage;

/**
 *
 * @author Ana Teresa
 */
public class Home_StandardCoverage extends Standard_Coverage {

    private final String description = " Cobertura: Standard ";
    private final double amount = 15000;

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

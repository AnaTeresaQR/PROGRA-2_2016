package exercise4.concreteProduct.car;

import exercise4.product.Basic_Coverage;

/**
 *
 * @author Ana Teresa
 */
public class Car_BasicCoverage extends Basic_Coverage {

    private final String description = " Cobertura: Auto ";
    private final double amount = 10000;

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

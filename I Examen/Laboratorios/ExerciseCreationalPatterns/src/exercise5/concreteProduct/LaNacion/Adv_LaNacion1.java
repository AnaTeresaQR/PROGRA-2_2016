package exercise5.concreteProduct.LaNacion;

import exercise5.product.Adv_LaNacion;

/**
 *
 * @author Ana Teresa
 */
public class Adv_LaNacion1 extends Adv_LaNacion {

    private final String description = "Publicidad página completa";
    private final double amount = 400;

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public double getAmount() {
        return amount + super.getAmount();
    }

    @Override
    public String getFullDescription() {
        return "\n" + this.getDescription() + "\nMensaje Publicidad" + super.getFullDescription() + "\nTotal a pagar: " + this.getAmount();
    }
}

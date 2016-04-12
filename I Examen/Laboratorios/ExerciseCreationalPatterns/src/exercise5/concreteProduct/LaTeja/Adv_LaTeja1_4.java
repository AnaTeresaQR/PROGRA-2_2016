package exercise5.concreteProduct.LaTeja;

import exercise5.product.Adv_LaTeja;

/**
 *
 * @author Ana Teresa
 */
public class Adv_LaTeja1_4 extends Adv_LaTeja {

    private final String description = "Publicidad 1/4 de página";
    private final double amount = 50;

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

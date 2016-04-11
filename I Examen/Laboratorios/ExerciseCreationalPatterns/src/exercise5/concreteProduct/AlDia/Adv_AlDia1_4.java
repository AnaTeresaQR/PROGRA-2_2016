package exercise5.concreteProduct.AlDia;

import exercise5.product.Adv_AlDia;

/**
 *
 * @author Ana Teresa
 */
public class Adv_AlDia1_4 extends Adv_AlDia {

    private final String description = "Publicidad 1/4 de página";
    private final double amount = 100;

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

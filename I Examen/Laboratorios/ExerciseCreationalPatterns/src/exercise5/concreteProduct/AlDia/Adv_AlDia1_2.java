package exercise5.concreteProduct.AlDia;

import exercise5.product.Adv_AlDia;

/**
 *
 * @author Ana Teresa
 */
public class Adv_AlDia1_2 extends Adv_AlDia {

    private final String description = "Publicidad media página";
    private final double amount = 200;

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

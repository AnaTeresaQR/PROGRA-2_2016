package exercise5.concreteFactory;

import exercise5.abstractFactory.NewspaperAdvertising_Factory;
import exercise5.concreteProduct.AlDia.Adv_AlDia1_4;
import exercise5.product.Adv_AlDia;

/**
 *
 * @author Ana Teresa
 */
public class FactoryAdv1_4 implements NewspaperAdvertising_Factory {

    @Override
    public Adv_AlDia createAlDiaNewspaper() {
        return new Adv_AlDia1_4();
    }
}

package exercise5.concreteFactory;

import exercise5.abstractFactory.NewspaperAdvertising_Factory;
import exercise5.concreteProduct.AlDia.Adv_AlDia1;
import exercise5.concreteProduct.LaNacion.Adv_LaNacion1;
import exercise5.product.Adv_AlDia;
import exercise5.product.Adv_LaNacion;

/**
 *
 * @author Ana Teresa
 */
public class FactoryAdv1 implements NewspaperAdvertising_Factory {

    @Override
    public Adv_AlDia createAlDiaNewspaper() {
        return new Adv_AlDia1();
    }

    public Adv_LaNacion createLaNacionNewspaper() {
        return new Adv_LaNacion1();
    }

}

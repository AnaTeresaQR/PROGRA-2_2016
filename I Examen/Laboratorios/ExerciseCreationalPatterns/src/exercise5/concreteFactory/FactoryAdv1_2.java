package exercise5.concreteFactory;

import exercise5.abstractFactory.NewspaperAdvertising_Factory;
import exercise5.concreteProduct.AlDia.Adv_AlDia1_2;
import exercise5.concreteProduct.LaNacion.Adv_LaNacion1_2;
import exercise5.concreteProduct.LaTeja.Adv_LaTeja1_2;
import exercise5.product.Adv_AlDia;
import exercise5.product.Adv_LaNacion;
import exercise5.product.Adv_LaTeja;

/**
 *
 * @author Ana Teresa
 */
public class FactoryAdv1_2 implements NewspaperAdvertising_Factory {

    @Override
    public Adv_AlDia createAlDiaNewspaper() {
        return new Adv_AlDia1_2();
    }

    public Adv_LaNacion createLaNacionNewspaper() {
        return new Adv_LaNacion1_2();
    }

    public Adv_LaTeja createLaTejaNewspaper() {
        return new Adv_LaTeja1_2();
    }

}

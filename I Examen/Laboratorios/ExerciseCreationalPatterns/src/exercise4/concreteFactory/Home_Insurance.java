package exercise4.concreteFactory;

import exercise4.product.Basic_Coverage;
import exercise4.product.Complete_Coverage;
import exercise4.concreteProduct.home.Home_BasicCoverage;
import exercise4.concreteProduct.home.Home_CompleteCoverage;
import exercise4.concreteProduct.home.Home_StandardCoverage;
import exercise4.product.Standard_Coverage;
import exercise4.abstractFactory.SellingInsurance_Factory;

/**
 *
 * @author Ana Teresa
 */
public class Home_Insurance implements SellingInsurance_Factory {

    @Override
    public Basic_Coverage createBasic_Coverage() {
        return new Home_BasicCoverage();
    }

    @Override
    public Standard_Coverage createStandard_Coverage() {
        return new Home_StandardCoverage();
    }

    @Override
    public Complete_Coverage createComplete_Coverage() {
        return new Home_CompleteCoverage();
    }

}

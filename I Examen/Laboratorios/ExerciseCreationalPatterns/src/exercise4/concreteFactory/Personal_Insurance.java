package exercise4.concreteFactory;

import exercise4.product.Basic_Coverage;
import exercise4.product.Complete_Coverage;
import exercise4.concreteProduct.personal.Personal_BasicCoverage;
import exercise4.concreteProduct.personal.Personal_CompleteCoverage;
import exercise4.concreteProduct.personal.Personal_StandardCoverage;
import exercise4.product.Standard_Coverage;
import exercise4.abstractFactory.SellingInsurance_Factory;

/**
 *
 * @author Ana Teresa
 */
public class Personal_Insurance implements SellingInsurance_Factory {

    @Override
    public Basic_Coverage createBasic_Coverage() {
        return new Personal_BasicCoverage();
    }

    @Override
    public Standard_Coverage createStandard_Coverage() {
        return new Personal_StandardCoverage();
    }

    @Override
    public Complete_Coverage createComplete_Coverage() {
        return new Personal_CompleteCoverage();
    }

}

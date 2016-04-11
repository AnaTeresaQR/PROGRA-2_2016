package exercise4.concreteFactory;

import exercise4.product.Basic_Coverage;
import exercise4.concreteProduct.car.Car_BasicCoverage;
import exercise4.concreteProduct.car.Car_CompleteCoverage;
import exercise4.concreteProduct.car.Car_StandardCoverage;
import exercise4.product.Complete_Coverage;
import exercise4.product.Standard_Coverage;
import exercise4.abstractFactory.SellingInsurance_Factory;

/**
 *
 * @author Ana Teresa
 */
public class Car_Insurance implements SellingInsurance_Factory {

    @Override
    public Basic_Coverage createBasic_Coverage() {
        return new Car_BasicCoverage();
    }

    @Override
    public Standard_Coverage createStandard_Coverage() {
        return new Car_StandardCoverage();
    }

    @Override
    public Complete_Coverage createComplete_Coverage() {
        return new Car_CompleteCoverage();
    }

}

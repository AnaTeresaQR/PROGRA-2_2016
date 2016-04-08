package exercise4;

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

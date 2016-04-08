package exercise4;

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

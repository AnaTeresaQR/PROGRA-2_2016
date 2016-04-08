package exercise4;

/**
 *
 * @author Ana Teresa
 */
public interface SellingInsurance_Factory {

    public Basic_Coverage createBasic_Coverage();

    public Standard_Coverage createStandard_Coverage();

    public Complete_Coverage createComplete_Coverage();

}

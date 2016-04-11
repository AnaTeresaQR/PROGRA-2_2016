package exercise4.abstractFactory;

import exercise4.product.Basic_Coverage;
import exercise4.product.Complete_Coverage;
import exercise4.product.Standard_Coverage;

/**
 *
 * @author Ana Teresa
 */
public interface SellingInsurance_Factory {

    public Basic_Coverage createBasic_Coverage();

    public Standard_Coverage createStandard_Coverage();

    public Complete_Coverage createComplete_Coverage();

}

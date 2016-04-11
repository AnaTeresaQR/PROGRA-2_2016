package exercise4.pruebaMain;

import exercise4.concreteProduct.car.Car_BasicCoverage;
import exercise4.concreteProduct.home.Home_CompleteCoverage;
import exercise4.concreteFactory.Car_Insurance;
import exercise4.concreteFactory.Home_Insurance;
import exercise4.abstractFactory.SellingInsurance_Factory;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        SellingInsurance_Factory sif = new Car_Insurance();

        //-----------------------------------------------------------------------------
        Car_BasicCoverage cbc = (Car_BasicCoverage) sif.createBasic_Coverage();

        cbc.setScheduleOwner("207410170");
        cbc.setValidity("3 años");

        System.out.println("" + cbc.getFullDescription());

        //-------------------------------------------------------------------------------
        SellingInsurance_Factory sif2 = new Home_Insurance();
        Home_CompleteCoverage hcc = (Home_CompleteCoverage) sif2.createComplete_Coverage();

        hcc.setScheduleOwner("207440892");
        hcc.setValidity("De por vida");

        System.out.println("" + hcc.getFullDescription());
    }

}

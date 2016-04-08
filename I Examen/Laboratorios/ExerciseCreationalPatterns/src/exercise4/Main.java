package exercise4;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        SellingInsurance_Factory sif = new Car_Insurance();

        Car_BasicCoverage cbc = (Car_BasicCoverage) sif.createBasic_Coverage();

        cbc.setScheduleOwner("207410170");
        cbc.setValidity("3 años");

        System.out.println("" + cbc.getFullDescription());

    }

}

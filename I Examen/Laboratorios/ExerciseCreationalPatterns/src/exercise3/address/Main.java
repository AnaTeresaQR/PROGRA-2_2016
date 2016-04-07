package exercise3.address;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        AddressFactory af = new USAddressFactory();

        Address a1 = af.createAddress();
        a1.setCity("NY");
        a1.setPostalCode("20703");
        a1.setRegion("Región Sur");
        a1.setStreet("3 avenida 9");

        System.out.println("" + a1.getFullAddress());

        AddressFactory aff = new FrenchAddressFactory();

        Address a2 = aff.createAddress();
        a2.setCity("Roma");
        a2.setPostalCode("22222");
        a2.setRegion("región Norte");
        a2.setStreet("6 avenida 1");

        System.out.println("" + a2.getFullAddress());

    }

}

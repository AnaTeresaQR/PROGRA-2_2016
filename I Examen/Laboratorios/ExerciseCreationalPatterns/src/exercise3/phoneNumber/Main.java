package exercise3.phoneNumber;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        PhoneNumberFactory pnf = new USPhoneNumberFactory();

        PhoneNumber pn1 = pnf.createPhoneNumber();

        pn1.setPhoneNumber("1234567890");

        System.out.println("Código país: " + pn1.getCountryCode() + "  tel: " + pn1.getPhoneNumber());

        //---------------------------------------------------------------------------------------------------------------------
        PhoneNumberFactory pnff = new FrenchPhoneNumberFactory();

        PhoneNumber pn2 = pnff.createPhoneNumber();

        pn2.setPhoneNumber("123456789");

        System.out.println("Código país: " + pn2.getCountryCode() + "  tel: " + pn2.getPhoneNumber());

    }
}

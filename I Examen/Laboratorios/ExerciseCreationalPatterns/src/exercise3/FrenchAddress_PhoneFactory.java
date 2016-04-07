package exercise3;

/**
 *
 * @author Ana Teresa
 */
public class FrenchAddress_PhoneFactory implements Address_PhoneFactory {

    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}

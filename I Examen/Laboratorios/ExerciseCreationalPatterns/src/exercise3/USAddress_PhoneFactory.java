package exercise3;

/**
 *
 * @author Ana Teresa
 */
public class USAddress_PhoneFactory implements Address_PhoneFactory {

    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}

package exercise3.address;

/**
 *
 * @author Ana Teresa
 */
public class USAddressFactory implements AddressFactory {

    @Override
    public Address createAddress() {
        return new USAddress();
    }
}

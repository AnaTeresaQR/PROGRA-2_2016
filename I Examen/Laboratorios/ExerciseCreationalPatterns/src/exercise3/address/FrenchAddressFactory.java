package exercise3.address;

/**
 *
 * @author Ana Teresa
 */
public class FrenchAddressFactory implements AddressFactory {

    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

}

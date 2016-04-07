package exercise3.phoneNumber;

/**
 *
 * @author Ana Teresa
 */
public class FrenchPhoneNumberFactory implements PhoneNumberFactory {

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}

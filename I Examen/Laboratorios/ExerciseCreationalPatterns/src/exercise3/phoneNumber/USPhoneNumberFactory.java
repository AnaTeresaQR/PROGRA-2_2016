package exercise3.phoneNumber;

/**
 *
 * @author Ana Teresa
 */
public class USPhoneNumberFactory implements PhoneNumberFactory {

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}

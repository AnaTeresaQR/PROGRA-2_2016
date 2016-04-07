package exercise3.phoneNumber;

/**
 *
 * @author Ana Teresa
 */
public abstract class PhoneNumber {

    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newNumber) {
        try {
            Long.parseLong(newNumber);
            phoneNumber = newNumber;
        } catch (NumberFormatException exc) {
        }
    }

}

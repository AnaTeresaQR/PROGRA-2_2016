package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompany extends Client {

    public PrivateCompany() {
        super(null, null, null, null);
    }

    public PrivateCompany(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

}

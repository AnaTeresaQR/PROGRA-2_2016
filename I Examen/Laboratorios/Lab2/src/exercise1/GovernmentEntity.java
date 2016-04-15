package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity extends Client {

    public GovernmentEntity() {
        super(null, null, null, null);
    }

    public GovernmentEntity(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

}

package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution extends Client {

    private int underageAmount;

    public EducationalInstitution() {
        super(null, null, null, null);
    }

    public EducationalInstitution(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

    public void setUnderageAmount(int underageAmount) {
        this.underageAmount = underageAmount;
    }

    public int getUnderageAmount() {
        return underageAmount;
    }

}

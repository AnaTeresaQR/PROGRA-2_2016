package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Client {

    private String InstitutionName;
    private String contactTel;
    private String TelDescription;
    private Person personApplying;

    public Client(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        this.InstitutionName = InstitutionName;
        this.contactTel = contactTel;
        this.TelDescription = TelDescription;
        this.personApplying = personApplying;
    }

    public String getInstitutionName() {
        return InstitutionName;
    }

    public void setInstitutionName(String InstitutionName) {
        this.InstitutionName = InstitutionName;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getTelDescription() {
        return TelDescription;
    }

    public void setTelDescription(String TelDescription) {
        this.TelDescription = TelDescription;
    }

    public Person getPersonApplying() {
        return personApplying;
    }

    public void setPersonApplying(Person personApplying) throws EventsException {
        if (createPerson(personApplying)) {
            this.personApplying = personApplying;
        } else {
            throw new EventsException("No es posible que la persona sea creada");
        }
    }

    private boolean createPerson(Person person) {
        String schedule = person.getSchedule();
        String name = person.getName();
        String secondName = person.getSecondName();
        String lastName = person.getLastName();
        String secondLastName = person.getSecondLastName();
        return (schedule != null && !schedule.equals(""))
                && (name != null && !name.equals(""))
                && (secondName != null && !secondName.equals(""))
                && (lastName != null && !lastName.equals(""))
                && (secondLastName != null && !secondLastName.equals(""));
    }

    @Override
    public String toString() {
        return "Client{" + "InstitutionName: " + InstitutionName + "\ncontactTel: " + contactTel + ", TelDescription: " + TelDescription + "\npersonApplying: " + personApplying + '}';
    }

}

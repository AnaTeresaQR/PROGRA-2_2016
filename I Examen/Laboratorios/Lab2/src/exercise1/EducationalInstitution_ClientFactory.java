package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution_ClientFactory implements ClientFactory {

    @Override
    public Client createClient() {
        return new EducationalInstitution();
    }

}

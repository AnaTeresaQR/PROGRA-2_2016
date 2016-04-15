package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity_ClientFactory implements ClientFactory {

    @Override
    public Client createClient() {
        return new GovernmentEntity();
    }
}

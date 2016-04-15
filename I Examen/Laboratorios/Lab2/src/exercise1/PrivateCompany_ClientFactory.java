package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompany_ClientFactory implements ClientFactory {

    @Override
    public Client createClient() {
        return new PrivateCompany();
    }

}

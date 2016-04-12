package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface Observable {

    public void add(User user);

    public void remove(String suscriptionType);

    public String alert(ConcreteNew news);

}

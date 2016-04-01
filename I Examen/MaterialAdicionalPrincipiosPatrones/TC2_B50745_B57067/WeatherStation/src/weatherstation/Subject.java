package weatherstation;

/**
 *
 * @author Melany y Mónica
 */
public interface Subject {

    public void registerObserver(Observer o) throws NullPointerException;

    public void removeObserver(Observer o) throws NullPointerException;

    public void notifyObservers();

}

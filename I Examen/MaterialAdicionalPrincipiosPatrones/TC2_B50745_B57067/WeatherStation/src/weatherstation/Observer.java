package weatherstation;

/**
 *
 * @author Melany y Mónica
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure) throws NumberFormatException;

}

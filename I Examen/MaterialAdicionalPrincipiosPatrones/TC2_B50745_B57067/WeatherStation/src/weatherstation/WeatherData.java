package weatherstation;

/**
 *
 * @author Melany y Mónica
 */
import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) throws NullPointerException  {
        observers.add(o);
    }

    public void removeObserver(Observer o) throws NullPointerException {
        int j = observers.indexOf(o);
        if (j >= 0) {
            observers.remove(j);
        }
    }

    public void notifyObservers() {
        for (int j = 0; j < observers.size(); j++) {
            Observer observer = (Observer) observers.get(j);
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) throws NumberFormatException {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}

package weatherstation;

/**
 *
 * @author Melany y Mónica
 */
public class CurrentConditionsDisplay implements Observer{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) throws NullPointerException {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) throws NumberFormatException{
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "\nHumidity: " + humidity;
    }
    
    

}

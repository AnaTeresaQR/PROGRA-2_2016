package weatherstation;

/**
 *
 * @author Melany y Móica
 */
public class WeatherStation {

    public static void main(String[] args) {

        try {
            WeatherData weatherData = new WeatherData();
            CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
            weatherData.setMeasurements(80, 65, 30.4f);
            System.out.println("Primera vez: \n" + currentDisplay + "\n");

            weatherData.setMeasurements(82, 70, 29.2f);
            System.out.println("Segunda vez: \n" + currentDisplay + "\n");

            weatherData.setMeasurements(78, 90, 29.2f);
            System.out.println("Tercera vez: \n" + currentDisplay + "\n");

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException nuex) {
            System.out.println(nuex.getMessage());
        }
    }
}

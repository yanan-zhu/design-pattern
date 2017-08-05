package behavior.observer;

/**
 * Created by zhuyanan on 17/8/5.
 */
public class TestObserver {


    public static void main(String[] args) {


        WeatherData weatherData = new WeatherData();


        //register observer
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(23.7f, 43.2f, 34.4f);

        weatherData.measurementsChanged();


        //after remove observer
        weatherData.removeObserver(currentConditionsDisplay);

        weatherData.setMeasurements(23.7f, 43.2f, 34.4f);

        weatherData.measurementsChanged();


    }

}

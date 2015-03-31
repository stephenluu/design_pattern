package observer;

import observer.observer.CurrentConditionDisplay;
import observer.subject.WeatherData;

/**
 * @author stepenluu
 * @since Apr 1, 2015
 */
public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionDisplay(weatherData);

		weatherData.setMeasurements(37, 55, 99);
		weatherData.setMeasurements(37, 75, 99);
	}
}

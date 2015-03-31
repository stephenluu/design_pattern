package observer.subject;

import java.util.ArrayList;

import observer.inter.Observer;
import observer.inter.Subject;

/**
 * @author stepenluu
 * @since Apr 1, 2015
 */
public class WeatherData implements Subject {

	private float temp;
	private float humidity;
	private float presure;

	private ArrayList<Observer> observers;

	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void NotifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, presure);
		}
	}

	public void setMeasurements(float temp, float humidity, float presure) {
		this.temp = temp;
		this.humidity = humidity;
		this.presure = presure;
		NotifyObservers();
	}

}

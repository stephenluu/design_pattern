package observer.observer;

import observer.inter.DisplayElement;
import observer.inter.Observer;
import observer.inter.Subject;

/**
 * @author stepenluu
 * @since Apr 1, 2015
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float presure;

	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public void update(float temp, float humidity, float presure) {
		this.temp = temp;
		this.humidity = humidity;
		this.presure = presure;

		display();
	}
	@Override
	public String toString() {
		return "CurrentConditionDisplay [temp=" + temp + ", humidity=" + humidity + ", presure=" + presure + "]";
	}

}

package observer.inter;

/**
 * @author stepenluu
 * @since Mar 31, 2015
 */
public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void NotifyObservers();

}

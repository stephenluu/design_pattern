package decorator;

/**
 * @author stepenluu
 * @since Apr 2, 2015
 */
public class Espresso extends Beverage {

	@Override
	public String getDes() {
		return "Espresso";
	}

	@Override
	public double cost() {
		return 2;
	}

}

package decorator;

/**
 * @author stepenluu
 * @since Apr 2, 2015
 */
public class Moka extends Beverage {

	private Beverage beverage;

	public Moka(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDes() {
		return beverage.getDes() + " Moka";
	}
	@Override
	public double cost() {
		return this.beverage.cost() + 0.5;
	}

	@Override
	public String toString() {
		return "Moka [getDes()=" + getDes() + ", cost()=" + cost() + "]";
	}

}

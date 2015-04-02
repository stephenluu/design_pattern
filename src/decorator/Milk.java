package decorator;

/**
 * @author stepenluu
 * @since Apr 2, 2015
 */
public class Milk extends Beverage {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDes() {
		return beverage.getDes() + " Milk";
	}
	@Override
	public double cost() {
		return this.beverage.cost() + 1;
	}

	@Override
	public String toString() {
		return "Milk [getDes()=" + getDes() + ", cost()=" + cost() + "]";
	}

}

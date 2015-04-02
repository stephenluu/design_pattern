package decorator;

/**
 * @author stepenluu
 * @since Apr 2, 2015
 */
public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		Beverage moka = new Moka(beverage);
		System.out.println(moka);

		Beverage milk = new Milk(moka);
		System.out.println(milk);

	}

}

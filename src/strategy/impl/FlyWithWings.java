package strategy.impl;

import strategy.inter.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly with wings ");
	}

}

package strategy.impl;

import strategy.inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("can not fly");		
	}

}

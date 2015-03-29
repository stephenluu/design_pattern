package strategy.duck;

import strategy.inter.FlyBehavior;
import strategy.inter.QuackBehavior;

public class RedHeadDuck extends Duck{

	public RedHeadDuck(FlyBehavior flyBehavior,
			QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display(){
		System.out.println("I am a red head duck");
	}
}

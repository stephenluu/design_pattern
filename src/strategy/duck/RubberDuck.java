package strategy.duck;

import strategy.inter.FlyBehavior;
import strategy.inter.QuackBehavior;

public class RubberDuck extends Duck {

	public RubberDuck(FlyBehavior flyBehavior,
			QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display(){
		System.out.println("I am a rubber duck");
	}
}

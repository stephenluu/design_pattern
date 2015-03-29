package strategy.duck;

import strategy.inter.FlyBehavior;
import strategy.inter.QuackBehavior;

public class MallardDuck extends Duck {

	public MallardDuck(FlyBehavior flyBehavior,
			QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display(){
		System.out.println("I am a green head duck");
	}

	
}

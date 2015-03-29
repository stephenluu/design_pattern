package strategy.duck;

import strategy.inter.FlyBehavior;
import strategy.inter.QuackBehavior;

public class ModelDuck extends Duck{

	public ModelDuck() {
		super();
	}

	public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	public void display(){
		System.out.println("I am a model duck");
	}
}

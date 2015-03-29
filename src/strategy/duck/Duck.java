package strategy.duck;

import strategy.inter.FlyBehavior;
import strategy.inter.QuackBehavior;

public class Duck {

	public void swim(){
		System.out.println("swim like a duck");
	}
	
	public void display(){
		System.out.println("I am a common duck");	
	}
	
	protected  FlyBehavior flyBehavior;
	protected  QuackBehavior quackBehavior;
	
	public Duck() {
	}

	public Duck(FlyBehavior flyBehavior, strategy.inter.QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return this.quackBehavior ;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	public void performQuack() {
		this.quackBehavior.quack();
	}	
	
}

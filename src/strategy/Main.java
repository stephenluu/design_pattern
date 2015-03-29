package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.duck.RedHeadDuck;
import strategy.duck.RubberDuck;
import strategy.impl.FlyNoWay;
import strategy.impl.FlyWithWings;
import strategy.impl.MuteQuack;
import strategy.impl.Quack;

public class Main {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
		execute(mallardDuck);
		
		Duck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Quack());
		execute(redHeadDuck);
		
		Duck rubberDuck = new RubberDuck(new FlyNoWay(), new MuteQuack());
		execute(rubberDuck);
		
		Duck modelDuck = new ModelDuck(new FlyNoWay(), new Quack());
		execute(modelDuck);
		modelDuck.setFlyBehavior(new FlyWithWings() );
		modelDuck.setQuackBehavior(new MuteQuack());
		System.out.println("========================");
		System.out.println("changed the modelDuck");
		execute(modelDuck);
	}

	private static void execute(Duck duck) {
		System.out.println("========================");
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
	}

}

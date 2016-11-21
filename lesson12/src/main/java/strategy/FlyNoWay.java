package strategy;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("Sorry. I'm not flying duck ");
	}
}
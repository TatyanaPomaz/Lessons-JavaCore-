package strategy;

abstract public class Duck {
	private FlyBehavior flyBehavior;
	
	public Duck(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public abstract void display();
	
	public void quack() {
		System.out.println("Quack-Quack");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		// swim
	}
}
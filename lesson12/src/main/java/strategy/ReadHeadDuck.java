package strategy;

public class ReadHeadDuck extends Duck {
	public ReadHeadDuck(String name) {
		super(new FyWithWings());		
	}
	
	public void display() {
		System.out.println("Quack-Quack");
	}
}
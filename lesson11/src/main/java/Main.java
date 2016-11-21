import shape.example3.Circle;
import shape.example3.Rectancle;
import shape.example3.Square;
import shape.example3.Shape;

import template.Foo;

public class Main {
	public static void main(String ... args) {
		
		Circle circle = new Circle(10.0);
		System.out.println(circle.calculateArea());
		
		Shape[] shapes = {new Circle(5.0), new Square(4.0), new Rectancle(10.0, 2.0)};
		for (Shape shape : shapes) {
			System.out.println(shape.calculateArea());
		}
		
		
		Foo foo = new Foo();
		
		
	}
	
	public void instanceOfExample()  {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Cat catNull = null;
		
		if (dog instanceof Dog) {
			System.out.println("Dog");
		}
		
		if (animal instanceof Dog) {
			System.out.println("Dog");
		} else {
			System.out.println("not a Dog");
		}
		
		if (catNull instanceof Animal) {
			System.out.println("A");
		}
	}
}
import template.Application;
import template.Application2;
import template.FwkApplication2;

import comparable.Student;
import java.util.Arrays;

import strategy.Duck;
import strategy.RubberDuck;
import strategy.ReadHeadDuck;


public class Main {
	public static void main(String ... args) {
		Application app = new Application();
		//app.run();
		
		FwkApplication2 app1 = new Application2();
		//app1.run();
		
		
		Student st1 = new Student("john", 10);
		Student st2 = new Student("jane", 20);
		Student st3 = new Student("joe", 30);
	
		Student[] studets = {st1, st2, st3};
		int index = Arrays.binarySearch(studets, st2);
		System.out.println(index);
		
		Duck duck1 = new ReadHeadDuck("ReadHeadDuck");
		duck1.display();
		duck1.fly();
		
		Duck rubberDuck  = new RubberDuck("Rubber duck");
		rubberDuck.display();
		rubberDuck.fly();
	}
}
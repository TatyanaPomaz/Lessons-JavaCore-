import zoo.Bear;
import zoo.Lion;
import zoo.Tiger;
import zoo.Animal;
import zoo.WildCat;
import zoo.Food;

public class Main {
	public static void main(String ... args) {

		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Bear bear = new Bear();
				
				
		Animal[] animas = {tiger, lion, bear};
				
		for (int i = 0; i < animas.length; i++) {
			animas[i].makeNoise();
		}
		
		System.out.println(Animal.PSEUDO_CONST);
		
		bear.eatFood(Food.MEAT);
	}
}
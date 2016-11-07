package zoo;

public interface Animal {
	String PSEUDO_CONST = "hello";
	
	public abstract void makeNoise();
	void eatFood(Food food);
}
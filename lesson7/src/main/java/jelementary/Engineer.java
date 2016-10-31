package jelementary;

public class Engineer {
	private String name;
	
	public Engineer(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello. I'm an engineer - " + name);
	}
}
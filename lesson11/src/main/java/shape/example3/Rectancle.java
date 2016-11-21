package shape.example3;

public class Rectancle implements Shape {
	private double width;
	private double height;
	
	public Rectancle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return width * height;
	}
}
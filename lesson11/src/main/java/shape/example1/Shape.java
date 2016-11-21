package shape.example1;

public class Shape {
	private double width;
	private double height;
	private double radius;
	
	public Shape(double width, double height, double radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
	}
	
	/*public double calculateArea(ShapeType shapeType) {
		double area = 0.0;
		switch (shapeType) {
			case ShapeType.SQUARE: area = width * width;
				break;
			case ShapeType.RECTANCLE: area = width * height;
				break;
			case ShapeType.CIRCLE: area = Math.PI * radius * radius;
				break;
				
			default: area = 0.0;
			
			
		}
		return area; 
	}*/
}
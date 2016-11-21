package shape.example2;

public class Shape {
	public double calculateArea(Object obj) {
		double area = 0.0;
		
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			area = circle.getRadius() * circle.getRadius() * Math.PI;
		} else if (obj instanceof Square) {
			Square square = (Square) obj;
			area = square.getWidth() * square.getWidth();
		} else if (obj instanceof Rectancle) {
			Rectancle rectancle = (Rectancle) obj;
			area = rectancle.getWidth() * rectancle.getHeight();
		}
		
		return area;
	}
	
}
package Shape;

public class Main {

	public static void main(String args[]) {
		
		Circle newCircle = new Circle();
		
		newCircle.radius = 1.5;
		System.out.println(newCircle.getArea());
		
		Triangle newTriangle = new Triangle();
		newTriangle.setHeight(5.0);
		newTriangle.setWidth(5);
		
		System.out.println(newTriangle.getArea());

		
		
	}
}

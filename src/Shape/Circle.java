package Shape;

public class Circle extends Shape {
	
	//Fields/Atributes
	double radius;
	final double PI = 3.14159;
	
	@Override
	public double getArea() {
		
		double area = PI * this.radius * this.radius;
		return area;

	}
	
	public double getDiameter() {
		
		double diameter = this.radius * 2;
		return diameter;

	}
	
	public double getCircumference() {
		
		double circumference = 2 * PI * this.radius;
		return circumference;

	}

}

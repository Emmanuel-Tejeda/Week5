package Shape;

public class Triangle extends Shape{

	double height;
	double width;
	
	public double getArea() {
		
		double area = height * width / 2;
		return area;
	}

	public double getHeight() {
		return height;
	}



	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
		
	}
	
	
}

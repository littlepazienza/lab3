public class Circle extends Shape{
	
	public double radius;
	
	public Circle(Color c, String n, double r) {
		super(c,n);
		radius = r;
	}

	@Override
	public double area() {
		double r = radius;
		double area = (Math.PI)*(r*r);
		return area;
	}

	@Override
	public double perimeter() {
		double r = radius;
		double perimeter = 2*(Math.PI)*r;
		return perimeter;
	}


}

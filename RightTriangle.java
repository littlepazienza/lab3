
public class RightTriangle extends Shape 
{
	
	double length, width;

	public RightTriangle(Color c, String n, double in_length, double in_width) 
	{
		super(c, n);
		length = in_length;
		width = in_width;
		 
	}

	@Override
	public double area() 
	{
		
		return (0.5*length*width);
	}

	@Override
	public double perimeter() 
	{
		
		return Math.sqrt((length*length)+(width*width));
	}
	
	
	

}

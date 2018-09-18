public class Tester
{
  public static void main(String [] args)
  {
    // Example test case
    // Star s = new Star(Shape.Color.green, 5);
    // System.out.println("star = " + s);
	  
	//Test for RightTriangle
	RightTriangle rt = new RightTriangle(Shape.Color.red, "triangle", 4, 4);
	System.out.println("Test for Right Triangle (should be A red triangle area 8.0 perimeter 5.656854249492381)="+rt);
	
	RightTriangle rt2 = new RightTriangle(Shape.Color.green, "triangle2", 12, 20);
	System.out.println("Test for Right Triangle (should be a green triangle2 area 120.0 perimeter 23.323807579381203)=" + rt2);
  }
}

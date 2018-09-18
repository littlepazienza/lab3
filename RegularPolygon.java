abstract class Polygon extends Shape
{
  protected double sides;
  protected double sideLength;

  public Polygon(Color color, String name, double s, double sl)
  {
    super(color, name);
    sides = s;
    sideLength = sl;
  }

  @Override
  public double perimeter()
  {
    return sides * sideLength;
  }
}


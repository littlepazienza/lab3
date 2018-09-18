abstract class Shape
{
  public enum Color {red, blue, green};

  protected Color color;
  protected String name;

  public Shape(Color c, String n)
  {
    color = c;
    name = n;
  }

  public void paint(Color newColor)
  {
    color = newColor;
  }

  abstract public double area();

  abstract public double perimeter();

  @Override
  public String toString()
  {
    return "A " + color + " " + name + " area " + this.area() 
           + " perimeter " + this.perimeter();
  }
}


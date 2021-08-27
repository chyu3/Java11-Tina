
public class Point
{	// Attributes + Beaviours = encapsulation
	// private fields = data hiding
	// Attributes or fields
	private char name;
	private double x;
	private double y;
	
	// behaviours or actions
	public Point() // empty constructor
	{	}
	
	public Point(char name, double x, double y) //constructor
	{	// instantiates and initialises the object - called by the NEW keyword
		this.name = name;
		this.x = x;
		this.y = y;
	}
	// two methods of same name = overloading
	
	// acessor method - getter
	public char getName()
	{
		return this.name;
	}
	
	// mutator method - setter	
	public void setName(char name)
	{
		this.name = name;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
/*	public void print()
	{
		System.out.print(name+"("+x+","+y+")");
	}
*/	
	// overloading (polymorphism) - instead of print^
	public String toString()
	{
		return this.name+"("+this.x+","+this.y+")";
	}
	
	// overloading (polymorphism) - compare 2 objects for equality
	public boolean equals(Point p2)
	{
		return this.x == p2.getX() && this.y == p2.getY;
	}
	
	// how would you calculate the distance between 2 points?
	
}


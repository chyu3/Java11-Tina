
public class Point
{	// Attributes + Beaviours = encapsulation
	// private fields = data hiding
	// Attributes or fields
	private String name;
	private double x;
	private double y;
	
	// behaviours or actions
	public Point() // empty constructor
	{	}
	
	public Point(String name, double x, double y) //constructor
	{	// instantiates and initialises the object - called by the NEW keyword
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public Point(char name, double x, double y) //constructor
	{
		this.name = name + "";
		this.x = x;
		this.y = y;
	}
	// two or more methods of same name = overloading
	
	// acessor method - getter
	public String getName()
	{
		return this.name;
	}
	
	// mutator method - setter	
	public void setName(String name)
	{
		this.name = name;
	}
	
	// method overloading
	public void setName(char name)
	{
		this.name = name + "";
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
		return this.x == p2.getX() && this.y == p2.getY();
	}
	
	// how would you calculate the distance between 2 points?
	public double distance(Point p2)
	{
		double distX = p2.getX() - this.getX();
		double distY = p2.getY() - this.getY();
		double dist = Math.sqrt( distX*distX + distY*distY );
		return dist;
	}
	
	public double compareTo(Point p2)
	{
		Point origin = new Point("Origin", 0, 0);
		double p1dist = Math.abs( origin.distance(this) );
		double p2dist = Math.abs( origin.distance(p2) );
		return p1dist - p2dist;
	}
}


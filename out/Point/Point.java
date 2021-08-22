

public class Point
{
	// Attributes or fields
	char name;
	double x;
	double y;
	
	// behaviours or actions
	public void print()
	{
		System.out.print(name+"("+x+","+y+")");
	}
	
	
	
	public static void main (String[] args)
	{//	declaration|instantiation
		Point a	=   new Point(); // instantiating an object of the Point class
		a.name = 'A';	// here we initialise the attributes/fields of...
		a.x = 1.5;		// the object _a_
		a.y = 0;
		a.print();		// the object _a_ performs the print action/
						// AKA "prints itself"

		System.out.println();
		// we can create as many Point objects as we want...
		Point b = new Point(); // instantiating another object
		b.name = 'B';
		b.x = 2;
		b.y = 3;
		b.print();
		// How would you create an array of Points? :)
	}
}


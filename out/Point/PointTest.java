// class to test / use the Point class
public class PointTest
{
	
	public static void main (String[] args)
	{//	declaration|instantiation
		Point a	=   new Point('A', 1.5, 0); // instantiating an object of the Point class
	/*	a.name = 'A';	// here we initialise the attributes/fields of...
		a.x = 1.5;		// the object _a_
		a.y = 0;
		a.print();		// the object _a_ performs the print action/
						// AKA "prints itself"
	*/
		System.out.println(a);
		// we can create as many Point objects as we want...
		Point b = new Point('B', 2, 3); // instantiating another object
	/*	b.name = 'B';
		b.x = 2;
		b.y = 3;
		b.print();
	*/	System.out.println(b.getName());
		System.out.println(b.getX());
		System.out.println(b.getY());
		// How would you create an array of Points? :)
		Point c = new Point();
		c.setName('C');
//		c.print();
		System.out.println("\n"+c);
		
	}
}


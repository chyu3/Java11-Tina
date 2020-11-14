/*************************************************************************
 *  Compilation:  javac Htree.java
 *  Execution:    java Htree N
 *  Dependencies: StdDraw.java
 *
 *  Plot an order N Htree.
 *
 *  % java Htree 5
 *
 *************************************************************************/



public class HTree {
	
	public static void drawH (double x, double y, double size) 
	{
		double x0 = x - size/2;
		double x1 = x + size/2;
		double y0 = y - size/2;
		double y1 = y + size/2;
		
		// base 3 lines of H
		StdDraw.line (x0, y0, x0, y1); //left vertical
		StdDraw.line (x1, y0, x1, y1); //right vertical
		StdDraw.line (x0, y, x1, y);   //line between
		
	}
	
	public static void draw(int n, double x, double y, double size)
	{
		if (n == 0)
		return;
		drawH(x, y, size);
		
		// half size H
		double x0 = x - size/2;
		double x1 = x + size/2;
		double y0 = y - size/2;
		double y1 = y + size/2;
		
		// recurssion of H of n-1
		draw(n-1, x0, y0, size/2);
		draw(n-1, x0, y1, size/2);
		draw(n-1, x1, y0, size/2);
		draw(n-1, x1, y1, size/2);
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		// center of H
		double x = 0.5;
		double y = 0.5;
		
		//Length of H
		double size = 0.5;
		draw (n, x, y, size);
		
	}
	
}



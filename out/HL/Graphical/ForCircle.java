import java.util.Scanner;
import static java.lang.System.out;

public class ForCircle
{
	static final double scaleX = 100;
	static final double scaleY = 100;
	static final double middleX = scaleX / 2;
	static final double middleY = scaleY / 2;
	
    /* From StdDraw, you will use:
     * StdDraw.circle(x,y,r);
     *  which draws a circle of radius r, centered on (x, y).
     * @param x the x-coordinate of the centre of the circle
     * @param y the y-coordinate of the centre of the circle
     * @param r the radius of the circle
     * @throws IllegalArgumentException if the radius of the circle is negative
     */
	
	// expanding circle
	public static void circlere(int radius) throws InterruptedException
	{
		for(int r = 1; r <= radius; r++)
		{
			StdDraw.circle(middleX, middleY, r);
			Thread.sleep(250);
		}
	}

	// shrinking circle
	public static void circlers(int minRadius, int maxRadius) throws InterruptedException
	{
		for(int r = maxRadius; r >= minRadius; r--)
		{
			StdDraw.circle(middleX, middleY, r);
			Thread.sleep(250);
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		StdDraw.setXscale(0, scaleX);
		StdDraw.setYscale(0, scaleY);
		double maxRadius = 0;
		
		if( scaleX == scaleY )
		{	maxRadius = scaleX / 2;
		}
		else if( scaleX > scaleY )
		{	maxRadius = scaleX / 2;
		}
		else
		{	maxRadius = scaleY / 2;
		}
			
		int r = (int)maxRadius;

		// Expanding/growing concentric circles (comment/uncomment to test)
		StdDraw.setPenColor(StdDraw.BLUE);
		circlere( r );

		Thread.sleep(3000);
		StdDraw.clear();
		Thread.sleep(2000);

		// Shrinking concentric circles (comment/uncomment to test)
		StdDraw.setPenColor(StdDraw.MAGENTA);
		circlers( 1, r );

	}
	
}

/*********************************************************
 *  Compilation : javac RecursiveSquares.java
 *  Execution   : java RecursiveSquares
 *  Dependencies: StdDraw.java
 *
 *  Plot an order 4 tree of overlapping gray squares.
 *  by Robert Sedgewick and Kevin Wayne, modified by mdv.
 *********************************************************/
 
 /* NOTE
  * We are using StdDraw library from
  * https://introcs.cs.princeton.edu/java/stdlib/
  * to draw geometric figures and pause the execution of our program
  */

public class RecursiveSquares
{
	static double ratio = 2.4;
    // plot a square, centered on (x, y) of the given side length
    // with a grey background and black border
    public static void drawSquare(double x, double y, double size)
    {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, size/2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, size/2);
    }

    // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    public static void draw(int n, double x, double y, double size)
    {
        if (n <= 0)
        {
			return;
		}
		
		StdDraw.pause(500);
        
        drawSquare(x, y, size);

        // recursively draw 4 smaller trees of order n-1
          
        draw(n-1, x - size/2, y + size/2, size/ratio);    // upper left   
        draw(n-1, x + size/2, y + size/2, size/ratio);    // upper right
        draw(n-1, x - size/2, y - size/2, size/ratio);    // lower left
        draw(n-1, x + size/2, y - size/2, size/ratio);    // lower right
        
        
    }


    // plot an order N recursive squares pattern
    public static void main(String[] args)
    {	// bypass the command line and use 4 for N
        //int N = Integer.parseInt(args[0]);
        int N = 4;
        //StdDraw.setCanvasSize(650, 650);
        double x = 0.5, y = 0.5;   // center of square
        double size = 0.6;         // side length of square
        draw(N, x, y, size);
    }

}

/*
 * challenges: (save new versions of this class for each challenge)
 * Modify the code in the recursive method (draw) so that:
 * 1-the squares are drawn in reverse order (from smaller to larger ones)
 * 
 */



/*
 * Int2Bin
 * 
 * Convert integer to binary,
 * the SL (iterative/loops) and HL (recursive) ways
 * 
 */


public class Int2Bin
{
	// converts an integer and returns its binary
	// equivalent as a String -- SL algorithm
	public static String int2binSL(int number)
	{
		String bin = "";
		int n = number;
		while(n > 0)
		{	bin = (n % 2) + bin;
			n = n / 2;
		}
		return bin;
	}
	
	public static void int2binHL(int H)
	{
		int n = H;
		
		if (n<1)
		{
			return;
		}
		else
		int2binHL (n-1);
			// complete this as revision for recursion ^_^
	}
	
	public static void int2bins ()
	{
		Stack int2bins = new Stack();
		int input;
		do
		{
			input = IBIO.inputInt("Stacking up: ");
			if (input > 0)
			{
				int2bins.push(input);
			}
			int2bins.printStack();
		}
		while (input > 0); 
	}
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("Enter a positive integer: ");
		x = Math.abs(x);
		System.out.printf( "%d is %s in binary (SL algorithm)\n", x, int2binSL(x) );
		System.out.print( x + " is ");
		int2binHL(x);
		
		System.out.println( " in binary (HL algorithm)");
		
		/* HL challenge:
		 * write a method, called int2binS, that uses a stack
		 * in order to calculate the binary equivalent of an
		 * integer. Test it in the main method as well.
		 * The idea is to use a stack (instead of recursion),
		 * to reverse the modulos of 2 and build the binary
		 */
	}
}


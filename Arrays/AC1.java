// Arrays challenge #1

public class AC1
{
	public static void printArray(int[] array)
	{
		for(int element : array) //  traverse/iterate array
		{
			System.out.print( element + " " );
		}
		System.out.println();
	}
	
	public static int[] extremes(int[] array)
	{
		if(array.length == 0)
			return null;
		int[] ext = new int[2];
		ext[0] = array[0];
		ext[1] = array[array.length-1];
		return ext;
	}
	
	public static int[] copy(int[] array)
	{
		int[] clone = new int[array.length];
		for(int i = 0; i < array.length; i++) //  traverse/iterate array
		{
			clone[i] = array[i];
		}
		return clone;
	}
	
	// decrenenting loop version
	public static int[] reverse(int[] array)
	{
		int[] reverse = new int[array.length];
		int c = 0;
		for(int i = array.length-1; i >= 0; i--)
		{
			reverse[c] = array[i];
			c++;
		}
		return reverse;
	}
	
	// alternative version with incrementing loop
	public static int[] reverse2(int[] array)
	{
		int[] reverse = new int[array.length];
		int lastIndex = array.length - 1;
		for(int i = 0; i <= lastIndex; i++)
		{
			reverse[i] = array[lastIndex-i];
		}
		return reverse;
	}
	
	// 6.	Counts the number of odd numbers in the array
	public static int countOdd(int[] array)
	{
		int odds = 0;
		for(int element : array) //  traverse/iterate array
		{
			if(element % 2 != 0)
				odds++;
		}
		return odds;
	}
	
	public static int count(int[] array, int n) // #8
	{
		int counter = 0;
		// your code here
		return counter;
	}
	
	public static void main (String[] args)
	{
		int[] a = { 9,8,7,6,5,4,3,2,7 }; // = new int[SIZE];
		printArray(a);
		int[] b = copy(a);
		printArray(b);
		System.out.println(a);
		System.out.println(b);
		b[b.length-1] = 10;
		printArray(a);
		printArray(b);
		printArray( "Extremes: " + extremes(a) );
		printArray( "Reverse array: " + reverse( a ) );
	}
	
}


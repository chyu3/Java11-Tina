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
	
	public static int[] copy(int[] array)
	{
		int[] clone = new int[array.length];
		for(int i = 0; i < array.length; i++) //  traverse/iterate array
		{
			clone[i] = array[i];
		}
		return clone;
	}
	
	
	
	public static void main (String[] args)
	{
		int[] a = { 9,8,7,6,5,4,3,2,1 }; // = new int[SIZE];
		printArray(a);
		int[] b = copy(a);
		printArray(b);
		System.out.println(a);
		System.out.println(b);
	}
	
}



public class ArrayDemo
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
		System.out.println();
	}
	
	public static void printArrayReverse(int[] a)
	{
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		int[] a = { 1,3,5,7,9,11 };
		int[] b = a; //{ 1,2,3,4,5,6,7 };
		int[] c = new int[a.length];
		System.out.println(a);
		System.out.println(b);
		printArray(a);
		System.out.println(a[0]); // first element
		int lastIndex = a.length-1;
		System.out.println(a[lastIndex]); // last element
		printArrayReverse( a );
		b[b.length-1] = 13;
		System.out.println("\nArray b's last element set to 13");
		System.out.println("\nPrinting arrays array and b");
		printArray( a );
		printArray( b );
		printArray( c );
		
	}
}


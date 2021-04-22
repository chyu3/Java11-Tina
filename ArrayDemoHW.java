
public class ArrayDemoHW
{
	private final static int MAXSIZE = 10;
	private static int lastIndex = 0;
	
	public static boolean isFull()
	{
		return lastIndex == MAXSIZE;
	/*	if (size == MAXSIZE)
	 *		return true;
	 *	else
	 *		return false;
	 */
	}
	
	public static void printArray(int[] a)
	{
		System.out.print( "Start -->");
		for(int i = 0; i < lastIndex; i++)
		{
			System.out.print( "  " + a[i]);
		}
		System.out.printf("\t%d elements in array\n", lastIndex);
	}
	
	public static void add(int[] a, int data)
	{
		if(isFull())
			System.out.println("Error - array full");
		else {
			a[lastIndex] = data;
			lastIndex++;
		}
		printArray(a);
	}
	
	public static int search(int[] a, int data)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == data)
				return i;
		}
		return -1;
	}
	
	public static void remove(int[] a, int data)
	{
		int indexToRemove = search(a, data);
		if( indexToRemove == -1)
		{	System.out.printf("%d not found.\n", data);
		} else {
			for(int i = indexToRemove; i < lastIndex-1; i++)
			{
				a[i] = a[i+1];
			}
			lastIndex--;
			printArray(a);
		}
		
	}	
	
	public static void main(String[] args)
	{
		int[] array = new int[MAXSIZE];
		System.out.println("HELLO");
		ArrayDemo.printArray(array);
		//ArrayDemo.printArray(args);
		int[] a = {1,3,5,7,9,11,2,4,6,8,12};
		for(int x : a)
		{	
			System.out.printf(" >>> Adding %d to array\n", x);
			add(array, x);
		}
		System.out.println("search for 10: " + search(array, 10) );
		System.out.println("search for 11: " + search(array, 11) );
		System.out.println("remove(array, 1):");
		remove(array,1);
		System.out.println("remove(array, 8):");
		remove(array,8);
		System.out.println("remove(array, 11):");
		remove(array,11);
		System.out.println("remove(array, 12):");
		remove(array,12);
	}
}


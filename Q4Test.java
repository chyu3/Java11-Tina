/*
 * Q4Test.java
 * Q42021
 */


public class Q4Test
{
	static int lastIndex = 0;
	
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print( "  " + a[i]);
		}
		System.out.println();
	}
	
	public static String[] clone(String[] a)
	{
		String[] b = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	
			b[i] = a[i];
		}
		return b;
	}
	
	//private final static int MAXSIZE = 10;	
	public static boolean isFull(String[] a)
	{
		return lastIndex == a.length;
	}
	
	public static void bubbleSort(String[] a)
	{
		String temp = "";
		for (int j = 0; j < a.length; j++) 
		{
   	        for (int i = j + 1; i < a.length; i++) 
   	        {
		// comparing adjacent strings
		    if (a[i].compareTo(a[j]) > 0) 
		    {
			   temp = a[j];
			   a[j] = a[i];
			   a[i] = temp;
		    }
	        }System.out.println(a[j]);
	    }
	}
	
	public static void selectionSort(String[] a)
	{
		int smallestIndex = 0;
		while(smallestIndex <= a.length - 1)
		{	int i = smallestIndex;
			String smallest = a[i];
			for(int j = i+1; j < a.length; j++)
			{
				if(a[j].compareTo(smallest) < 0)
				{	i = j;
					smallest = a[j];
				} 
			} 
			a[i] = a[smallestIndex];
			a[smallestIndex]= smallest;
			smallestIndex++;
		} 
	}
	
	
	public static int search(String[] a, String data)
	{
		for(int i = 0; i < lastIndex; i++)
		{
			if(a[i].equals(data) )
				return i;
		}
		return -1;
	}
	
	public static void remove(String[] a, int indexToRemove)
	{
		if( indexToRemove == -1)
		{	
			System.out.printf("%d not found.\n", indexToRemove);
		} 
		else 
		{
			for(int i = indexToRemove; i < lastIndex-1; i++)
			{
				a[i] = a[i+1];
			}
			lastIndex--;
			printArray(a);
		}
	}
	
	public static boolean isSortedAsc(String[] a)
	{
		return false;
	}

	public static boolean isSortedDesc(String[] a)
	{
		return false;
	}
	
	public static int isSorted(String[] a)
	{
		return 0;
	}
	
	public static void removeDuplicates(String[] a)
	{
		int index = 0;
		for (int i =0; i < a.length; i++)
		{
			int j;   
            for (j = 0; j < i; j++)    
            {   
                if (a[i] == a[j])   
                {   
                    break;   
                }   
            }   
            
            if (j == i)    
            {   
                a[index++] = a[i];   
            }       
		}
		//return a;  
	}
	
	public static void insert(String[] a, String data, int index)
	{
		if( isFull(a) == true )
			System.out.println("Error - array full");
		else {
			lastIndex++;
			for(int i = lastIndex-1; i > index; i--)
			{	a[i] = a[i-1];
				printArray(a);
			}
			a[index] = data;
		}
		printArray(a);
	}
	
	public static void insert(String[] a, String element)
	{
		
	}
	
	public static void main (String[] args)
	{
		String[] original = { "Abe", "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale", "Anne" };
		String[] ascending  = clone(original);
		String[] descending = clone(original);
		selectionSort(ascending);
		bubbleSort(descending);
		printArray(original);
		printArray(ascending);
		printArray(descending);
		lastIndex = original.length;
		System.out.println();
		System.out.println("Looking for Lester [-1]: " + search(ascending, "Lester"));
		System.out.println("Looking for anne   [-1]: " + search(ascending, "anne"));
		System.out.println("Looking for Anne   [2] : " + search(ascending, "Anne"));
		System.out.println("\noriginal array sorted [0]: " + isSorted(original));
		System.out.println("ascending array sorted [1]: " + isSorted(ascending));
		System.out.println("descending array sorted [-1]: " + isSorted(descending));
		System.out.println("\nRemoving first element from descending array");
		lastIndex = descending.length;
		remove(descending, 0);
		printArray(descending);
		lastIndex = ascending.length;
		System.out.println("\nRemoving Chuck [4] element from ascending array");
		remove(ascending, 4);
		System.out.println("\nRemoving duplicates from the ascending array");
		removeDuplicates(ascending);
		printArray(ascending);
		System.out.println("\nRemoving duplicates from the original array? ");
		removeDuplicates(original);
		System.out.println();
		System.out.println("Inserting Ivo into descending");
		insert(descending, "Ivo");
		System.out.println("Inserting Ives into ascending");
		insert(ascending, "Ives");
		System.out.println("\nInserting James into ascending");
		insert(ascending, "James");
		printArray(ascending);
		System.out.println("Inserting Aaron into ascending");
		insert(ascending, "Aaron");
		printArray(ascending);
		System.out.println("Inserting Ernesto into ascending");
		insert(ascending, "Ernesto");
		printArray(ascending);
	}
}

/*
 * Q4Test.java
 * Q42021
 */


public class Q4Test
{
	static int lastIndex = 0;
	
	public static void printArray(String[] a)
	{
		
	}
	
	public static String[] clone(String[] a)
	{
		
	}
	
	public static boolean isFull(String[] a)
	{
		
	}
	
	public static void bubbleSort(String[] a)
	{
		
	}
	
	public static void selectionSort(String[] a)
	{
		
	}
	
	
	public static int search(String[] a, String data)
	{
		
	}
	
	public static void remove(String[] a, int indexToRemove)
	{
		
	}
	
	public static boolean isSortedAsc(String[] a)
	{
		
	}

	public static boolean isSortedDesc(String[] a)
	{
		
	}
	
	public static int isSorted(String[] a)
	{
		
	}
	
	public static void removeDuplicates(String[] a)
	{
		
	}
	
	public static void insert(String[] a, String data, int index)
	{
		
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


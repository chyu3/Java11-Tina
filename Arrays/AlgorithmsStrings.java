import java.util.Scanner;
/**
 * @author marcos
 */
public class AlgorithmsStrings
{

	// clone: make a copy of array a, not just refer to it
	public static String[] clone(String[] a)
	{	String[] b = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	b[i] = a[i];
		}
		return b;
	}
	
    public static int searchIndex(String[] a, String key)
    {
        int index = -1;
        for (int i = 0; i < a.length; i++)
        {
            if ( a[i].compareToIgnoreCase(key) == 0 )
            {
                index = i;
                break;
            }
        }
        return index;
    }

	public static boolean isFound(String[] a, String key)
	{
        boolean found = false;
        for (int i = 0; i < a.length; i++)
        {
            if ( a[i].compareToIgnoreCase(key) == 0 )
            {
                found = true;
                break;
            }
        }
        return found;
	}

    public static void list(String[] a, String key)
    {	for(int i = 0; i < a.length; i++)
		{	if( a[i].compareToIgnoreCase(key) == 0 )
			{	System.out.println("> "+ a[i] +" found @ index "+ i);
			}
		}
	}

    public static int count(String[] a, String key)
    {	int count = 0;
		for(int i = 0; i < a.length; i++)
		{	if( a[i].equalsIgnoreCase(key) ) // or a[i].compareToIgnoreCase(key)==0 // 
			{	count++;
			}
		}
		return count;
	}

	public static void printArray(String[] a)
	{	for(int i = 0; i < a.length; i++)
		{	System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(String[] a)
	{	int i = a.length-1; // index of last element in array
		boolean swapped = true; // flag to indicate when a swap is made
		while(swapped==true && i >= 1)// while a swap happens and...
		{	// ..there are elements to compare
			swapped = false; // assume no swaps are needed before
			for(int j = 0; j < i; j++) // each pass
			{	// start from first element until the last unsorted one
				if( a[j].compareTo(a[j+1]) > 0) // if adjacent elements are
				{	String temp = a[j];// not in order,
					a[j] = a[j+1];  // swap them
					a[j+1] = temp;  // signal that we made a swap
					swapped = true; // so we do another pass
				} // if no swap is made in a pass, we are done sorting!
			} // end for (pass)
			i--; // the last i-th item in the array is in its place
		} //while// by the end of the pass, so we skip it
	}


	public static void selectionSort(String[] a)
	{
		int smallestIndex = 0;
		while(smallestIndex <= a.length - 1)
		{	int i = smallestIndex;
			String smallest = a[i];
			for(int j = i+1; j < a.length; j++)
			{
				if(a[j].compareToIgnoreCase(smallest) < 0)
				{	i = j;
					smallest = a[j];
				} // end if
			} // end for
			a[i] = a[smallestIndex];
			a[smallestIndex]= smallest;
			smallestIndex++;
		} // end while
	}

	// alternative version of the selection sort with 2 for loops
	public static void selectionSort2(String[] a)
	{	// for each element in the array...
		for (int i = 0; i < a.length - 1; i++)
		{	int index = i;
			// compare it to the rest of the elements in the array
			for (int j = i + 1; j < a.length; j++)
			{	// find the index of the smallest/smaller element
				if (a[j].compareToIgnoreCase(a[index]) < 0 )
				{	index = j;
				}
			}
			// and swap it
            String smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
	}

    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        String[] original = { "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale" };
        String[] a = clone(original);
        System.out.println("Array size: " + a.length);
        System.out.print("Original Array: ");
        printArray(a);
        System.out.println("\nBubble sort---");
        bubbleSort(a);
        printArray(a);
        a = clone(original); // reset array to original after sort
        System.out.println("\nSelection sort---");
		selectionSort(a);
        printArray(a);
        a = clone(original); // reset array to original after sort
        System.out.println("\nLinear/Sequential Search---");
        System.out.print("Enter an int: ");
        String s = in.nextLine();
        int where = searchIndex(a, s);
        if (where != -1)
        {
            System.out.println(s + " found at index " + where);
        } else
        {
            System.out.println(s + " not found in array");
        }
        list(a, s);
        System.out.println(s + " repeats " + count(a, s) + " times in the array.");
    }

}

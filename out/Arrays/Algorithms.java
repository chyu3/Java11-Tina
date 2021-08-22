import java.util.Scanner;
/**
 * @author marcos
 */
public class Algorithms
{

	// clone: make a copy of array a, not just refer to it
	public static int[] clone(int[] a)
	{	int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{	b[i] = a[i];
		}
		return b;
	}
	
    public static int searchIndex(int[] a, int key)
    {
        int index = -1;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == key)
            {
                index = i;
                break;
            }
        }
        return index;
    }

	public static boolean isFound(int[] a, int key)
	{
        boolean found = false;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == key)
            {
                found = true;
                break;
            }
        }
        return found;
	}

    public static void list(int[] a, int key)
    {	for(int i = 0; i < a.length; i++)
		{	if(a[i] == key)
			{	System.out.println("> "+ a[i] +" found @ index "+ i);
			}
		}
	}

    public static int count(int[] a, int key)
    {	int count = 0;
		for(int i = 0; i < a.length; i++)
		{	if(a[i] == key)
			{	count++;
			}
		}
		return count;
	}

	public static void printArray(int[] a)
	{	for(int i = 0; i < a.length; i++)
		{	System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] a)
	{	int i = a.length-1; // index of last element in array
		boolean swapped = true; // flag to indicate when a swap is made
		while(swapped==true && i >= 1)// while a swap happens and...
		{	// ..there are elements to compare
			swapped = false; // assume no swaps are needed before
			for(int j = 0; j < i; j++) // each pass
			{	// start from first element until the last unsorted one
				if( a[j] > a[j+1] ) // if adjacent elements are
				{	int temp = a[j];// not in order,
					a[j] = a[j+1];  // swap them
					a[j+1] = temp;  // signal that we made a swap
					swapped = true; // so we do another pass
				} // if no swap is made in a pass, we are done sorting!
			} // end for (pass)
			i--; // the last i-th item in the array is in its place
		} //while// by the end of the pass, so we skip it
	}


	public static void selectionSort(int[] a)
	{
		int smallestIndex = 0;
		while(smallestIndex <= a.length - 1)
		{	int i = smallestIndex;
			int smallest = a[i];
			for(int j = i+1; j < a.length; j++)
			{
				if(a[j] < smallest)
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
	public static void selectionSort2(int[] a)
	{	// for each element in the array...
		for (int i = 0; i < a.length - 1; i++)
		{	int index = i;
			// compare it to the rest of the elements in the array
			for (int j = i + 1; j < a.length; j++)
			{	// find the index of the smallest/smaller element
				if (a[j] < a[index])
				{	index = j;
				}
			}
			// and swap it
            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
	}

    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        int[] original = { 1, 7, 5, 6, 9, 3, 5, 0, 7 };
        int[] a = clone(original);
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
        int s = in.nextInt();
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

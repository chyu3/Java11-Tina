/////////////////////////////////////////////////////////
// Simple code to find the second largest element in an /
// unsorted array										/
/////////////////////////////////////////////////////////
public class SecondLargest
{
	public static int secondLargest(int[] array)
	{	// first, we find the largest element:
		int max = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > max)
				max = array[i];
		}
		// now, we find the next larger element that is not the largest
		int secondLargest = array[0];
		if(array[0] == max) // if the first element is the largest,
			secondLargest = array[1]; // start checking from the second
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] != max &&
				array[i] > secondLargest)
					secondLargest = array[i];
		}
		return secondLargest;
	}
	
	public static void main(String[] args)
	{
		int[] numbers1 = { 10, 40, 30, 20, 50 };
		int[] numbers2 = { 25, 143, 89, 13, 105 };
		int[] numbers3 = { 54, 23, 11, 17, 10 };
		System.out.println(secondLargest(numbers1) + "   (40)");
		System.out.println(secondLargest(numbers2) + " (105)");
		System.out.println(secondLargest(numbers3) + "   (23)");
	}
}

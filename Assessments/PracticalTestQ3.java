/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticalTestQ3
{
	// Array size:
	public static int size(double[] array)
	{
		int result = 0; // modify
		// your code goes here
		
		for (int i = 0; array.length > result; i++)
		{
			result++;
		}
		
		return result;
	}
	    /*or
		 * int result = array.length;
		 * return result;
		 */
	
	//------------------------------------------------------------------

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = array[0]; // modify
		// your code goes here
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < minimum)
			minimum = array[i];
		}
		return minimum;
	}
	
	/* or
	 * double minimum = array[0];
	 * for (double x : array)
	 * {
	 * 		if(x < minimum)
	 * 		minimum = x;
	 * }
	 * return minimum;
	 */
	
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = array[0]; // modify
		// your code goes here
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > maximum)
			maximum = array[i];
		}
		return maximum;
	}
	/* or
	 * for (double x : array)
	 * {
	 * 		if(x > maximum)
	 * 		maximum = x;
	 * }
	 * return maximum;
	 */
	
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		// your code goes here
		double range = max(array) - min(array);
		
		return range;
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array, int n)
	{
		double average = 0.0; // modify
		// your code goes here
		for (int i = 0; i < n; i++)
		{
			average += array[i];
		}
		return average/n;
	}
	
	public static double averaget(double[] array, int s)
	{
		double average = 0.0; // modify
		// your code goes here
		for (int i = 0; i < s; i++)
		{
			average += array[i];
		}
		return average/s;
	}
	//------------------------------------------------------------------

	// Mode:
	public static double mode(double array[], int n)
	{
		double maxValue = 0;
		int maxCount = 0, i, j;
		
		// your code goes here
		for (i = 0; i < n; ++i) 
        {
            int count = 0;
            for (j = 0; j < n; ++j) 
            {
                if (array[j] == array[i])
                ++count;
            }

            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = array[i];
            }
        }
		return maxValue;
	}
	
	public static double modet(double array[], int s)
	{
		double maxValue = 0;
		int maxCount = 0, i, j;
		
		// your code goes here
		for (i = 0; i < s; ++i) 
        {
            int count = 0;
            for (j = 0; j < s; ++j) 
            {
                if (array[j] == array[i])
                ++count;
            }

            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = array[i];
            }
        }
		return maxValue;
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array, int n)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		//your code goes here
		if (n % 2 != 0) //check if array has even number of elements
		return (double) array [n / 2];
		return (double) (array [ (n-1) / 2 ] + array[n/2] ) / 2.0;
	}
	
	public static double mediant(double[] array, int s)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		//your code goes here
		if (s % 2 != 0) //check if array has even number of elements
		return (double) array [s / 2];
		return (double) (array [ (s-1) / 2 ] + array[s/2] ) / 2.0;
	}


	public static double formatDouble(double x, int decimals)
	{	
		double result = 0.0; // modify
		// your code goes here
		return result;
	}
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		int n = rainfall.length;
		
		double temperature[] = load("temperature.txt"); // into arrays
		int s = temperature.length;
		
		System.out.println( "\nSingapore Rainfall Statistics: " );
		System.out.println(size(rainfall) + " Measurements " );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average(178.89): " + average(rainfall, n) );
		System.out.println( "Mode    (127.2): " + mode(rainfall, n) );
		System.out.println( "Median  (159.7): " + median(rainfall,n) );

		System.out.println( "\nSingapore Temperature Statistics: " );
		System.out.println(size(temperature) + " Measurements ");
		System.out.println( "Minimum   (25.4): " + min(temperature) );
		System.out.println( "Maximum (29.5): " + max(temperature) );
		System.out.println( "Range   (765.7): " + range(temperature) );
		System.out.println( "Average(27.62565947242208): " + averaget(temperature, s) );
		System.out.println( "Mode    (27.3): " + modet(temperature, s) );
		System.out.println( "Median  (27.7): " + mediant(temperature, s) );
		
		// write the appropriate code to process the temperature array here

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}



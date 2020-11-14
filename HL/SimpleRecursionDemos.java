/*
 * Simple recursion demos
 * mdv last update Oct 2020
 * 
 */


public class SimpleRecursionDemos
{
	
	public static void countDown(int n)
	{
		System.out.print(n + " ");
		if(n < 1)
		{
			return;
		} else {
			countDown(n-1);
		}
		
	}
	
	public static void count(int n)
	{
		if(n < 1)
		{
			return;
		} else {
			count(n-1);
		}
		System.out.print(n + " ");
	}

	
	public static void main (String[] args)
	{
	
		System.out.println("\nCounting DOWN...");
		countDown(10);

		System.out.println("\nCounting...");
		count(10);
		
		System.out.println("\nPor queeeeeeeee");
		System.out.println("Because RECURSION, pues!");
	}
}


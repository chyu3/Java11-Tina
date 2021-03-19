/*
 * ArrayChallenge2.java
 * 
 * Copyright 2021 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

//use system.out.print when using "public static INT" function

public class ArrayChallenge2 {
	
	public static void printArray (int[] array) //print array across
	{
		for(int element : array) 
		{
			System.out.print( element + " " );
		}
		System.out.println();
	}
	
	public static int odd (int[] array) //questio 1
	{
		int odds = 0;
		for(int element : array) 
		{
			if (element % 2 == 1)
				odds++;
		}
		return odds;
	}
	
	public static int[] copy1 (int[] array)
	{
		int[] clone = new int[array.length];
		for(int i = 0; i < array.length; i++) 
		{
			clone[i] = array[i];
		}
		return clone;
	}
	
	public static int secondLargest(int[] array) //question 4
	{
		int max = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > max)
			max = array[i];
		}
		
		//find the largest element != largest
		int secondLargest = array[0];
		if(array[0] == max)
		secondLargest = array[1];
		for (int i = 1; i < array.length; i++)
		{
			if(array[i] != max && array[i] > secondLargest)
			secondLargest = array[i];
		}
		return secondLargest;
	}
	
	
	public static void main (String[] args) {
		int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 7};
		System.out.println("The total odd numbers in this array is: " + odd(array)); 
		System.out.println(secondLargest(array)); 
		
	}
}


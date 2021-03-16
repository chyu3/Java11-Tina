/*
 * ArrayChallenge1.java
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


public class ArrayChallenge1 {
	
	public static void one (int[] one) //prints array downwards
	{
		for (int element : one)
		{
			System.out.println(element + " ");
		}
	}
	
	public static void printArray(int[] array) //prints array across
	{
		for(int element : array) //traverse/iterate array
		{
			System.out.print( element + " " );
		}
		System.out.println();
	}
		
	public static int[] copy1 (int[] one)
	{
		int[] clone = new int[one.length];
		for(int i = 0; i < one.length; i++) 
		{
			clone[i] = one[i];
		}
		return clone;
	}
	
	public static void reverse (int[] one) //reverse the elements of the string
	{
		for(int i = one.length-1; i >= 0; i--)
		{
			System.out.print( one[i] + " " );
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] array = { 9,8,7,6,5,4,3,2,1 };
		System.out.print("1. ");
		printArray(array); //first question
		
		int[] two = copy1(array);
		System.out.print("2. ");
		printArray(two); //second question
		
		System.out.print("3. ");
		reverse(two); //third question
		
		//fourth question
		System.out.println("4. ");
		System.out.println("first element is: " + array[0]); //prints first element
		
		int lastIndex = array.length-1;
		System.out.println("last element is: " + array[lastIndex]); //prints last element
		
		//fifth question
		
	}
}


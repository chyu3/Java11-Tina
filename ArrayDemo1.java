/*
 * ArrayDemo1.java
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


public class ArrayDemo1 {
	public static void printarray (int[] a) //create function for form printed
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(i + ":" + a[i]);
		}
	}
	
	public static void main (String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7}; 
		//2nd option : int[] b = array; //{1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(array);
		//2nd option : System.out.println(b);
		
		printarray(array); //call function and prints
		
		System.out.println("first element = " + array[0]); //prints frist element
		
		int lastIndex = array.length-1;
		System.out.println("last element = " + array[lastIndex]); //prints last element
	}
}


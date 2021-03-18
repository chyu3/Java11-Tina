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

//use system.out.print when using "public static VOID" function

public class ArrayChallenge2 {
	
	public static void printArray (int[] array) //print array across
	{
		for(int element : array) 
		{
			System.out.print( element + " " );
		}
		System.out.println();
	}
	
	public static int odd (int[] array) 
	{
		int odds = 0;
		for(int element : array) 
		{
			if (element % 2 == 1)
				odds++;
		}
		return odds;
	}
	
	
	
	public static void main (String[] args) {
		int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 7};
		System.out.println("The total odd numbers in this array is: " + odd(array)); 
		
	}
}


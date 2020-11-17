/*
 * Programming2.java
 * 
 * Copyright 2020 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
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


public class Programming2 {
	
	public static void main (String[] args) {
		System.out.println("Tina");
		int n = IBIO.inputInt("Calculate up to term(n)?  ");
		if (n < 0)
		{
			IBIO.inputInt("Error-enter a positive number.  ");
		}
		
		int first = 0; 
		int second = 1;
		int third = 1;
		int nth1 = n-2;
		int nth2 = n-1;
		int nth = nth1 + nth2;
		
		System.out.println(first + ";" + second + ";");
		
		while (n < 20)
		{
			System.out.println(nth + ";" + " ");
			nth++;
			
		}	
		
		
		if (n > 20)
		{
			System.out.println(nth);
		}
		
		for (int i = 0; i > 0; i++)
		{
			int sum = 
		}
		double average = sum%n;
		
		System.out.println("Average" + average);
		
		while (n > 0)
		{
			System.out.println("Average" + average);
	}
}


/*
 * Mock02.java
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


public class Mock02 
{
	
	public static void main (String[] args) 
	{
		System.out.println("Tina");
		int first = IBIO.inputInt("How many numbers to process? ");
		
		while (first < 5)
		{
			first = IBIO.inputInt("ERROR-enter a number < 5: ");
		}
		
		int second = 1;
		do
		{
			second = IBIO.inputInt("How many numbers to process? ");
			if(second < 5)
			System.out.println("ERROR-enter a number < 5: ");
		}
		while (second < 5);
		
		int min=0, max=0, freq=0;
		double sum=0;
		
		for (int i = 0; i < second; i++)
		{
			int u = IBIO.inputInt("How many numbers to process?");
		}
	}
}


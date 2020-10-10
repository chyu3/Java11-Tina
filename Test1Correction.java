/*
 * Test1.java
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


public class Test1Correction {
	
	public static void main (String[] args) {
		System.out.println("Tina");
		int s = 0;
		int p = 1;
		int number = IBIO.inputInt("Enter a numer less than 10: ");
		
		while (number >= 10 || number<1)
		{
			System.out.println(">>>Error-invlaid input");
			number = IBIO.inputInt("Enter a number less than 10: ");
		}
		for (int i = 1 ; i <= number; i++)
		{
			s = i*i;
			if (s >= 10)
			{
				System.out.print(i + "  ");
			}
			else 
			{
				System.out.print(i + "  ");
			}
			p = p * number;
			System.out.print(s + "  "); 
			int c = 0;
			int k = 0;
			int t = 0;
			while (c != 1)
			{
				if (p/k >= 1)
				{
					t++;
				}
				else 
				{
					c++;
				}
				k = k * 10;
			}
			int space = 10 - t;
			for ( int j = 1 ; j <= space ; j++ )
			{
				System.out.print(" ");
			}
			System.out.println(p);
		}	
	}
}


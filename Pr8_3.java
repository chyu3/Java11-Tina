/*
 * Pr8_3.java
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


public class Pr8_3 {
	
	public static void main (String[] args) 
	{
		for (int i = 1; i < 100; i++)
		{
			for (int j = i; j < 100; j++)
			{
				for (int k = j; k < 100; k++)
				{
					if (good(i, j) && good(j, k) && good(i, k))
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}
	
	static boolean good (int a, int b)
	{
		int x = a * b + 1;
		int y = (int) (Math.sqrt(x) + .5);
		return (y * y == x);
	}
}


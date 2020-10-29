/*
 * Chapter3Prime.java
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


public class Chapter3Prime {
	
	public static void main (String[] args) {
		int divisor = 1;
		int number = IBIO.inputInt("Enter a number: ");
		
		do
		{
			if (number % divisor == 0)
			{
				System.out.println(divisor);
			}
			divisor++;
		}
		while (divisor != number);
	    System.out.println(number + " " + "is divisible by" + "" + divisor);
	}
}

/* 
 * 
 * Input 7
 * output: 7 is divisible by 7
 * 
 * Input 9
 * output: 9 is divisible by 3
 */

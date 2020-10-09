/*
 * SquaredAndPowers.java
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


public class SquaresAndPowers 
{
	
	public static void main (String[] args) 
	{
		int power;
		int base;
		int number;
		
		IBIO.output("Tina");
		do
		{
			number = 4;
			base = IBIO.inputInt("Enter a number: 4");		
			{
				System.out.println("1");
				System.out.println("2");
				System.out.println("3");
				System.out.println("4");
			}
			
			power = 2;
			base = IBIO.inputInt("Enter a base: ");
			if (base = 1) //squares
			{
				IBIO.out("1");
			}
			else if (base = 2)
			{
				IBIO.out("4");
			}
			else if (base = 3)
			{
				IBIO.out("9");
			}
			else if(base = 4)
			{
				IBIO.out("16");
			}
			else if (number >= 10)
			{
				IBIO.output("Enter a number less than 10: 11");
				IBIO.output(">>>Error-invalid input");
			}
			else if (number 1 >  && number <= 10)
			{
				IBIO.output("Enter a positive number less than 10: 0");
				IBIO.output(">>>Error-invalid input");
			}
		}
		
		System.exit(0);
	}
}


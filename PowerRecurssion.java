/*
 * PowerRecurssion.java
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


public class PowerRecurssion 
{
	
	public static void main (String[] args)
	{
		if (base == 1)
		{
			return 1;
		}
		else if(expo == 0)
		{
			return 1;
		}
		else if(expo == 1)
		{
			return base;
		}
		else
		{
			return base * power(base, expo-1);
		}
	}
	
	static double superPower(int base, int expo)
	{
		if (base == 1)
		{
			return 1;
		}
		else if (expo == 0)
		{
			return 1;
		}
		else if (expo == 1)
		{
			return base;
		}
		else if (expo < 0)
		{
			return 1.0 / power(base, expo * -1);
		}
		else
		{
			return base * power(base, expo-1);
		}		
		
	}
	
	public static void main (String[]args)
	{
		System.out.println( power(2, 10));
		System.out.println( power(0, 0));
		System.out.println( power(1, 100));
		System.out.println( power(99, 1));
		System.out.println( superPower(2, -2));
	}
}


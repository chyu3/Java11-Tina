/*
 * PractiseChallenge.java
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


public class PractiseChallenge {
	
	public static void main (String[] args) 
	{
		System.out.println("Tina");
		int number = IBIO.inputInt("Enter an integer between 1 and 9: ");
		if (number<1 || number>9)
		{
			IBIO.output("Error-number out of range"); 
			IBIO.inputInt("Error-Enter an integer between 1 and 9: ");
		}
		
		int sequence = 0;
		sequence++;
		
		do
		{
			int answer = number * sequence;
			System.out.println(number + " " + "X" + " " + sequence + " " + "=" + " " + answer);
			sequence++;
		}
		while (sequence<=20);
		
		
	}
}


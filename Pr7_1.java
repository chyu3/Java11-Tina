/*
 * Pr7_1.java
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


public class Pr7_1 {
	
	public static void main (String[] args) {
		double n = 1;
		int s = 1;
		for (int i = 0; i < 10; i++)
		{
			n = n * 3.732;
			s = (int)(n * 100); //multiply to get the frist 2 decimal
			
			System.out.println(s/100.0);
		}
		
	}
	
}
/* or
public class Pr7_1 {
	
	public static void main (String[] args) {
		double n = 1;
		for (int i = 0; i < 10; i++)
		{
			n = n * 3.732;
			int s = (int)(n*100);
			System.out.println((double)s/100);
		}
		
	}
	
}
*/

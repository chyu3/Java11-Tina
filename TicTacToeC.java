/*
 * TicTacToeC.java
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


public class TicTacToeC {
	
	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print("|");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("-");
				}
			}
			System.out.println();
        }
	}
		
	public static void checkRows(char[][] b, char player)
	{
		
	}
	
	
	//public static void CheckCols()
	
	//public static void checkD1(
	
	//public static void checkD2(
	
	
	public static void cleanBoard(char[][] a)
	{
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[r].length; c++)
			{
				a[r][c] = '-';
			}
		}
	}
			
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Enter an integer for no. of columns/rows: ");
		char[][] board = new char [n][n];
		cleanBoard(board);
		printBoard(board);
		
		
		
	}
}


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
		
	public static void checkRows(char[][] a, char player)
	{
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[r].length; c++)
			{
				if(a[r][c] != player)
					return false; //player didnt win
			}
		}
		return true; //other wise player wins a row
	}
	
	
	public static void CheckCols(char[][] a, char player)
	{
		for(int c = 0; c < a.length; c++)
		{
			for(int r = 0; r < a[c].length; r++)
			{
				if(a[r][c] != player)
					return false; //player didnt win
			}
		}
		return true; //other wise player wins a column
	}
	
	public static void checkD1(char[][] a, char player)
	{
		for(int r = 0; r
		
		if([a][n-1-b])
	}
	
	public static void checkD2(char[][] a, char player)
	{
		for(int 
		if([a][i])
		
	}
	
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
			
	public static boolean FullBoard(char[][] a)
	{
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[r].length; c++)
			{
				if(a[r][c] == '-')
					return false; //board not full, continues
				
			}
		}
		return true;
	}
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Enter an integer for no. of columns/rows: ");
		char[][] board = new char [n][n];
		cleanBoard(board);
		printBoard(board);
		
		
		
		
		
	}
}


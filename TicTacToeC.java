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
 
/*    0   1   2
 *0 | - | - | - |
 *1 | - | - | - |
 *2 | - | - | - |
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
		
	public static boolean checkRows(char[][] a, char player)
	{
		for(int r = 0; r < a.length; r++)
		{
			for(int c = 0; c < a[r].length; c++)
			{
				if(a[r][c] != player)
					return false; //player didn't win
			}
		}
		return true; //other-wise player wins a row
	}
	
	
	public static boolean checkCols(char[][] a, char player)
	{
		for(int c = 0; c < a.length; c++)
		{
			for(int r = 0; r < a[c].length; r++)
			{
				if(a[r][c] != player)
					return false; //player didn't win
			}
		}
		return true; //other-wise player wins a column
	}
	
	public static boolean checkD1(char[][] a, char player) //increasing diagonal
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i][a.length-1-i] != player)  //02, 11, 20
				return false;
		}
		return true;
	}
	
	public static boolean checkD2(char[][] a, char player) //decreasing diagonal
	{
		for(int i = 0; i < a.length; i++)  //00, 11, 22
		{
			if(a[i][i] != player)
				return false;
		}
		return true;
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
	
	/* public static void printRow(char[][] board, int x)
	{
		for(int i = 0; i < board[x].length; i++)
		{
			System.out.println(board[x][i] + " " );
		}
	}
	
	//public static void printColumn(char[][] board, int y)
	{
		for(int i = 0; i < board.length; i++)
		{
			System.out.println(board[i][y] + " " );
		}
	}
	*/
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("Enter an integer for number of columns/rows: ");
		char[][] board = new char [n][n];
		boolean winner = false;
		
		cleanBoard(board);
		do{
			printBoard(board);
			winner = false;
			if(FullBoard(board) == false)
			{
				char L = IBIO.inputChar("Enter o or x: ");
				int row = IBIO.inputInt("Enter  coordinates for row: ") -1;
				while(row < 0 || row > n-1)
				{
					row = IBIO.inputInt("Error") -1;
				}
				int column = IBIO.inputInt("Enter  coordinates for column: ") -1;
				while(column < 0 || column > n-1)
				{
					column = IBIO.inputInt("Error") -1;
				}
				
				board[row][column] = L;
				
				if(checkRows(board, L) || checkCols(board, L) || checkD1(board, L) || checkD2(board, L))
				{
					System.out.println ( L + "... Wins!");
					winner = true;  //only when anyone check is true
					break;
				}

			}
		} while(FullBoard(board) == false);
		
		if (winner == false)  //
		{
			System.out.println("Tie!");
		}
		
		System.out.println("GameOver!");
	}
}


package memorygame;

import java.util.ArrayList;
import java.util.Scanner;

public class Board extends Memorygame {
	public static int row;
	public static int col;

	public static int[][] board;

	public void size()
	{
		System.out.println("Instructions: (You must follow them if you want to play)");
		System.out.println("Do not input letters. You will be deathed");
		System.out.println("Do not guess the same guess twice. It releases demons that will haunt you forever.");
		Scanner read = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		row = read.nextInt(); //reads the number of rows
		System.out.print("Enter number of columns: ");
		col = read.nextInt(); //reads the number of columns
		do //this do while loop makes sure that the number of rows times the number of columns is even
		{
			if(row%2!=0)
			{
				row = read.nextInt();
				while(col%2==0) 
				{
					col = read.nextInt();
				}
			}
			else
			{
				while(col%2!=0)
				{
					col = read.nextInt();
				}
			}		
		}
		while(row%2!=0 || row%2!=0);
		do //makes sure that the user doesn't put 0 for number of rows or columns
		{
			if(row==0)
			{
				while(row==0)
				{
					System.out.print("Number of rows cannot be 0.  Select another number of rows: ");
					row = read.nextInt();
				}
			}
			if(col==0)
			{
				while(col==0)
				{
					System.out.print("Number of columns cannot be 0.  Select another number of columns: ");
					col = read.nextInt();
				}
			}
		}
		while(row==0 || col==0);
	}	
	public void assign() //creates the board with 2 numbers. Ex. 1,1,2,2,3,3 and assigns it randomly
	{
		board = new int[row][col];
		int row = board.length;
		int col = board[0].length;
		int a = 0;
		int b = 0;
		ArrayList<Integer> set= new ArrayList<Integer>();
		for(int i = 0;i<(row*col)/2;i++) //adds 2 of the same number to an arraylist
		{
			set.add(i+1);
			set.add(i+1);
		}
		while(set.size()>0)
		{
			while(board[a][b]!=0)
			{
				a = (int)(Math.random()*row);
				b = (int)(Math.random()*col);
			}
			board[a][b]=set.remove(0); //then removes the numbers from the arraylist and adds them to the 2D array
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("X ");
			}
			System.out.println("");
		}
	}
}
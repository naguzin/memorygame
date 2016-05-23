package memorygame;

import java.util.Scanner;

public class User extends Memorygame
{
	public static int guess1x;
	public static int guess2x;
	public static int guess1y;
	public static int guess2y;
	
	
	
	
	public void guess1() //first guess method
	{
		int[][] gameboard = Board.board;
		Scanner guess1 = new Scanner(System.in);
		System.out.print("X coordinate of first guess: ");
		do //checks that the guess is less than or equal to the number of rows
		{ 
			guess1x = guess1.nextInt(); 
		}
		while(guess1x > Board.row-1);
		System.out.print("Y corridinate of first guess: ");
		do  //checks that the guess is less than or equal to the number of columns
		{
			guess1y = guess1.nextInt();
		}
		while(guess1y > Board.col-1);
		System.out.println(gameboard[guess1x][guess1y]);
	}
	public void guess2()
	{
		int[][] gameboard = Board.board;
		Scanner guess2 = new Scanner(System.in);
		System.out.print("X coordinate of second guess: ");
		do //checks that the guess is less than or equal to the number of rows
		{
			guess2x = guess2.nextInt();
		}
		while(guess2x > Board.row-1);
		System.out.print("Y corridinate of second guess: ");
		do //checks that the guess is less than or equal to the number of columns
			//also makes sure that you don't guess the same place
		{
			guess2y = guess2.nextInt();
			if(guess1x==guess2x)
			{

				while(guess1y==guess2y)
				{
					System.out.print("You cant select the same point.  Select another Y coordinate");
					guess2y = guess2.nextInt();
				}
			}
			else
			{
				guess2y = guess2.nextInt();
			}
		}
		while(guess2y > Board.col-1);
		System.out.println(gameboard[guess2x][guess2y]);

	}
}

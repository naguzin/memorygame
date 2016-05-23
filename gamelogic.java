package memorygame;

import java.util.Scanner;

public class gamelogic extends User
{
	public boolean gameInProgress=true;
	public boolean guess=true;
	int score=0;
	public void gameRun()
	{
		if(Board.board[guess1x][guess1y]==Board.board[guess2x][guess2y]) //Checks if the guesses are the same
		{
			score++;
			System.out.println("That is a match, your score is: "+ score); //score increments by 1 everytime you guess correctly
			if(score==(Board.row*Board.col)/2)
			{
				System.out.println("You win!"); //prints once the player guesses all the places
				gameInProgress=false;
			}
		}
		else
		{
			System.out.println("That's not right. Guess again"); //prints if the guesses are not the same
		}
	}
	public void game() //runs the game
	{
		while(gameInProgress)
		{
			User newPlayer= new User();
			newPlayer.guess1();
			newPlayer.guess2();
			gameRun();
		}
	}
}



